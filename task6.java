import java.util.ArrayList;

public class task6 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(-2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(-100);
        numbers.add(6);
        numbers.add(700);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        int max = numbers.get(0);
        int min = numbers.get(0);
        int count = 0;
        System.out.println("Исходный список чисел: " + numbers);
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > max) {
                max = numbers.get(i);
                count = count + numbers.get(i);
            }

            else if (numbers.get(i) < min){
                min = numbers.get(i);
                count = count + numbers.get(i);
            }

            else{
                count = count + numbers.get(i);
            }
            
        }
        System.out.println("максимально число " + max);
        System.out.println("минимальное число " + min);
        System.out.println("среднее арифметическое " + count / numbers.size());
        
        
    }

        
}