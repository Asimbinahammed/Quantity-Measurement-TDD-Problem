package com.bridgelabz;

import com.bridglab.Length;
import com.bridglab.UnitConversion;
import com.bridglab.Volume;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConversionTest {
    @Test
    void given0FeetAnd0Feet_ShouldReturnEqual() {
        UnitConversion feet1 = new UnitConversion(Length.FEET, 0.0);
        UnitConversion feet2 = new UnitConversion(Length.FEET, 0.0);
        Assertions.assertEquals(feet1, feet2);
    }

    @Test
    void given0FeetAndNullFeet_ShouldReturnNotEqual() {
        UnitConversion feet1 = new UnitConversion(Length.FEET, 0.0);
        UnitConversion feet2 = null;
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    void givenReference0FeetAnd1Feet_ShouldReturnNotEqual() {
        UnitConversion feet1 = new UnitConversion(Length.FEET, 0.0);
        UnitConversion feet2 = new UnitConversion(Length.FEET, 1.0);
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    void givenType0FeetAnd1Feet_ShouldReturnEqual() {
        UnitConversion feet1 = new UnitConversion(Length.FEET, 0.0);
        UnitConversion feet2 = new UnitConversion(Length.FEET, 1.0);
        Assertions.assertEquals(feet1.getClass(), feet2.getClass());
    }

    @Test
    void givenValue0FeetAnd1Feet_ShouldReturnNotEqual() {
        UnitConversion feet1 = new UnitConversion(Length.FEET, 0.0);
        UnitConversion feet2 = new UnitConversion(Length.FEET, 1.0);
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    void given0InchAnd0Inch_ShouldReturnEqual() {
        UnitConversion inch1 = new UnitConversion(Length.INCH, 0.0);
        UnitConversion inch2 = new UnitConversion(Length.INCH, 0.0);
        Assertions.assertEquals(inch1, inch2);
    }

    @Test
    void given0InchAndNullInch_ShouldReturnNotEqual() {
        UnitConversion inch1 = new UnitConversion(Length.INCH, 0.0);
        UnitConversion inch2 = null;
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    void givenReference0InchAnd1Inch_ShouldReturnNotEqual() {
        UnitConversion inch1 = new UnitConversion(Length.INCH, 0.0);
        UnitConversion inch2 = new UnitConversion(Length.INCH, 1.0);
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    void givenType0InchAnd1Inch_ShouldReturnEqual() {
        UnitConversion inch1 = new UnitConversion(Length.INCH, 0.0);
        UnitConversion inch2 = new UnitConversion(Length.INCH, 1.0);
        Assertions.assertEquals(inch1.getClass(), inch2.getClass());
    }

    @Test
    void givenValue0InchAnd1Inch_ShouldReturnNotEqual() {
        UnitConversion inch1 = new UnitConversion(Length.INCH, 0.0);
        UnitConversion inch2 = new UnitConversion(Length.INCH, 1.0);
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    void given1FeetAnd1Inch_WhenCompared_ShouldReturnNotEqual() {
        UnitConversion feet = new UnitConversion(Length.FEET, 1.0);
        UnitConversion inch = new UnitConversion(Length.INCH, 1.0);
        boolean compareCheck = feet.compare(inch);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    void given0FeetAnd0Inch_WhenCompared_ShouldReturnEqualUnitConversion() {
        UnitConversion feet = new UnitConversion(Length.FEET, 0.0);
        UnitConversion inch = new UnitConversion(Length.INCH, 0.0);
        boolean compareCheck = feet.compare(inch);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1InchAnd1Feet_WhenCompared_ShouldReturnNotEqualUnitConversion() {
        UnitConversion inch = new UnitConversion(Length.INCH, 1.0);
        UnitConversion feet = new UnitConversion(Length.FEET, 1.0);
        boolean compareCheck = inch.compare(feet);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    void given1FeetAnd1Feet_WhenCompared_ShouldReturnEqualUnitConversion() {
        UnitConversion feet1 = new UnitConversion(Length.FEET, 1.0);
        UnitConversion feet2 = new UnitConversion(Length.FEET, 1.0);
        boolean compareCheck = feet1.compare(feet2);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1InchAnd1Inch_WhenCompared_ShouldReturnEqualUnitConversion() {
        UnitConversion inch1 = new UnitConversion(Length.INCH, 1.0);
        UnitConversion inch2 = new UnitConversion(Length.INCH, 1.0);
        boolean compareCheck = inch1.compare(inch2);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1FeetAnd12Inch_WhenCompared_ShouldReturnEqualUnitConversion() {
        UnitConversion feet = new UnitConversion(Length.FEET, 1.0);
        UnitConversion inch = new UnitConversion(Length.INCH, 12.0);
        boolean compareCheck = feet.compare(inch);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given12InchAnd1Feet_WhenCompared_ShouldReturnEqualUnitConversion() {
        UnitConversion inch = new UnitConversion(Length.INCH, 12.0);
        UnitConversion feet = new UnitConversion(Length.FEET, 1.0);
        boolean compareCheck = inch.compare(feet);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given0YardAnd0Yard_ShouldReturnEqual() {
        UnitConversion yard1 = new UnitConversion(Length.YARD, 0.0);
        UnitConversion yard2 = new UnitConversion(Length.YARD, 0.0);
        Assertions.assertEquals(yard1, yard2);
    }

    @Test
    void givenValue0YardAnd1Yard_ShouldReturnNotEqual() {
        UnitConversion yard1 = new UnitConversion(Length.YARD, 0.0);
        UnitConversion yard2 = new UnitConversion(Length.YARD, 1.0);
        Assertions.assertNotEquals(yard1, yard2);
    }

    @Test
    void given0YardAndNullYard_ShouldReturnNotEqual() {
        UnitConversion yard1 = new UnitConversion(Length.YARD, 0.0);
        UnitConversion yard2 = null;
        Assertions.assertNotEquals(yard1, yard2);
    }

    @Test
    void givenReference0YardAnd1Yard_ShouldReturnNotEqual() {
        UnitConversion yard1 = new UnitConversion(Length.YARD, 0.0);
        UnitConversion yard2 = new UnitConversion(Length.YARD, 1.0);
        Assertions.assertNotEquals(yard1, yard2);
    }

    @Test
    void givenType0YardAnd1Yard_ShouldReturnEqual() {
        UnitConversion yard1 = new UnitConversion(Length.YARD, 0.0);
        UnitConversion yard2 = new UnitConversion(Length.YARD, 1.0);
        Assertions.assertEquals(yard1.getClass(), yard2.getClass());
    }

    @Test
    void given3FeetAnd1Yard_WhenCompared_ShouldReturnEqualUnitConversion() {
        UnitConversion feet = new UnitConversion(Length.FEET, 3.0);
        UnitConversion yard = new UnitConversion(Length.YARD, 1.0);
        boolean compareCheck = feet.compare(yard);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1FeetAnd1Yard_WhenCompared_ShouldReturnNotEqualUnitConversion() {
        UnitConversion feet = new UnitConversion(Length.FEET, 1.0);
        UnitConversion yard = new UnitConversion(Length.YARD, 1.0);
        boolean compareCheck = feet.compare(yard);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    void given1InchAnd1Yard_WhenCompared_ShouldReturnNotEqualUnitConversion() {
        UnitConversion inch = new UnitConversion(Length.INCH, 1.0);
        UnitConversion yard = new UnitConversion(Length.YARD, 1.0);
        boolean compareCheck = inch.compare(yard);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    void given36InchAnd1Yard_WhenCompared_ShouldReturnEqualUnitConversion() {
        UnitConversion inch = new UnitConversion(Length.INCH, 36.0);
        UnitConversion yard = new UnitConversion(Length.YARD, 1.0);
        boolean compareCheck = inch.compare(yard);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1YardAnd36Inch_WhenCompared_ShouldReturnEqualUnitConversion() {
        UnitConversion yard = new UnitConversion(Length.YARD, 1.0);
        UnitConversion inch = new UnitConversion(Length.INCH, 36.0);
        boolean compareCheck = yard.compare(inch);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1YardAnd3Feet_WhenCompared_ShouldReturnEqualUnitConversion() {
        UnitConversion yard = new UnitConversion(Length.YARD, 1.0);
        UnitConversion feet = new UnitConversion(Length.FEET, 3.0);
        boolean compareCheck = yard.compare(feet);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given0CentimeterAnd0Centimeter_ShouldReturnEqual() {
        UnitConversion centimeter1 = new UnitConversion(Length.CENTIMETER, 0.0);
        UnitConversion centimeter2 = new UnitConversion(Length.CENTIMETER, 0.0);
        boolean compareCheck = centimeter1.compare(centimeter2);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void givenValue0CentimeterAnd1Centimeter_ShouldReturnNotEqual() {
        UnitConversion centimeter1 = new UnitConversion(Length.CENTIMETER, 0.0);
        UnitConversion centimeter2 = new UnitConversion(Length.CENTIMETER, 1.0);
        Assertions.assertNotEquals(centimeter1, centimeter2);
    }

    @Test
    void given0CentimeterAndNullCentimeter_ShouldReturnNotEqual() {
        UnitConversion centimeter1 = new UnitConversion(Length.CENTIMETER, 0.0);
        UnitConversion centimeter2 = null;
        Assertions.assertNotEquals(centimeter1, centimeter2);
    }

    @Test
    void givenReference0CentimeterAnd1Centimeter_ShouldReturnNotEqual() {
        UnitConversion centimeter1 = new UnitConversion(Length.CENTIMETER, 0.0);
        UnitConversion centimeter2 = new UnitConversion(Length.CENTIMETER, 1.0);
        Assertions.assertNotEquals(centimeter1, centimeter2);
    }

    @Test
    void givenType0CentimeterAnd1Centimeter_ShouldReturnEqual() {
        UnitConversion centimeter1 = new UnitConversion(Length.CENTIMETER, 0.0);
        UnitConversion centimeter2 = new UnitConversion(Length.CENTIMETER, 1.0);
        Assertions.assertEquals(centimeter1.getClass(), centimeter2.getClass());
    }

    @Test
    void given2InchAnd5Centimeter_WhenCompared_ShouldReturnEqualUnitConversion() {
        UnitConversion inch = new UnitConversion(Length.INCH, 2.0);
        UnitConversion centimeter = new UnitConversion(Length.CENTIMETER, 5.0);
        boolean compareCheck = inch.compare(centimeter);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given5CentimeterAnd2Inch_WhenCompared_ShouldReturnEqualUnitConversion() {
        UnitConversion centimeter = new UnitConversion(Length.CENTIMETER, 5.0);
        UnitConversion inch = new UnitConversion(Length.INCH, 2.0);
        boolean compareCheck = centimeter.compare(inch);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given2InchAnd2Inch_WhenAdded_ShouldReturn4Inch() {
        UnitConversion inch1 = new UnitConversion(Length.INCH, 2.0);
        UnitConversion inch2 = new UnitConversion(Length.INCH, 2.0);
        UnitConversion actualValue = inch1.addition(inch2, Length.INCH);
        UnitConversion expectedValue = new UnitConversion(Length.INCH, 4.0);
        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    void given1FeetAnd2Inch_WhenAdded_ShouldReturn14Inch() {
        UnitConversion inch1 = new UnitConversion(Length.FEET, 1.0);
        UnitConversion inch2 = new UnitConversion(Length.INCH, 2.0);
        UnitConversion actualValue = inch1.addition(inch2, Length.INCH);
        UnitConversion expectedValue = new UnitConversion(Length.INCH, 14.0);
        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    void given1FeetAnd1Feet_WhenAdded_ShouldReturn24Inch() {
        UnitConversion inch1 = new UnitConversion(Length.FEET, 1.0);
        UnitConversion inch2 = new UnitConversion(Length.FEET, 1.0);
        UnitConversion actualValue = inch1.addition(inch2, Length.INCH);
        UnitConversion expectedValue = new UnitConversion(Length.INCH, 24.0);
        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    void given2InchAnd2$5Centimeter_WhenAdded_ShouldReturn3Inch() {
        UnitConversion inch1 = new UnitConversion(Length.INCH, 2.0);
        UnitConversion inch2 = new UnitConversion(Length.CENTIMETER, 2.5);
        UnitConversion actualValue = inch1.addition(inch2, Length.INCH);
        UnitConversion expectedValue = new UnitConversion(Length.INCH, 3.0);
        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    void given0GallonAnd0Gallon_ShouldReturnEqual() {
        UnitConversion gallon1 = new UnitConversion(Volume.GALLON, 0.0);
        UnitConversion gallon2 = new UnitConversion(Volume.GALLON, 0.0);
        Assertions.assertEquals(gallon1, gallon2);
    }

    @Test
    void givenValue0GallonAnd1Gallon_ShouldReturnNotEqual() {
        UnitConversion gallon1 = new UnitConversion(Volume.GALLON, 0.0);
        UnitConversion gallon2 = new UnitConversion(Volume.GALLON, 1.0);
        Assertions.assertNotEquals(gallon1, gallon2);
    }

    @Test
    void given0GallonAndNullGallon_ShouldReturnNotEqual() {
        UnitConversion gallon1 = new UnitConversion(Volume.GALLON, 0.0);
        UnitConversion gallon2 = null;
        Assertions.assertNotEquals(gallon1, gallon2);
    }

    @Test
    void givenReference0GallonAnd1Gallon_ShouldReturnNotEqual() {
        UnitConversion gallon1 = new UnitConversion(Volume.GALLON, 0.0);
        UnitConversion gallon2 = new UnitConversion(Volume.GALLON, 1.0);
        Assertions.assertNotEquals(gallon1, gallon2);
    }

    @Test
    void givenType0GallonAnd1Gallon_ShouldReturnEqual() {
        UnitConversion gallon1 = new UnitConversion(Volume.GALLON, 0.0);
        UnitConversion gallon2 = new UnitConversion(Volume.GALLON, 1.0);
        Assertions.assertEquals(gallon1.getClass(), gallon2.getClass());
    }

    @Test
    void given0LitreAnd0Litre_ShouldReturnEqual() {
        UnitConversion litre1 = new UnitConversion(Volume.LITRE, 0.0);
        UnitConversion litre2 = new UnitConversion(Volume.LITRE, 0.0);
        Assertions.assertEquals(litre1, litre2);
    }

    @Test
    void givenValue0LitreAnd1Litre_ShouldReturnNotEqual() {
        UnitConversion litre1 = new UnitConversion(Volume.LITRE, 0.0);
        UnitConversion litre2 = new UnitConversion(Volume.LITRE, 1.0);
        Assertions.assertNotEquals(litre1, litre2);
    }

    @Test
    void given0LitreAndNullLitre_ShouldReturnNotEqual() {
        UnitConversion litre1 = new UnitConversion(Volume.LITRE, 0.0);
        UnitConversion litre2 = null;
        Assertions.assertNotEquals(litre1, litre2);
    }

    @Test
    void givenReference0LitreAnd1Litre_ShouldReturnNotEqual() {
        UnitConversion litre1 = new UnitConversion(Volume.LITRE, 0.0);
        UnitConversion litre2 = new UnitConversion(Volume.LITRE, 1.0);
        Assertions.assertNotEquals(litre1, litre2);
    }

    @Test
    void givenType0LitreAnd1Litre_ShouldReturnEqual() {
        UnitConversion litre1 = new UnitConversion(Volume.LITRE, 0.0);
        UnitConversion litre2 = new UnitConversion(Volume.LITRE, 1.0);
        Assertions.assertEquals(litre1.getClass(), litre2.getClass());
    }

    @Test
    void given0MillilitreAnd0Millilitre_ShouldReturnEqual() {
        UnitConversion millilitre1 = new UnitConversion(Volume.MILLILITRE, 0.0);
        UnitConversion millilitre2 = new UnitConversion(Volume.MILLILITRE, 0.0);
        Assertions.assertEquals(millilitre1, millilitre2);
    }

    @Test
    void givenValue0MillilitreAnd1Millilitre_ShouldReturnNotEqual() {
        UnitConversion millilitre1 = new UnitConversion(Volume.MILLILITRE, 0.0);
        UnitConversion millilitre2 = new UnitConversion(Volume.MILLILITRE, 1.0);
        Assertions.assertNotEquals(millilitre1, millilitre2);
    }

    @Test
    void given0MillilitreAndNullMillilitre_ShouldReturnNotEqual() {
        UnitConversion millilitre1 = new UnitConversion(Volume.MILLILITRE, 0.0);
        UnitConversion millilitre2 = null;
        Assertions.assertNotEquals(millilitre1, millilitre2);
    }

    @Test
    void givenReference0MillilitreAnd1Millilitre_ShouldReturnNotEqual() {
        UnitConversion millilitre1 = new UnitConversion(Volume.MILLILITRE, 0.0);
        UnitConversion millilitre2 = new UnitConversion(Volume.MILLILITRE, 1.0);
        Assertions.assertNotEquals(millilitre1, millilitre2);
    }

    @Test
    void givenType0MillilitreAnd1Millilitre_ShouldReturnEqual() {
        UnitConversion millilitre1 = new UnitConversion(Volume.MILLILITRE, 0.0);
        UnitConversion millilitre2 = new UnitConversion(Volume.MILLILITRE, 1.0);
        Assertions.assertEquals(millilitre1.getClass(), millilitre2.getClass());
    }

    @Test
    void given0GallonAnd0Litre_WhenCompared_ShouldReturnEqualVolume() {
        UnitConversion gallon = new UnitConversion(Volume.GALLON, 0.0);
        UnitConversion litre = new UnitConversion(Volume.LITRE, 0.0);
        boolean compareCheck = gallon.compare(litre);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given0GallonAnd1Litre_WhenCompared_ShouldReturnNotEqualVolume() {
        UnitConversion gallon = new UnitConversion(Volume.GALLON, 0.0);
        UnitConversion litre = new UnitConversion(Volume.LITRE, 1.0);
        boolean compareCheck = gallon.compare(litre);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    void given1GallonAnd3Point78Litre_WhenCompared_ShouldReturnEqualVolume() {
        UnitConversion gallon = new UnitConversion(Volume.GALLON, 1.0);
        UnitConversion litre = new UnitConversion(Volume.LITRE, 3.78);
        boolean compareCheck = gallon.compare(litre);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given3Point78LitreAnd1Gallon_WhenCompared_ShouldReturnEqualVolume() {
        UnitConversion litre = new UnitConversion(Volume.LITRE, 3.78);
        UnitConversion gallon = new UnitConversion(Volume.GALLON, 1.0);
        boolean compareCheck = litre.compare(gallon);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given0LitreAnd0Millilitre_WhenCompared_ShouldReturnEqualVolume() {
        UnitConversion litre = new UnitConversion(Volume.LITRE, 0.0);
        UnitConversion millilitre = new UnitConversion(Volume.MILLILITRE, 0.0);
        boolean compareCheck = litre.compare(millilitre);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1LitreAnd1000Millilitre_WhenCompared_ShouldReturnEqualVolume() {
        UnitConversion litre = new UnitConversion(Volume.LITRE, 1.0);
        UnitConversion millilitre = new UnitConversion(Volume.MILLILITRE, 1000.0);
        boolean compareCheck = litre.compare(millilitre);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1000MillilitreAnd1Litre_WhenCompared_ShouldReturnEqualVolume() {
        UnitConversion millilitre = new UnitConversion(Volume.MILLILITRE, 1000.0);
        UnitConversion litre = new UnitConversion(Volume.LITRE, 1.0);
        boolean compareCheck = millilitre.compare(litre);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1GallonAnd3$78Litre_WhenAdded_ShouldReturn5$75litre() {
        UnitConversion gallon = new UnitConversion(Volume.GALLON, 1.0);
        UnitConversion litre = new UnitConversion(Volume.LITRE, 3.78);
        UnitConversion actualValue = gallon.addition(litre, Volume.LITRE);
        UnitConversion expectedValue = new UnitConversion(Volume.LITRE, 7.56);
        Assertions.assertEquals(expectedValue, actualValue);
    }
    
}
