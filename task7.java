import java.util.LinkedList;
import java.util.Stack;

public class task7 {
    public static void main(String[] args) {
        LinkedList<Integer> llist= new LinkedList<Integer>();
        llist.add(3);
        llist.add(4);
        llist.add(5);
        reverseList(llist);
    }
    
    public static void reverseList(LinkedList<Integer> list) {
        int current = list.size();
        Stack<Integer> st = new Stack<>();
        int temp = 0;
        for (int i = 0; i < current; i++) {
            temp = list.get(i);
            st.push(temp);
        }
        System.out.println(st);
    }
}
