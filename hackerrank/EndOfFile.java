package katas_java.hackerrank;

import java.util.Scanner;

public class EndOfFile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int posLinha = 0;

        while (sc.hasNext()) {
            String frase = sc.nextLine();
            posLinha++;
            System.out.println(posLinha + " " + frase);
        }

        sc.close();
    }
}
