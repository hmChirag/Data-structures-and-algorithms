package arrays.searching_techniques;

public class linear_search {
    public static int Search(int menu[]){
        int min=0;
        for (int i=0;i<menu.length;i++){
            if (menu[i]<min) {
                System.out.println("element fount at index "+ i);
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int menu[]={1,2,3,4,5,6};
        int ans= Search(menu);
        System.out.println(ans);   
    }
}
