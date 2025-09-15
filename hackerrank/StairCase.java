package katas_java.hackerrank;

public class StairCase {

    public static void main(String[] args) {
        staircase(6);
    }

    public static void staircase(int n) {

        int controleCarater = 1;
        int controleSpace = n - 1;
        String space = " ";
        String caracter = "#";
        String impressao = "";

            for (int i = 0; i < n; i++) {
                impressao = "";
                for (int k = 0; k < controleSpace; k++){
                    impressao = impressao + " ";
                }
                System.out.print(impressao);

                for (int j = 0; j < controleCarater; j++){
                    System.out.print("#");
                }

                controleCarater++;
                controleSpace--;
                System.out.println(" ");
            }
    } // fim staircase
}
