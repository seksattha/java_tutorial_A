package MathematicsOperation;

public class Main {
    public static void main(String[] args) {
        int intValue1 = 56;
        int intValue2 = 42;

        int result1 = intValue1 + intValue2;
        System.out.println("Addition =>" + result1);

        int result2 = intValue1 - intValue2;
        System.out.println("subtraction =>" + result2);

        int result3 = intValue1 * intValue2;
        System.out.println("multiplication =>" + result3);

        double result4 =(double) intValue1 / intValue2;
        System.out.println("division =>" + result4);

        int result5 = intValue1 % intValue2;
        System.out.println("modulation =>" + result5);

        //Using Math class
        double doubleValue = -3.999;
        long rounded = Math.round(doubleValue);
        System.out.println("from >> " + doubleValue + "to = >> " + rounded);

        double absValue = Math.abs(doubleValue);
        System.out.println("Absolute Number :" + absValue);


    }
}
