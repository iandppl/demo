package com.example.demo.demo.Static;

import com.example.demo.DemoApplication;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = DemoApplication.class)
public class StaticMainTest {

    @Mock
    StaticMain staticMain;

    @BeforeEach
    void setup(){
        staticMain = new StaticMain();
    }

    @Test
    void testStaticMethodTest(){
        Assertions.assertEquals(0,staticMain.testStaticMethod());
    }

}
