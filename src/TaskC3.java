import java.util.Scanner;//импорт сканера

public class TaskC3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//объявили сканер
        System.out.println(getWeight(scan.nextInt()));
    }
    public static String getWeight(int x) {
        double m = 3.86;
        double z = 9.81;
        double weight = (x / z) * m;
        String result = String.format("%.2f", weight);
        return result;

    }
}
