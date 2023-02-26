import java.util.ArrayList;

public class task2 {
    public static void main(String[] args) {
        int x, y;
        ArrayList<Integer> list = new ArrayList<Integer> ();
        for (x = 1; x < 1001; x++) {
            y = 0;
        for (int i = 1; i <= x; i++) {
             if (x % i == 0)
                y++;
                        }
        if (y <= 2)
            list.add(x);
            }
        System.out.print(list);
        }
    }
