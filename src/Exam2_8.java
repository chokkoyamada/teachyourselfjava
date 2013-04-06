/**
 * User: yamadanaoyuki
 * Date: 2013/02/24
 * Time: 19:37
 */
public class Exam2_8 {
    public static void main(String args[]){
        newStringBuffer();
        insertToStringBuffer();
        appendAndReverse();
    }

    private static void appendAndReverse() {
        StringBuffer sb = new StringBuffer("hello");
        sb.append(" world");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }

    private static void insertToStringBuffer() {
        StringBuffer sb = new StringBuffer("hello");
        sb.insert(0, "first ");
        System.out.println(sb);
    }

    private static void newStringBuffer() {
        StringBuffer sb = new StringBuffer("start");
        sb.append(" hello");
        System.out.println(sb.capacity() + " " + sb.length());
    }
}
