// Creator: Gideon Tong

public class StarFigure {

    public static void main(String[] args) {
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < (4 - i) * 4; j++){
                System.out.print('/');
            }
            for(int j = 0; j < 8*i; j++){
                System.out.print('*');
            }
            for(int j = 0; j < (4 - i) * 4; j++){
                System.out.print('\\');
            }

            System.out.println();

        }

    }

}