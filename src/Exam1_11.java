/**
 * Created with IntelliJ IDEA.
 * User: yamadanaoyuki
 * Date: 2013/02/03
 * Time: 21:41
 * To change this template use File | Settings | File Templates.
 */
public class Exam1_11 {
    public static void main(String args[]){
        System.out.println(5 % 3 + 1);
        System.out.println(5 / 3 + 1);
        System.out.println(5 * 3 + 1);
        calcFee();
        isStatementValid();
    }
    public static void calcFee(){
        System.out.println("It will take about " + 3000 / 75 + " hours.");
    }
    public static void isStatementValid(){
        System.out.println( ((10) + (((5))) / 9) );
    }

}
