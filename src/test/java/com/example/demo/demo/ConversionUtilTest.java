package com.example.demo.demo;

import com.example.demo.DemoApplication;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = DemoApplication.class)
public class ConversionUtilTest {

    @Mock
    ConversionUtil conversionUtil;

    @BeforeEach
    void setup(){
        conversionUtil = new ConversionUtil();
    }

    @Test
    void convertFirstRomanNumeralToOneTest(){
        Assertions.assertEquals(1,conversionUtil.convertRomanNumerialsToNumber("I"));
    }

    @Test
    void convertSecondRomanNumeralToTwoTest(){
        Assertions.assertEquals(2,conversionUtil.convertRomanNumerialsToNumber("II"));
    }

    @Test
    void convertThirdRomanNumeralToThreeTest(){
        Assertions.assertEquals(3,conversionUtil.convertRomanNumerialsToNumber("III"));
    }

    @Test
    void convertFifthRomanNumeralToFiveTest(){
        Assertions.assertEquals(5,conversionUtil.convertRomanNumerialsToNumber("V"));
    }

    @Test
    void convertFourthRomanNumeralToFourTest(){
        Assertions.assertEquals(4,conversionUtil.convertRomanNumerialsToNumber("IV"));
    }

    @Test
    void convertNinthRomanNumeralToNineTest(){
        Assertions.assertEquals(9,conversionUtil.convertRomanNumerialsToNumber("IX"));
    }

    @Test
    void convertTwentyFourthRomanNumeralToTwentyFourTest(){
        Assertions.assertEquals(24,conversionUtil.convertRomanNumerialsToNumber("XXIV"));
    }
}
