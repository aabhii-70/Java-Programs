public class ElseIfQuestion {
    public static void main(String[] args) {
        int A = 1, B = 3, C = 6;
        if((A >= B) && (A >= B)){
            System.out.println(" Largest is A");
        }
        else if(B >= C){
            System.out.println("Largest is B");
        }
        else{
            System.out.println("Largest is C");
        }
    }
}