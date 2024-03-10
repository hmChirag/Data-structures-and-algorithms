package pattern_questions;

public class pattern5 {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                int sum=i+j;
                if (sum%2==0) {  
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}

//output

//    1 
//    0 1
//    1 0 1
//    0 1 0 1
//    1 0 1 0 1