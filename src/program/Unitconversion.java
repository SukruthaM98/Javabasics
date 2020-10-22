package program;

import utility.DegreeToFarenheitObject;
import utility.FarenheitToDegreeObject;
import utility.FlipCoinObject;
import utility.Utility;
/**@author Sukrutha Manjunath
 * Created Date  : 20th-october-2020
 * Functionality : This program computes unit conversion from
 *                 degree to farehneit and vice-versa
 */

public class Unitconversion {
    public static void main(String[] args){
        System.out.println("welcome to unit conversion program");
        Utility util= new Utility();
        //degree to farenheit
        System.out.println("Degree to Farenheit conversion");
        DegreeToFarenheitObject degreeToFarenheitObject = new DegreeToFarenheitObject();
        degreeToFarenheitObject.setTemperature(98);
        util.degreeToFarenheit(degreeToFarenheitObject.getTemperature());
        //farenheit to degree
        System.out.println("Farenheit to Degree conversion");
        FarenheitToDegreeObject farenheitToDegreeObject= new FarenheitToDegreeObject();
        farenheitToDegreeObject.setTemperatureF(150);
        util.FarenheitToDegree(farenheitToDegreeObject.getTemperatureF());
    }
}
