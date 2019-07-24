import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;

public class Main extends AnnotationProcessor {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        for (Annotation classAnnotation : AnnotationProcessor.class.getDeclaredAnnotations()) {
            printAnnotationDetails(classAnnotation);
        }
    }
}
