package pattern_questions;
public class pattern_7 {

    public static void main(String[] args) {
        int n=5;
        for(int i=5;i>0;i--){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

//  output

//            *****
//           *****
//          *****
//         *****
//        *****