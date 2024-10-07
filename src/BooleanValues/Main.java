package BooleanValues;

public class Main {
    static boolean dDef;
    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;

        System.out.println("The value of b1 is " + b1);
        System.out.println("The value of b2 is " + b2);

        //if the value of boolean it will be set to "false" by default
        System.out.println("If the value is not declared it will be false in dafault");
        System.out.println("The value of dDef is " + dDef);

        boolean b3 = !b1;
        System.out.println("The value of negate b1 is " + b3);

        // สามารถที่จะ convert string ให้เป็น boolean ได้ด้วยการใช้ parseBoolean
        String myLogic = "true";
        boolean parsed = Boolean.parseBoolean(myLogic);
        System.out.println("Parsed => " + parsed);

    }
}
