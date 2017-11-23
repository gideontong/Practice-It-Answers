/*
 *Solution by Gideon Tong
 */


public class Lanterns {
    public static void main(String[] args) {
        top();
        blank();
        top();
        lazy();
        top();
        blank();
        top();
        lazy2();
        
    }
    public static void top() {
        System.out.println("    *****\n  *********\n*************");
    }
    public static void lazy() {
        System.out.println("* | | | | | *\n*************");
    }
    public static void lazy2() {
        System.out.println("    *****\n* | | | | | *\n* | | | | | *\n    *****\n    *****");
    }
    public static void blank() {
        System.out.println("");
    }
}
