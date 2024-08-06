package bit_manupilation;

public class singleNumber {

    public static int solution(int nums[]) {
        int uniqueNumber = 0;
        for (int i = 0; i < nums.length; i++) {
            uniqueNumber = uniqueNumber ^ nums[i];
        }
        return uniqueNumber;
    }

    public static void main(String[] args) {
        int nums[]={1,3,4,1,4,3,5,6,5};
        System.out.println(solution(nums));
    }
}
