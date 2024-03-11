package pattern_questions;

public class pattern9 {
    public static void main(String[] args) {
        int m=5;
        for(int i=1;i<=m;i++){
            for(int j=m;j>i;j--){
                System.out.print(" ");
            }
            int count=i;
            for(int j=0;j<i;j++){
                System.out.print(count);
                count--;
            }
            
            for(int j=2;j<=i;j++){
                System.out.print(j);
                
            }
            System.out.println();
        }
    }
}


//output

/*
 *  1
   212
  32123
 4321234
543212345
 */