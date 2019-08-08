
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

        Supplier<Object> objectSupplier = Object::new;
        Object objectInstance = objectSupplier.get();
        System.out.println(objectInstance);

        BiPredicate<Object,Object> equalsMethodOnObjects = Object::equals;
        System.out.println(equalsMethodOnObjects.test(objectInstance,new Object()));

        Predicate<Object> equalsMethodOnObject = objectInstance::equals;
        System.out.println(equalsMethodOnObject.test(new Object()));
    }
}
