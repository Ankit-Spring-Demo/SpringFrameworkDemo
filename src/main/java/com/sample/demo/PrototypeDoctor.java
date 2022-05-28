package com.sample.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "prototype")
public class PrototypeDoctor {
    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    String doctorName;
    public void assist() {
        System.out.println("PrototypeDoctor is Assisting " + doctorName);
    }

}
