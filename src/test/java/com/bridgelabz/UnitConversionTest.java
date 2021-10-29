package com.bridgelabz;

import com.bridglab.UnitConversion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UnitConversionTest {
    UnitConversion unitConversion =new UnitConversion();

    /**
     * Checking same different feet retuns false
     */
    @Test
    public void whenGivenWrongFeetValueShouldFailTest() {
        Assertions.assertEquals(unitConversion.feetDeclare(0),1);
    }

    /**
     * Checking same vlue of fee returns true
     */
    @Test
    public void whenGivenRightFeetValueShouldPassTest() {
        Assertions.assertEquals(unitConversion.feetDeclare(0),0);
    }

    /**
     * Checkingone null value with normal value
     */
    @Test
    public void whenGivenNullValueShouldFailTest() {
        Assertions.assertEquals(unitConversion.feetDeclare(null),1);
    }

    /*
    checking null value of feet with null value
     */
    @Test
    public void whenGivenNullValueShouldPassTest() {
        Assertions.assertEquals(unitConversion.feetDeclare(null),null);
    }

    /**
     * Checking int value with double value
     */
    @Test
    public void whenGivenIntValueAndDoubleValueShouldFailTest() {
        Assertions.assertEquals(unitConversion.feetDeclare(1.0),1);
    }

    /**
     * Checking double value with double value
     */
    @Test
    public void whenGivenDoubleValueAndDoubleValueShouldPassTest() {
        Assertions.assertEquals(unitConversion.feetDeclare(1.0),1.0);
    }

    /**
     * Checking value with another value
     */
    @Test
    public void whenGivenValueAndDifferentValueShouldFailTest() {
        Assertions.assertEquals(unitConversion.feetDeclare(1.0),4.6);
    }

    /**
     * Checking value with same value
     */
    @Test
    public void whenGivenValueAndSameValueShouldPassTest() {
        Assertions.assertEquals(unitConversion.feetDeclare(1.5),1.5);
    }
}
