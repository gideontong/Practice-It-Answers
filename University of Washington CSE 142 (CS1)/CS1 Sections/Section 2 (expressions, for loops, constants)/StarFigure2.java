// Creator: Gideon Tong

public class StarFigure2 {

    public static final int SIZE = 3; // or 6

    public static void main(String[] args) {
        for(int i = 0; i < SIZE; i++){
            for(int j = 0; j < (SIZE - i - 1) * 4; j++){
                System.out.print('/');
            }
            for(int j = 0; j < 8*i; j++){
                System.out.print('*');
            }
            for(int j = 0; j < (SIZE - i - 1) * 4; j++){
                System.out.print('\\');
            }

            System.out.println();
        }

    }}