package com.bridglab;

/**
 * Purpose : To create enums as instance variables which implements MeasurementUnits class
 *           to override a method
 */
public enum Length implements MeasurementUnits{
    CENTIMETER(0.4), FEET(12.0), INCH(1.0), YARD(36.0);
    private final double conversionValue;

    Length(double convertToBaseUnit){
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

