package com.example.demo.demo.ForLoop;

import com.example.demo.DemoApplication;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = DemoApplication.class)
public class ForLoopMethodTest {
    @Mock
    ForLoopMethod forLoopMethod;

    @BeforeEach
    void setup(){
        forLoopMethod = new ForLoopMethod();
    }

    @Test
    void traditionalForLoopTiming(){
        forLoopMethod.forLoop(true);
    }

    @Test
    void streamForLoopTiming(){
        forLoopMethod.forLoop(false);
    }
}
