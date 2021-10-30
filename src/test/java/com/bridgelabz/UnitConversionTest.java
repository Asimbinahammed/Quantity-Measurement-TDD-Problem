package com.bridgelabz;

import com.bridglab.UnitConversion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UnitConversionTest {
    @Test
    void given0FeetAnd0Feet_ShouldReturnEqual() {
        UnitConversion feet1 = new UnitConversion(UnitConversion.Unit.FEET, 0.0);
        UnitConversion feet2 = new UnitConversion(UnitConversion.Unit.FEET, 0.0);
        Assertions.assertEquals(feet1, feet2);
    }

    @Test
    void given0FeetAndNullFeet_ShouldReturnNotEqual() {
        UnitConversion feet1 = new UnitConversion(UnitConversion.Unit.FEET, 0.0);
        UnitConversion feet2 = null;
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    void givenReference0FeetAnd1Feet_ShouldReturnNotEqual() {
        UnitConversion feet1 = new UnitConversion(UnitConversion.Unit.FEET, 0.0);
        UnitConversion feet2 = new UnitConversion(UnitConversion.Unit.FEET, 1.0);
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    void givenType0FeetAnd1Feet_ShouldReturnEqual() {
        UnitConversion feet1 = new UnitConversion(UnitConversion.Unit.FEET, 0.0);
        UnitConversion feet2 = new UnitConversion(UnitConversion.Unit.FEET, 1.0);
        Assertions.assertEquals(feet1.getClass(), feet2.getClass());
    }

    @Test
    void givenValue0FeetAnd1Feet_ShouldReturnNotEqual() {
        UnitConversion feet1 = new UnitConversion(UnitConversion.Unit.FEET, 0.0);
        UnitConversion feet2 = new UnitConversion(UnitConversion.Unit.FEET, 1.0);
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    void given0InchAnd0Inch_ShouldReturnEqual() {
        UnitConversion inch1 = new UnitConversion(UnitConversion.Unit.INCH, 0.0);
        UnitConversion inch2 = new UnitConversion(UnitConversion.Unit.INCH, 0.0);
        Assertions.assertEquals(inch1, inch2);
    }

    @Test
    void given0InchAndNullInch_ShouldReturnNotEqual() {
        UnitConversion inch1 = new UnitConversion(UnitConversion.Unit.INCH, 0.0);
        UnitConversion inch2 = null;
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    void givenReference0InchAnd1Inch_ShouldReturnNotEqual() {
        UnitConversion inch1 = new UnitConversion(UnitConversion.Unit.INCH, 0.0);
        UnitConversion inch2 = new UnitConversion(UnitConversion.Unit.INCH, 1.0);
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    void givenType0InchAnd1Inch_ShouldReturnEqual() {
        UnitConversion inch1 = new UnitConversion(UnitConversion.Unit.INCH, 0.0);
        UnitConversion inch2 = new UnitConversion(UnitConversion.Unit.INCH, 1.0);
        Assertions.assertEquals(inch1.getClass(), inch2.getClass());
    }

    @Test
    void givenValue0InchAnd1Inch_ShouldReturnNotEqual() {
        UnitConversion inch1 = new UnitConversion(UnitConversion.Unit.INCH, 0.0);
        UnitConversion inch2 = new UnitConversion(UnitConversion.Unit.INCH, 1.0);
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    void given1FeetAnd1Inch_WhenCompared_ShouldReturnNotEqual() {
        UnitConversion feet = new UnitConversion(UnitConversion.Unit.FEET, 1.0);
        UnitConversion inch = new UnitConversion(UnitConversion.Unit.INCH, 1.0);
        boolean compareCheck = feet.compare(inch);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    void given0FeetAnd0Inch_WhenCompared_ShouldReturnEqualUnitConversion() {
        UnitConversion feet = new UnitConversion(UnitConversion.Unit.FEET, 0.0);
        UnitConversion inch = new UnitConversion(UnitConversion.Unit.INCH, 0.0);
        boolean compareCheck = feet.compare(inch);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1InchAnd1Feet_WhenCompared_ShouldReturnNotEqualUnitConversion() {
        UnitConversion inch = new UnitConversion(UnitConversion.Unit.INCH, 1.0);
        UnitConversion feet = new UnitConversion(UnitConversion.Unit.FEET, 1.0);
        boolean compareCheck = inch.compare(feet);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    void given1FeetAnd1Feet_WhenCompared_ShouldReturnEqualUnitConversion() {
        UnitConversion feet1 = new UnitConversion(UnitConversion.Unit.FEET, 1.0);
        UnitConversion feet2 = new UnitConversion(UnitConversion.Unit.FEET, 1.0);
        boolean compareCheck = feet1.compare(feet2);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1InchAnd1Inch_WhenCompared_ShouldReturnEqualUnitConversion() {
        UnitConversion inch1 = new UnitConversion(UnitConversion.Unit.INCH, 1.0);
        UnitConversion inch2 = new UnitConversion(UnitConversion.Unit.INCH, 1.0);
        boolean compareCheck = inch1.compare(inch2);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1FeetAnd12Inch_WhenCompared_ShouldReturnEqualUnitConversion() {
        UnitConversion feet = new UnitConversion(UnitConversion.Unit.FEET, 1.0);
        UnitConversion inch = new UnitConversion(UnitConversion.Unit.INCH, 12.0);
        boolean compareCheck = feet.compare(inch);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given12InchAnd1Feet_WhenCompared_ShouldReturnEqualUnitConversion() {
        UnitConversion inch = new UnitConversion(UnitConversion.Unit.INCH, 12.0);
        UnitConversion feet = new UnitConversion(UnitConversion.Unit.FEET, 1.0);
        boolean compareCheck = inch.compare(feet);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given0YardAnd0Yard_ShouldReturnEqual() {
        UnitConversion yard1 = new UnitConversion(UnitConversion.Unit.YARD, 0.0);
        UnitConversion yard2 = new UnitConversion(UnitConversion.Unit.YARD, 0.0);
        Assertions.assertEquals(yard1, yard2);
    }

    @Test
    void givenValue0YardAnd1Yard_ShouldReturnNotEqual() {
        UnitConversion yard1 = new UnitConversion(UnitConversion.Unit.YARD, 0.0);
        UnitConversion yard2 = new UnitConversion(UnitConversion.Unit.YARD, 1.0);
        Assertions.assertNotEquals(yard1, yard2);
    }

    @Test
    void given0YardAndNullYard_ShouldReturnNotEqual() {
        UnitConversion yard1 = new UnitConversion(UnitConversion.Unit.YARD, 0.0);
        UnitConversion yard2 = null;
        Assertions.assertNotEquals(yard1, yard2);
    }

    @Test
    void givenReference0YardAnd1Yard_ShouldReturnNotEqual() {
        UnitConversion yard1 = new UnitConversion(UnitConversion.Unit.YARD, 0.0);
        UnitConversion yard2 = new UnitConversion(UnitConversion.Unit.YARD, 1.0);
        Assertions.assertNotEquals(yard1, yard2);
    }

    @Test
    void givenType0YardAnd1Yard_ShouldReturnEqual() {
        UnitConversion yard1 = new UnitConversion(UnitConversion.Unit.YARD, 0.0);
        UnitConversion yard2 = new UnitConversion(UnitConversion.Unit.YARD, 1.0);
        Assertions.assertEquals(yard1.getClass(), yard2.getClass());
    }

    @Test
    void given3FeetAnd1Yard_WhenCompared_ShouldReturnEqualUnitConversion() {
        UnitConversion feet = new UnitConversion(UnitConversion.Unit.FEET, 3.0);
        UnitConversion yard = new UnitConversion(UnitConversion.Unit.YARD, 1.0);
        boolean compareCheck = feet.compare(yard);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1FeetAnd1Yard_WhenCompared_ShouldReturnNotEqualUnitConversion() {
        UnitConversion feet = new UnitConversion(UnitConversion.Unit.FEET, 1.0);
        UnitConversion yard = new UnitConversion(UnitConversion.Unit.YARD, 1.0);
        boolean compareCheck = feet.compare(yard);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    void given1InchAnd1Yard_WhenCompared_ShouldReturnNotEqualUnitConversion() {
        UnitConversion inch = new UnitConversion(UnitConversion.Unit.INCH, 1.0);
        UnitConversion yard = new UnitConversion(UnitConversion.Unit.YARD, 1.0);
        boolean compareCheck = inch.compare(yard);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    void given36InchAnd1Yard_WhenCompared_ShouldReturnEqualUnitConversion() {
        UnitConversion inch = new UnitConversion(UnitConversion.Unit.INCH, 36.0);
        UnitConversion yard = new UnitConversion(UnitConversion.Unit.YARD, 1.0);
        boolean compareCheck = inch.compare(yard);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1YardAnd36Inch_WhenCompared_ShouldReturnEqualUnitConversion() {
        UnitConversion yard = new UnitConversion(UnitConversion.Unit.YARD, 1.0);
        UnitConversion inch = new UnitConversion(UnitConversion.Unit.INCH, 36.0);
        boolean compareCheck = yard.compare(inch);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1YardAnd3Feet_WhenCompared_ShouldReturnEqualUnitConversion() {
        UnitConversion yard = new UnitConversion(UnitConversion.Unit.YARD, 1.0);
        UnitConversion feet = new UnitConversion(UnitConversion.Unit.FEET, 3.0);
        boolean compareCheck = yard.compare(feet);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given0CentimeterAnd0Centimeter_ShouldReturnEqual() {
        UnitConversion centimeter1 = new UnitConversion(UnitConversion.Unit.CENTIMETER, 0.0);
        UnitConversion centimeter2 = new UnitConversion(UnitConversion.Unit.CENTIMETER, 0.0);
        Assertions.assertEquals(centimeter1, centimeter2);
    }

    @Test
    void givenValue0CentimeterAnd1Centimeter_ShouldReturnNotEqual() {
        UnitConversion centimeter1 = new UnitConversion(UnitConversion.Unit.CENTIMETER, 0.0);
        UnitConversion centimeter2 = new UnitConversion(UnitConversion.Unit.CENTIMETER, 1.0);
        Assertions.assertNotEquals(centimeter1, centimeter2);
    }

    @Test
    void given0CentimeterAndNullCentimeter_ShouldReturnNotEqual() {
        UnitConversion centimeter1 = new UnitConversion(UnitConversion.Unit.CENTIMETER, 0.0);
        UnitConversion centimeter2 = null;
        Assertions.assertNotEquals(centimeter1, centimeter2);
    }

    @Test
    void givenReference0CentimeterAnd1Centimeter_ShouldReturnNotEqual() {
        UnitConversion centimeter1 = new UnitConversion(UnitConversion.Unit.CENTIMETER, 0.0);
        UnitConversion centimeter2 = new UnitConversion(UnitConversion.Unit.CENTIMETER, 1.0);
        Assertions.assertNotEquals(centimeter1, centimeter2);
    }

    @Test
    void givenType0CentimeterAnd1Centimeter_ShouldReturnEqual() {
        UnitConversion centimeter1 = new UnitConversion(UnitConversion.Unit.CENTIMETER, 0.0);
        UnitConversion centimeter2 = new UnitConversion(UnitConversion.Unit.CENTIMETER, 1.0);
        Assertions.assertEquals(centimeter1.getClass(), centimeter2.getClass());
    }

    @Test
    void given2InchAnd5Centimeter_WhenCompared_ShouldReturnEqualUnitConversion() {
        UnitConversion inch = new UnitConversion(UnitConversion.Unit.INCH, 2.0);
        UnitConversion centimeter = new UnitConversion(UnitConversion.Unit.CENTIMETER, 5.0);
        boolean compareCheck = inch.compare(centimeter);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given5CentimeterAnd2Inch_WhenCompared_ShouldReturnEqualUnitConversion() {
        UnitConversion centimeter = new UnitConversion(UnitConversion.Unit.CENTIMETER, 5.0);
        UnitConversion inch = new UnitConversion(UnitConversion.Unit.INCH, 2.0);
        boolean compareCheck = centimeter.compare(inch);
        Assertions.assertTrue(compareCheck);
    }
}
