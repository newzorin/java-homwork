import java.util.LinkedList;

public class task8 { 
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        l.add(1);
        l.add(2);
        l.add(3); 
        l.add(4);
        System.out.println("sum");
    }

    public static void sum(LinkedList<Integer> list) {
        int current = list.size();
        int sum = 0;
        int a = 0;
        for (int i = 0; i < current; i++) {
            a = list.get(i);
            sum = sum + a;
        }
        System.out.println(sum);
    }
}
        
