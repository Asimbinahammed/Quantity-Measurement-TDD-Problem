package com.bridgelabz;

import com.bridglab.UnitConversion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UnitConversionTest {
    UnitConversion unitConversion =new UnitConversion();

    @Test
    public void whenGivenWrongFeetValueShouldFailTest() {
        Assertions.assertEquals(unitConversion.feetDeclare(0),unitConversion.feetDeclare(1));
    }

    @Test
    public void whenGivenRightFeetValueShouldPassTest() {
        Assertions.assertEquals(unitConversion.feetDeclare(0),unitConversion.feetDeclare(0));
    }

    @Test
    public void whenGivenNullValueShouldFailTest() {
        Assertions.assertEquals(unitConversion.feetDeclare(null),unitConversion.feetDeclare(1));
    }

    @Test
    public void whenGivenNullValueShouldPassTest() {
        Assertions.assertEquals(unitConversion.feetDeclare(null),unitConversion.feetDeclare(null));
    }
}
