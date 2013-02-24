import com.sun.tools.corba.se.idl.SymtabEntry;

/**
 * Created with IntelliJ IDEA.
 * User: yamadanaoyuki
 * Date: 2013/02/03
 * Time: 21:59
 * To change this template use File | Settings | File Templates.
 */
public class Exam1_16 {
    public static void main(String args[]){
        floatArray();
        intArray();
        byteArray();
    }

    private static void floatArray() {
        float f[][] = {
                {-56.7f},
                {500.1f, 70.70f},
                {100.9f, 0.5f, 20.20f}
        };

        System.out.println(f.length);
    }

    private static void intArray() {
        int i[][] = {
            {1},
            {1,2},
            {1,2,3}
        };
        System.out.println(i.length);
        System.out.println(i[0].length);
        System.out.println(i[1].length);
        System.out.println(i[2].length);
    }

    private static void byteArray() {
        byte b[][][] = {
                {
                        {1, 2, 3},
                        {4,5,6},
                        {7,7,7}
                },
                {
                        {1, 2, 3},
                        {4,5,6},
                        {7,7,7}
                },
                {
                        {1, 2, 3},
                        {4,5,6},
                        {7,7,7}
                }
        };
        System.out.println(b[0][0][0]);
        System.out.println(b[0][1][0]);
        System.out.println(b[0][2][0]);
        System.out.println(b[1][0][0]);
        System.out.println(b[1][1][0]);
        System.out.println(b[1][2][0]);
        System.out.println(b[2][0][0]);
        System.out.println(b[2][1][0]);
        System.out.println(b[2][2][0]);
    }

}
