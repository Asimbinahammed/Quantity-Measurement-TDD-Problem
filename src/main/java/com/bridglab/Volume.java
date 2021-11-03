package com.bridglab;

/**
 * Purpose : To create enums as instance variables which implements MeasurementUnits class
 *           to override a method
 */
public enum Volume implements MeasurementUnits{
    GALLON(3.78),LITRE(1.0),MILILITER(0.0001);

    private final double conversionValue;

    Volume(double convertToBaseUnit){
        this.conversionValue=convertToBaseUnit;
    }

    /**
     * Purpose : To override the convertToBaseUnit() method
     * @param unit
     * @return converted value
     */
    @Override
    public double convertToBaseUnit(UnitConversion unit){
        return(unit.value*conversionValue);
    }
}
