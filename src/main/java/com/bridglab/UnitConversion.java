package com.bridglab;

/**
 * @author ASIM AHAMMED
 * @since 2021-10-29
 */

public class UnitConversion {

    public double value;
    public MeasurementUnits unit;

    public UnitConversion(MeasurementUnits unit, Double value) {
        this.unit = unit;
        this.value = value;
    }

    /**
     * Purpose: compare two values
     * @param that
     * @return boolean value after comparison
     */
    public boolean compare(UnitConversion that){
        if (this.unit.equals(that.unit))
            return this.equals(that);
        return Double.compare(this.unit.convertToBaseUnit(this), that.unit.convertToBaseUnit(that)) == 0;
    }

    /**
     *Purpose : To override the equals() method for checking equality of two object references
     *          and the values of that two objects
     * @param o parameter which is taking Object class reference
     * @return checked value of those two objects
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UnitConversion that = (UnitConversion) o;
        return Double.compare(that.value, value) == 0 && unit.equals(that.unit);
    }

    /**
     * Purpose : for addition 
     * @param that : This is the first parameter which is taking the unit length value
     * @param requiredUnit : This is the second parameter which is taking enum variables
     * @return the adding value
     */
    public UnitConversion addition(UnitConversion that,MeasurementUnits requiredUnit){
        double sumOfInput=this.unit.convertToBaseUnit(this)+that.unit.convertToBaseUnit(that);
        return new UnitConversion(requiredUnit,sumOfInput);
    }
}