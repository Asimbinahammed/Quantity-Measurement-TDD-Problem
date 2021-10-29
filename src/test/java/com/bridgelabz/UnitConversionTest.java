package com.bridgelabz;

import com.bridglab.UnitConversion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UnitConversionTest {
    UnitConversion unitConversion =new UnitConversion();

    //feet testcases
    /**
     * Checking same different feet retuns false
     */
    @Test
    public void whenGivenWrongFeetValueShouldFailTest() {
        Assertions.assertEquals(unitConversion.feetAndInchDeclare(0.0),1);
    }

    /**
     * Checking same value of fee returns true
     */
    @Test
    public void whenGivenRightFeetValueShouldPassTest() {
        Assertions.assertEquals(unitConversion.feetAndInchDeclare(0),0);
    }

    /**
     * Checking one null value with normal value
     */
    @Test
    public void whenGivenNullValueShouldFailTest() {
        Assertions.assertEquals(unitConversion.feetAndInchDeclare(null),1);
    }

    /*
    checking null value of feet with null value
     */
    @Test
    public void whenGivenNullValueShouldPassTest() {
        Assertions.assertEquals(unitConversion.feetAndInchDeclare(null),null);
    }

    /**
     * Checking int value with double value
     */
    @Test
    public void whenGivenIntValueAndDoubleValueShouldFailTest() {
        Assertions.assertEquals(unitConversion.feetAndInchDeclare(1.0),1);
    }

    /**
     * Checking double value with double value
     */
    @Test
    public void whenGivenDoubleValueAndDoubleValueShouldPassTest() {
        Assertions.assertEquals(unitConversion.feetAndInchDeclare(1.0),1.0);
    }

    /**
     * Checking value with another value
     */
    @Test
    public void whenGivenValueAndDifferentValueShouldFailTest() {
        Assertions.assertEquals(unitConversion.feetAndInchDeclare(1.0),4.6);
    }

    /**
     * Checking value with same value
     */
    @Test
    public void whenGivenValueAndSameValueShouldPassTest() {
        Assertions.assertEquals(unitConversion.feetAndInchDeclare(1.5),1.5);
    }

    //Inch testcases
    /**
     * Checking one null value with normal value
     */
    @Test
    public void whenGivenNullInchValueShouldFailTest() {
        Assertions.assertEquals(unitConversion.feetAndInchDeclare(null),1);
    }

    /*
    checking null value of feet with null value
     */
    @Test
    public void whenGivenNullInchValueShouldPassTest() {
        Assertions.assertEquals(unitConversion.feetAndInchDeclare(null),null);
    }

    /**
     * Checking int value with double value
     */
    @Test
    public void whenGivenInchIntValueAndDoubleValueShouldFailTest() {
        Assertions.assertEquals(unitConversion.feetAndInchDeclare(1.0),1);
    }

    /**
     * Checking double value with double value
     */
    @Test
    public void whenGivenInchDoubleValueAndDoubleValueShouldPassTest() {
        Assertions.assertEquals(unitConversion.feetAndInchDeclare(1.0),1.0);
    }

    /**
     * Checking value with another value
     */
    @Test
    public void whenGivenInchValueAndDifferentValueShouldFailTest() {
        Assertions.assertEquals(unitConversion.feetAndInchDeclare(1.0),4.6);
    }

    /**
     * Checking value with same value
     */
    @Test
    public void whenGivenInchValueAndSameValueShouldPassTest() {
        Assertions.assertEquals(unitConversion.feetAndInchDeclare(1.5),1.5);
    }

    //Testing conversions
    /**
     * Checking 3 feet equals 1 yard
     */
    @Test
    public void testingThreeFeetEqualsOneYardReturnPass(){
        Double res=unitConversion.feetIntoYard(3);
        Assertions.assertEquals(res,1);
    }

    /**
     * Checking 1 feet equals 1 yard
     */
    @Test
    public void testingOneFeetEqualsOneYardReturnFail(){
        Double res=unitConversion.feetIntoYard(1);
        Assertions.assertEquals(res,1);
    }

    /**
     * Checking 1 inch equals 1 yard
     */
    @Test
    public void testingOneInchEqualsOneYardReturnFail(){
        Double res=unitConversion.inchIntoFeet(1);
        Double result=unitConversion.feetIntoYard(res);
        Assertions.assertEquals(result,1);
    }

    /**
     * Checking 1 yard equals 36 inch
     */
    @Test
    public void testingOneYardEqualsThirtySixInchReturnPass(){
        Double res=unitConversion.yardIntoFeet(1);
        Double result=unitConversion.feetIntoInch(res);
        Assertions.assertEquals(result,36);
    }

    /**
     * Checking 36 inch equals 1 yard
     */
    @Test
    public void testingThirtySixInchEqualsoneyardReturnPass(){
        Double res=unitConversion.inchIntoFeet(36);
        Double result=unitConversion.feetIntoYard(res);
        Assertions.assertEquals(result,1);
    }
}
