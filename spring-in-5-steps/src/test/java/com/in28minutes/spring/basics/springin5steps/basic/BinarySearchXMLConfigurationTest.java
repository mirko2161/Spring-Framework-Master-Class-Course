package com.in28minutes.spring.basics.springin5steps.basic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

// load the ApplicationContext for integration tests
@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "/applicationContext.xml") // specifying the context to run via XML
public class BinarySearchXMLConfigurationTest {

    @Autowired
    BinarySearchImpl binarySearch;

    @Test
    public void testBasicScenario() {
        int actualResult = binarySearch.binarySearch(new int[] {}, 5);
        assertEquals(4, actualResult);
    }

}
