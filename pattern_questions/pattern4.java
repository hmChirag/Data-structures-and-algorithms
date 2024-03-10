package pattern_questions;

public class pattern4 {
    public static void main(String[] args) {
        int n=5;
        int number=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
    }
}
//output

//  1 
//  2 3
//  4 5 6
//  7 8 9 10
//  11 12 13 14 15
