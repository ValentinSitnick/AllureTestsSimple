package org.example;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.junit4.DisplayName;
import org.junit.*;

import static org.junit.Assert.assertTrue;

@Epic("Smoke tests")
public class SmokeTests {
    @BeforeClass
    public static void beforeClass() {
    }

    @Before
    public void beforeTest() {
    }

    @Test
    @Severity(SeverityLevel.BLOCKER)
    @Description("First test for testing some important")
    public void test_A_001() {
        System.err.println("------------ First Test ------------------");
        assertTrue(true);
    }

    @Test
    @Severity(SeverityLevel.BLOCKER)
    @Description("Second test for testing some important")
    public void test_A_002() {
        assertTrue(true);
    }

    @Test
    @Severity(SeverityLevel.BLOCKER)
    @Description("Third test for testing some important")
    public void test_A_003() {
        assertTrue(true);
    }

    @Test
    @Severity(SeverityLevel.BLOCKER)
    @Description("Fourth test for testing some important")
    public void test_A_004() {
        assertTrue(true);
    }

    @Test
    @Severity(SeverityLevel.BLOCKER)
    @Description("Fifth test for testing some important")
    @DisplayName("Сценарий для проверки чего-нибудь")
    public void test_A_005() {
        assertTrue(true);
    }

    @After
    public void afterTest() {
    }

    @AfterClass
    public static void afterClass() {
    }
}
