public class TypeCasting {
    public static void main(String[] args) {
        float a = 25.0f;//or 25.9999f
        //int b = a;
        int b = (int) a;
        System.out.println(b);

        //for next imp data
        float marks = 99.999f;
        int marks2 = (int) marks;
        System.out.println(marks2);

        //for next not imp data
        float number = 99.999f;
        int number2 = (int) number;
        System.out.println(number2);

        // for character
        char ch = 'a';
        char ch2 = 'b'; //'a', 'b', 'e'
        int num = ch;
        int num2 = ch2;
        System.out.println(num);
        System.out.println(num2);

    }
} 
