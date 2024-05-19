import java.util.Scanner;

public class PositiveOrNegativeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        if(X > 0){
            System.out.println(" X is greater than 0");
        }
        else{
            System.out.println("X is less than or equal 0");
        }
    }
}
