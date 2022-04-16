package com.example.demo.demo.ForLoop;

import java.util.Arrays;
import java.util.List;
import java.util.Timer;

public class ForLoopMethod {

    private final List<String> alphabetIteration = Arrays.asList("ABCDEFGHIJKLMNOP".split(""));

    public void forLoop(boolean isTradition){
        long start = System.nanoTime();
        if(isTradition){
            traditionalForLoop();
        } else {
            streamForLoop();
        }

        long end = System.nanoTime();
        System.out.println(end-start);
    }

    private void traditionalForLoop(){
        for(int i = 0;i<alphabetIteration.size();i++){
            System.out.println(alphabetIteration.get(i));
        }
    }

    private void streamForLoop(){
        alphabetIteration.stream().forEach(alphabet->{
            System.out.println(alphabet);
        });
    }
}
