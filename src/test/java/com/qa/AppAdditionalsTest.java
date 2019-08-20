package com.qa;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */

public class AppAdditionalsTest {
    private AppAdditonals appAdd = new AppAdditonals();


    @Test
    public void test_01() {
        assertEquals(321, DescendingOrder.sortDesc(123));
    }

    @Test
    public void test_02() {
        assertEquals(977766200, DescendingOrder.sortDesc(670276097));
    }

    @Test
    public void test_03() {
        assertEquals(9865210, DescendingOrder.sortDesc(2619805));
    }

    @Test
    public void test_04() {
        assertEquals(98421, DescendingOrder.sortDesc(81294));
    }

    @Test
    public void test_05() {
        assertEquals(987654321, DescendingOrder.sortDesc(123495678));
    }

    @Test
    public void test_06() {
        assertEquals(98421, DescendingOrder.sortDesc(81294));
    }

    @Test
    public void test_07() {
        assertEquals(0000000, DescendingOrder.sortDesc(0000000));
    }

    @Test
    public void test_08() {
        assertEquals(321, DescendingOrder.sortDesc(321));
    }

    @Test
    public void test_09() {
        assertEquals(986420, DescendingOrder.sortDesc(628904));
    }

    @Test
    public void test_10() {
        assertEquals(987653220, DescendingOrder.sortDesc(289327560));
    }
}
