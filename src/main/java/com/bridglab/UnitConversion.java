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
     * Return: converted inch
     */
    public double feetIntoInch(double feet){
        return feet*12;
    }

    /**
     * Purpose: Converting yard into feet
     * Return: Converted feet
     */
    public double yardIntoFeet(double yard){
        return yard*3;
    }

    /**
     * purpose:Converting inch into feet
     * Return: converted fet
     */
    public double inchIntoFeet(double feet){
        return feet/12;
    }

    /**
     * Purpose: Converting feet into yard
     * Return: Converted yard
     */
    public double feetIntoYard(double yard){
        return yard/3;
    }
}
