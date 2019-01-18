package pro.ofitserov.stepik.functionalprogramming.practicallessons.t3;

public class Step1 {

    /**
     * 2.3 Too many arguments
     * Write a lambda expression that accepts seven (!) string arguments and returns a string in upper case concatenated from all of them (in the order of arguments).
     * Note. The correct solution may not work in your local environment because you don't have suitable functional interface. The testing system has the interface and can test your solution.
     * Solution format. Submit your lambda expression with seven arguments in any valid format with ; on the end.
     * Examples (only with two args): (x, y)  -> x + y; (x, y) -> { return x + y; };
     * Sample Input:
     * The lambda has too many string arguments.
     * Sample Output:
     * THELAMBDAHASTOOMANYSTRINGARGUMENTS.
     */

    public static void main(String[] args) {

        S7 str7 = (s1, s2, s3, s4, s5, s6, s7) -> (s1 + s2 + s3 + s4 + s5 + s6 + s7).toUpperCase();


        System.out.println(str7.concat("The", "lambda", "has", "too", "many", "string", "arguments."));
    }
}
