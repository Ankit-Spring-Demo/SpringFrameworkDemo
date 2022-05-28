package com.sample.demo;

import org.springframework.stereotype.Component;

@Component
public class Doctor {
    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    String doctorName;
    public void assist() {
        System.out.println("Doctor is Assisting " + doctorName);
    }

}
