import java.util.Scanner;//импорт сканера

public class Hui {

    public static void main(String [] args) {
        System.out.println("Введите число:");
        Scanner scan = new Scanner(System.in);//объявили сканер
        int number = scan.nextInt();//cчитали с консол
        System.out.println("Квадрат числа: " + number * number);
    }
}