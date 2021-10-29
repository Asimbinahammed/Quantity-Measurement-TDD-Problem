/*
@author : ASIM AHAMMED
 */

package com.bridglab;

public class UnitConversion {

    /*
     * Returning feet values if it gets input
     */
    public <object> Object feetAndInchDeclare(object o) {
        return o;
    }

    /**
     * purpose:Converting feet into inch
     * @param feet
     * Return: converted inch
     */
    public double feetIntoInch(double feet){
        return feet*12;
    }

    /**
     * Purpose: Converting yard into feet
     * @param yard
     * Return: Converted feet
     */
    public double yardIntoFeet(double yard){
        return yard*3;
    }

    /**
     * purpose:Converting inch into feet
     * @param feet
     * Return: converted fet
     */
    public double inchIntoFeet(double feet){
        return feet/12;
    }

    /**
     * Purpose: Converting feet into yard
     * @param yard
     * Return: Converted yard
     */
    public double feetIntoYard(double yard){
        return yard/3;
    }
}