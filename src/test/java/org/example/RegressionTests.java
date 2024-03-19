package org.example;

import io.qameta.allure.Epic;
import org.junit.*;

import static org.junit.Assert.assertTrue;

@Epic("Regression tests")
public class RegressionTests {
    @BeforeClass
    public static void beforeClass() {
    }

    @Before
    public void beforeTest() {
    }

    @Test
    public void test_B_001() {
        assertTrue(true);
    }

    @Test
    public void test_B_002() {
        assertTrue(true);
    }

    @Test
    public void test_B_003() {
        assertTrue(true);
    }

    @Test
    public void test_B_004() {
        assertTrue(true);
    }

    @Test
    public void test_B_005() {
        assertTrue(true);
    }

    @After
    public void afterTest() {
    }

    @AfterClass
    public static void afterClass() {
    }
}
