public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 16;//22//16 (Not Adult)
        if(age >= 18){
            System.out.println("Adult : Vote, Drive");
        }

        if(age > 13 && age < 18){
            System.out.println("teenager");
        }

        else{
            System.out.println("Not Adult");
        }
    }
}
