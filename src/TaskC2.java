import java.util.Scanner;//импорт сканера

public class TaskC2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//объявили сканер
        int a = scan.nextInt();//cчитали с консоли
        int b = scan.nextInt();//cчитали с консоли
        int c = a + b;
        System.out.println("DEC: " + a + " + " + b + " = " + (a + b));
        String a1 = Integer.toBinaryString(a);
        String b1 = Integer.toBinaryString(b);
        String c1 = Integer.toBinaryString(c);
        System.out.println("BIN: " + a1 + " + " + b1 + " = " + c1);

        String a2 = Integer.toHexString(a);
        String b2 = Integer.toHexString(b);
        String c2 = Integer.toHexString(c);
        System.out.println("NEX: " + a2 + " + " + b2 + " = " + c2);

        String a3 = Integer.toOctalString(a);
        String b3 = Integer.toOctalString(b);
        String c3 = Integer.toOctalString(c);
        System.out.println("OKT: " + a3 + " + " + b3 + " = " + c3);
    }
}
