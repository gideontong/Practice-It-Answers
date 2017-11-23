/*
 *Solution by Gideon Tong
 */

public class TwoRockets {
    public static void main(String[] args) {
        top();
        String a = "+------+";
        String b = "|      | |      |\n|      | |      |";
        String c = "|United| |United|\n|States| |States|";
        System.out.println(a+" "+a+"\n"+b);
        System.out.println(a+" "+a);
        System.out.println(c);
                System.out.println(a+" "+a+"\n"+b);
        System.out.println(a+" "+a);
        System.out.println("   /\\       /\\\n  /  \\     /  \\\n /    \\   /    \\");
    }
    public static void top() {
        System.out.println("   /\\       /\\\n  /  \\     /  \\\n /    \\   /    \\");
    }
}
