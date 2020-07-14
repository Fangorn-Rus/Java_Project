package CodingBat.Logic1;

public class fizzString {
    /*
    Given a string str, if the string starts with "f" return "Fizz". If the string ends with "b"
    return "Buzz". If both the "f" and "b" conditions are true, return "FizzBuzz".
    In all other cases, return the string unchanged.
     */
    static String fizzString(String str) {
        boolean startsStr = str.startsWith("f");
        boolean endStr = str.endsWith("b");

        if (startsStr){
            if (endStr) return "FizzBuzz";
            return "Fizz";
        }
        if(endStr){
            if (startsStr) return "FizzBuzz";
            return "Buzz";
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(fizzString("fib"));
    }


}
