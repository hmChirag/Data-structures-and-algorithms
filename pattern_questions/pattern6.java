package pattern_questions;
public class pattern6 {

    public static void main(String[] args) {
        int n=5;


        //upper half
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            int spaces=2*(n-i);

            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //lower half
        for(int i=5;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            int spaces=2*(n-i);

            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


//        *        *
//        **      **
//        ***    ***
//        ****  ****
//        **********  
//        **********
//        ****  ****
//        ***    ***
//        **      **
//        *        *