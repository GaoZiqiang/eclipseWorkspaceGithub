package cn.edu.sdut.softlab.exercise;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import javax.inject.Qualifier;

/**
 * Run的qualifier
 * @author gaoziqiang
 *
 */
@Qualifier
@Target({FIELD,PARAMETER})
@Retention(RUNTIME)
public @interface QuRun {
}
