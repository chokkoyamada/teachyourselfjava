/**
 * User: yamadanaoyuki
 * Date: 2013/02/03
 * Time: 22:22
 */
public class Exam2_3 {

    public static void main(String args[]){
        displaySubString();
        displayInt();
    }

    private static void displaySubString() {
        String s = "aaaaaaajjjjjjjjjjjfeeeeeeekkkkkkkkk";
        String p = s.substring(s.length() - 10);
        System.out.println(p);
    }

    private static void displayInt() {
        String ints = "1,2,3,4,5";
        String res = ints.substring(8);
        System.out.println(res);
    }

}
