package pro.ofitserov.stepik.functionalprogramming.practicallessons.t7;

import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.util.concurrent.Callable;

public class Step2 {
    /**
     * 2.7 Replacing anonymous classes with lambda expressions
     * In which cases can we replace an anonymous class with a lambda expression?
     * All interfaces from the standard java class library.
     */

    public static void main(String[] args) {

        // b)
        Callable<String> callable = new Callable<String>() {
            @Override
            public String call() throws Exception {
                Thread.sleep(100);
                return "hello";
            }
        };

        // d)
        // see NIO.2
        PathMatcher matcher = new PathMatcher() {
            @Override
            public boolean matches(Path path) {
                return false;
            }
        };
    }
}
