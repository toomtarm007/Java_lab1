package B;

public class B {
    //properties
    private short s;
    private int i;
    private long l;
    private float f;
    private double d;
    private char c;
    private String str;
    private boolean b;

    //methd main
    public static void main(String[] args) {
        //B df = new B(); //create new object , df --> instance class
        B df;
        df = new B(); // instance class
        // ctrl+d
        // + (concatenation)
        df.s = 5;
        df.str = "Softeng";
//        df.b = true;
        System.out.println("short s =" + df.s);
        System.out.println("int i  =" + df.i);
        System.out.println("long l s =" + df.l);
        System.out.println("float f =" + df.f);
        System.out.println("double d =" + df.d);
        System.out.println("char c =" + df.c);
        System.out.println("String str =" + df.str);
        System.out.println("boolean b =" + df.b);


    }
}
