
import java.util.*;

public class interleaveTwoHalfsOfQ {
    public static void interleave(Queue<Integer> q){
        Queue<Integer> Q2 =new LinkedList<>();
        int size=q.size();
        for(int i=0;i<size/2;i++){
            Q2.add(q.remove());   
        }
        while(!Q2.isEmpty()){
            q.add(Q2.remove());
            q.add(q.remove());
        }
        return;
    }
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        
        interleave(q);
        while(!q.isEmpty()){
            System.out.print(q.remove()+" ");
        }
    }
}
