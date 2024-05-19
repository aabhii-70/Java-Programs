public class TypePromotionExpreesion {
    public static void main(String[] args) {
    //first point

        //char a = 'a';
        //char b = 'b';
        //char c = a-b;// from here convert int to char
        //System.out.println((int)(a));
        //System.out.println((int)(b));
        //System.out.println(a);// variable hi hoga
        //System.out.println(b-a);

        //for next 
        //short a = 5;
        //byte b =  25;
        //char c = 'c';
        //byte bt = a+b+c;// rhs all int
        //byte bt = (byte) (a+b+c);
        //System.out.println(bt);

    //second point
        //int a = 10;
        //float b = 20.25f;
        //long c = 25;
        //double d = 30;
        //double ans = a+b+c+d;
        //System.out.println(ans);

    // for next
       byte b = 5;
       //byte a = b*2;//int to byte not allow 
       byte a = (byte) (b*2);
       System.out.println(a);


    }
}
