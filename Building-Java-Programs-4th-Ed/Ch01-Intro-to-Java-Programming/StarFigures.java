/*
 *Solution by Gideon Tong
 */


public class StarFigures {
    public static void main(String[] args) {
        next();
        System.out.println("");
        next();
        row();
        three();
        next();
    }
    public static void next() {
        row();
        five();
    }
    public static void row() {
        System.out.println("*****\n*****");
    }
    public static void five() {
        System.out.println(" * *\n  *\n * *");
    }
    public static void three() {
        System.out.println("\n  *\n  *\n  *");
    }
}
