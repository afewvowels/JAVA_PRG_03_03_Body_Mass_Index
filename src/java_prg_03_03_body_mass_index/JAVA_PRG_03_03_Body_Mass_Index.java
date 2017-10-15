/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_prg_03_03_body_mass_index;

import javax.swing.JOptionPane;
/**
 *
 * @author bluebackdev
 * Write a program that calculates and displays a person's body mass index (BMI).
 * The BMI is often used to determine whether a person with a sedentary
 * lifestyle is overweight or underweight for his or her height. A person's
 * BMI is calculated with the following formula:
 * 
 *      BMI = Weight * (703 / Height^2)
 * 
 * where weight is measured in pounds and height is measured in inches. The
 * program should display a message indicating whether the person has optimal
 * weight, is underweight, or is overweight. A sedentary person's weight is
 * considered optimal if his or her BMI is between 18.5 and 25. If the BMI
 * is less than 18.5, the person is considered underweight. If the BMI value is
 * greater than 25, the person is considered overweight.
 */
public class JAVA_PRG_03_03_Body_Mass_Index {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declare float variables to hold weight and height and BMI
        float fltWeight;
        float fltHeight;
        float fltBMI;
        
        // Declare constant
        int intBMICalcConstant = 703;
        
        // Declare strings to get user inputs
        String strWeight;
        String strHeight;
        String strOutput;
        
        // Get weight and height from user
        strWeight = JOptionPane.showInputDialog("Please enter your weight.");
        strHeight = JOptionPane.showInputDialog("Please enter your height in inches.");
        
        // Convert user input from strings to floats
        fltWeight = Integer.parseInt(strWeight);
        fltHeight = Integer.parseInt(strHeight);
        
        // Calculate BMI
        fltBMI = fltWeight * (intBMICalcConstant / (fltHeight * fltHeight));
        
        // Format and display formatted and calculated BMI to user
        if(fltBMI > 25)
        {
            strOutput = String.format("Your BMI is %.1f." +
                    "\nYou are overweight.", fltBMI);
            JOptionPane.showMessageDialog(null, strOutput);
        }
        else if(fltBMI < 18.5)
        {
            strOutput = String.format("Your BMI is %.1f." +
                    "\nYou are underweight.", fltBMI);
            JOptionPane.showMessageDialog(null, strOutput);
        }
        else
        {
            strOutput = String.format("Your BMI is %.1f." +
                    "\nThat is an acceptable BMI.", fltBMI);
            JOptionPane.showMessageDialog(null, strOutput);
        }
        
        System.exit(0);
    }
    
}
