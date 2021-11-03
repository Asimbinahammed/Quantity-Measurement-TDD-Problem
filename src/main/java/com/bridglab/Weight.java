package com.bridglab;

/**
 * Purpose : To create enums as instance variables which implements MeasurementUnits class
 *           to override a method
 */
public enum Weight implements MeasurementUnits{
    KILOGRAM(1.0), GRAM(0.001), TONNE(1000.0);

    private final double conversionValue;

    Weight(double convertIntoBaseUnit){
        this.conversionValue=convertIntoBaseUnit;
    }

    /**
     * Purpose : To override the convertToBaseUnit() method
     * @param unit
     * @return converted value
     */
    @Override
    public double convertToBaseUnit(UnitConversion unit) {
        return (unit.value*conversionValue);
    }
}
