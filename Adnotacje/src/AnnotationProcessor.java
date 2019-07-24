import java.lang.annotation.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

// TUTAJ DODAJ ADNOTACJE
@AnnotationProcessor.MyDocumentation(comment = "Jakis komentarz Adasia!")

public class AnnotationProcessor {

    private static List SKIP_METHODS = Arrays.asList("equals", "toString", "hashCode", "annotationType");

    public static void printAnnotationDetails(Annotation annotation) throws InvocationTargetException, IllegalAccessException {
        System.out.println("Znalazłem adnotacje: " + annotation);
        for (Method method : annotation.annotationType().getMethods()) {
            if (SKIP_METHODS.contains(method.getName())) {
                continue;
            }
            System.out.println("Nazwa elementu: " + method.getName());
            System.out.println("Wartosc elementu: " + method.invoke(annotation));
            System.out.println("Wartosc domyslna elementu: " + method.getDefaultValue());
            System.out.println();
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Target({ElementType.TYPE, ElementType.METHOD})
    public @interface MyDocumentation {

        String author() default "Adam Kakuba";
        String comment();
    }
}