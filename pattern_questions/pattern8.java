package pattern_questions;

public class pattern8 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i <=n; i++) {
            int spaces = n - i;
            for (int j = 1; j <=spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {

                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}

//output

/*
 *  1 
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5

 */

