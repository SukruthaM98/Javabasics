package program;
import utility.FlipCoinObject;
import utility.Utility;
/**@author Sukrutha Manjunath
 * Created Date  : 20th-october-2020
 * Functionality : This is the main class for computing
 *                 flip of coin until either head or
 *                 tail reaches the defined limit
 */

public class FlipCoin {
    public static void main(String[] args){
        System.out.println("welcome to coin flip program");
        Utility util= new Utility();
        FlipCoinObject flipCoinObject = new FlipCoinObject();
        flipCoinObject.setLimit(40);
        util.Flip(flipCoinObject.getLimit());
    }
}
