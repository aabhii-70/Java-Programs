public class TernaryOperators {
    public static void main(String[] args) {
        int num = 4;

        //Ternary Operator
       String type = ((num % 2) == 0)? "Even" : "Odd";
       System.out.println(type);
    }
}
