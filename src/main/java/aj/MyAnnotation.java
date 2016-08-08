package aj;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.CLASS;

/**
 * Created by xesamguo@gmail.com on 16-8-8.
 */
@Target({TYPE, METHOD, CONSTRUCTOR})
@Retention(CLASS)
public @interface MyAnnotation {
    String value();
}
