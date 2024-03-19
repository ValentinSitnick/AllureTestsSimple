package org.example;

import io.qameta.allure.*;
import io.qameta.allure.junit4.DisplayName;
import org.junit.*;

import static org.junit.Assert.assertTrue;

@Epic("Tests for bugfixes")
public class FixTests {
    @BeforeClass
    public static void beforeClass() {
    }

    @Before
    public void beforeTest() {
    }

    @Test
    @DisplayName("Tests for BF STS-99999")
    @Description("BF: check that something works fine")
    @Issue("STS-99999")
    public void test_D_001() {
        assertTrue(true);
    }

    @Test
    public void test_D_002() {
        assertTrue(true);
    }

    @Test
    public void test_D_003() {
        assertTrue(true);
    }

    @Test
    public void test_D_004() {
        assertTrue(true);
    }

    @Test
    public void test_D_005() {
        assertTrue(true);
    }

    @After
    public void afterTest() {
    }

    @AfterClass
    public static void afterClass() {
    }
}
