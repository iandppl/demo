package com.example.demo.demo.Static;

import org.springframework.beans.factory.annotation.Autowired;

public class StaticMain {

    public int testStaticMethod(){
        return StaticClassTest.getNumberOfCars();
    }
}
