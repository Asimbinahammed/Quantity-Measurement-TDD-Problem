package com.bridglab;

/**
 * Purpose : To create enums as instance variables which implements MeasurementUnits class
 *           to override a method
 */
public enum Temperature implements MeasurementUnits{
    CELSIUS(212.0), FAHRENHEIT(100.0);

    private final double conversion;

    Temperature(double convertIntoBase){
        this.conversion=convertIntoBase;
    }

    /**
     * Purpose : To override the convertToBaseUnit() method
     * @param unit
     * @return converted value
     */
    @Override
    public double convertToBaseUnit(UnitConversion unit) {
        return (unit.value*conversion);
    }
}
