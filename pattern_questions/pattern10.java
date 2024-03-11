package pattern_questions;

public class pattern10 {
    public static void main(String[] args) {
        int m=4;

        //upper half
        for(int i=1;i<=m;i++){
            for(int j=m;j>i;j--){
                System.out.print(" ");
            }
            
            for(int j=0;j<i;j++){
                System.out.print("$");
                
            }
            
            for(int j=2;j<=i;j++){
                System.out.print("$");
                
            }
            System.out.println();
        }

        //lower half
        for(int i=m;i>0;i--){
            for(int j=m;j>i;j--){
                System.out.print(" ");
            }
            
            for(int j=0;j<i;j++){
                System.out.print("$");
                
            }
            
            for(int j=2;j<=i;j++){
                System.out.print("$");
                
            }
            System.out.println();
        }
    }
    
}



//output

/*
 *
   $
  $$$
 $$$$$
$$$$$$$
$$$$$$$
 $$$$$
  $$$
   $
 */