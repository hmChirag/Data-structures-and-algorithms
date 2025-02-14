/*
 * Question 1 :Generate Binary Numbers Given a number N.
 * The task is to generate and print all binary numbers with decimal values from1 to N.
 * Sample Input 1: N =2
 * Sample Output 1: 1 10
 * Sample Input 2: 5.
 * Sample Output 2: 1 10 11 100 101
 */
 
 
import java.util.*;

public class generateBinary {
    public static void generate(int n) {
        Queue<String> q = new LinkedList<>();
        q.add("1");
        while (n-- > 0) {
            String s1 = q.peek();
            q.remove();
            System.out.println(s1 + " ");
            q.add(s1 + "0");
            q.add(s1 + "1");
        }
    }

    public static void main(String[] args) {
        generate(5);
    }
}
