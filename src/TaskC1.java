import java.util.Scanner;//импорт сканера

public class TaskC1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//объявили сканер
        int a = scan.nextInt();//cчитали с консол
        int b = scan.nextInt();//cчитали с консол
        System.out.println("Sum = " + (a + b));
    }
}
