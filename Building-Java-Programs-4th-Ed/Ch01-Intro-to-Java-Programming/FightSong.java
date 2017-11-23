/*
 *Solution by Gideon Tong
 */


public class FightSong {
    public static void main(String[] args) {
        go();
        you();
        go();
        you();
        go();
    }
    public static void go() {
        go2();
        System.out.println("");
        go2();
    }
    public static void go2() {
        System.out.println("Go, team, go!\nYou can do it.");
    }
    public static void you() {
        System.out.println("You're the best,\nIn the West.");
    }
}
