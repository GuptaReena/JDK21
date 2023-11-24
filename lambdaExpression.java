import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.DoubleUnaryOperator;
import java.util.function.Function;
import java.util.logging.Logger;

@FunctionalInterface
interface Demo {

    void show();
}

public class lambdaExpression {

    public static void main(String[] args) {

        // This is how we write LambdaExpression
        Demo obj = () -> System.out.println("This is my Method1");

        obj.show();

       
    }

}
