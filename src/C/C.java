package C;

public class C {
    public static void main (String args[])
    {
        String str1 = "Good";
        String str2 = "Good";
        int a=5;
        int b=6;
        System.out.println("\n str1 :" + str1);
        System.out.println("\n str2 :" + str2);
        System.out.println("\n str1 == str2 : " + str1 == str2); // not compare
        System.out.println("\n a==b : "+ (a==b)); // not compare
        System.out.println("\n str1.equals(str2) : " + str1.equals(str2)); // method equals
    }
}
