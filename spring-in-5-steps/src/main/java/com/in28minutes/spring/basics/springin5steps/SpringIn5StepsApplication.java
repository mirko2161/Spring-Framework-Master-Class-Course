package com.in28minutes.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication // Automatically scans the package and it's subpackages
public class SpringIn5StepsApplication {

    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsApplication.class, args);
        BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
        BinarySearchImpl binarySearch2 = applicationContext.getBean(BinarySearchImpl.class);

        System.out.println(binarySearch); // by default same objects
        System.out.println(binarySearch2);

        int result = binarySearch.binarySearch(new int[] { 12, 4, 6 }, 3);
        System.out.println(result);

    }

}
