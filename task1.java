
import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = sc.nextInt();
        System.out.println(a * (a+1) / 2);
        sc.close();
    }
}
