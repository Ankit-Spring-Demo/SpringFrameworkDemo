package com.sample.demo;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class DoctorBeanNameAware implements BeanNameAware {
    public DoctorBeanNameAware() {
        System.out.println("Constructor Called");
        constructorAssist();
    }

    public void assist() {
        System.out.println("Doctor is Assisting ");
    }

    public void constructorAssist() {
        System.out.println("Doctor is constructorAssist ");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("BeanNameAware Called");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("postConstruct Called");
    }
}
