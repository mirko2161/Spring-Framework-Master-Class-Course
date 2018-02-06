package com.in28minutes.spring.basics.springin5steps.cdi;

import javax.inject.Named;

@Named
public class SomeCDIDAO {

    public int[] getData() { // talking to the DB
        return new int[] { 5, 89, 100 };
    }

}
