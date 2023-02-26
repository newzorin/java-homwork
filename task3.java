
import java.util.Scanner;
public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = sc.nextInt();
        System.out.println("Введите число: ");
        int b = sc.nextInt();
        System.out.println("Введите опирацию: (1 - умножение: 2 - деление: 3 - разность: 4 - сложение) ");
        int op = sc.nextInt();
        sc.close();
        if (op == 1){
            int res = Mult(a, b);
            System.out.println(res);
        }

        else if (op == 2){
            int res = Div(a, b);
            System.out.println(res);
        }

        else if (op == 3){
            int res = Sub(a, b);
            System.out.println(res);
        }

        else if (op == 4){
            int res = Sum(a, b);
            System.out.println(res);
        }
        else{
            System.out.println("введите существующую операцию");
        }
        
        
    }
    
    
    public static int Sum(int a, int b){
        int c = a + b;
        return c;
    }

    public static int Mult(int a, int b){
        int c = a * b;
        return c;
    }

    public static int Div(int a, int b){
        int c = a / b;
        return c;
    }

    public static int Sub(int a, int b){
        int c = a - b;
        return c;
    }
}


