package katas_java.hackerrank;

import java.util.*;

/*
Input (stdin)
    2
    0 2 10
    5 3 5
Expected Output
    2 6 14 30 62 126 254 510 1022 2046
    8 14 26 50 98
 */

class JavaLoops2 {

    public static void main(String []argh){
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        for(int i=0; i<t; i++) {

            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            StringBuilder resp = new StringBuilder();
            int valorTemp = 0;

            for(int j=0; j < n; j++){
                var valorCalc = (int)Math.pow(2, j);
                if(valorTemp == 0) {
                    valorTemp = valorTemp + a + (valorCalc * b);
                } else {
                    valorTemp = valorTemp + (valorCalc * b);
                }
                resp.append(valorTemp + " ");
            }
            System.out.println(resp);
        }
        in.close();
    }
}