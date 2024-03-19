package org.example;

import io.qameta.allure.Epic;
import org.junit.*;

import static org.junit.Assert.assertTrue;

@Epic("New functionality tests")
public class NewTests {
    @BeforeClass
    public static void beforeClass() {
    }

    @Before
    public void beforeTest() {
    }

    @Test
    public void test_C_001() {
        assertTrue(true);
    }

    @Test
    public void test_C_002() {
        assertTrue(true);
    }

    @Test
    public void test_C_003() {
        assertTrue(true);
    }

    @Test
    public void test_C_004() {
        assertTrue(true);
    }

    @Test
    public void test_C_005() {
        assertTrue(true);
    }

    @After
    public void afterTest() {
    }

    @AfterClass
    public static void afterClass() {
    }
}
