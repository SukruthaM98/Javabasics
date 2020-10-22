package utility;
/**@author Sukrutha Manjunath
 * Created Date  : 20th-october-2020
 * Functionality : This is utility file containing
 *                 logic for programs in
 *                 ObjectsPractice project
 */
public class Utility {
    /**
     * Functionality : This function generates
     *                 random numbers
     */

    public static double GenerateRandom() {
        double empCheck = Math.floor(Math.random() * 10) % 2;
        return empCheck;
    }
    /**
     * Functionality : This function computes number of
     *                 times head flips, and tail flips
     *                 until either of them reaches
     *                 defined limit for FlipCoin program
     * @param limit  - Input given from the object
     *                 in the main function
     */

    public static int Flip(int limit) {
        int countofhead = 0, countoftail = 0;

        while (countofhead < limit && countoftail < limit) {
            int  CoinFlip = (int) GenerateRandom();
            if (CoinFlip == 0 ) {
                //" coin flips head"
                countofhead = countofhead + 1;
            }
	        else {
                //" coin flips tail"
                countoftail = countoftail + 1;
            }

        }
        System.out.println("number of times head won" +countofhead);
        System.out.println("number of times tail won" +countoftail);
        return 0;
    }
    /**
     * Functionality        : This function computes conversion of
     *                        temperature from degree to farenheit
     *                        for the unit conversion program
     * @param temperature   - Input given from the object
     *                        in the main function
     * @return degree       - Returns computed value of degree
     */
    public int degreeToFarenheit(int temperature) {
        int degree=0;
        if (temperature >= 0 && temperature <= 100) {
            degree = (temperature) * (9 / 5) + 32;
            System.out.println("converted value from degree to farenheit is " + degree);
        }
        else {
            System.out.println(" enter range between 0 to 100c only");
        }
        return degree;
    }
    /**
     * Functionality        : This function computes conversion of
     *                        temperature from farenheit to degree
     *                        for the unit conversion program
     * @param temperatureF  - Input given from the object
     *                        in the main function
     * @return Farenheit    - Returns computed value of farenheit
     */
    public double FarenheitToDegree(int temperatureF) {
        double Farenheit=0;
        float comp= ((50/9));
        if (temperatureF >= 32 && temperatureF <= 212) {
            Farenheit = (temperatureF-32) * (comp/10) ;
            System.out.println("converted value from farenheit to degree is " + Farenheit);
        }
        else {
            System.out.println(" enter range between 32 to 212F only");
        }
        return Farenheit;
    }
}
