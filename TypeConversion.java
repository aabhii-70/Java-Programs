import java.util.*;

public class TypeConversion {
    public static void main(String[] args) {
        //int a = 25;
        //long b = a;
        long a = 25;
        int b = a;
        System.out.println(b);
        Scanner sc = new Scanner(System.in);
        int number = sc.nextFloat(); //not allow 
        float num = sc.nextInt();
        System.out.println(number);
        System.out.println(num);
    }
}
