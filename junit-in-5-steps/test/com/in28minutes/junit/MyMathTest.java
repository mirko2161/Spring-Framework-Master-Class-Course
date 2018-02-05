package com.in28minutes.junit;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyMathTest {

    MyMath myMath = new MyMath();

    @BeforeEach
    public void before() {
        System.out.println("Before");
    }

    @BeforeAll
    public static void beforeClass() {
        System.out.println("Before class");
    }

    @Test
    void sum_with3numbers() {
        System.out.println("Test1");
        assertEquals(6, myMath.sum(new int[] { 1, 2, 3 }));
    }

    @Test
    void sum_with1numbers() {
        System.out.println("Test2");
        assertEquals(3, myMath.sum(new int[] { 3 }));
    }

    @AfterEach
    public void after() {
        System.out.println("After");
    }

    @AfterAll
    public static void afterClass() {
        System.out.println("After class");
    }

}
