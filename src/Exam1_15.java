/**
 * Created with IntelliJ IDEA.
 * User: yamadanaoyuki
 * Date: 2013/02/03
 * Time: 21:53
 * To change this template use File | Settings | File Templates.
 */
public class Exam1_15 {
    public static void main(String args[]){
        byteArray();
        doubleArray();
    }

    public static void byteArray(){
        byte b[] = {1, 2, 3, 4};
        System.out.println("result: " + b[0] + b[1] + b[2] + b[3]) ;
    }

    private static void doubleArray() {
        double d[] = {0.1, 0.2, 0.3, 0.4};
        System.out.println("result: " + d[0] + d[1] + d[2] + d[3]);
    }

}
