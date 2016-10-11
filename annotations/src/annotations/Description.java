package annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Target({ElementType.METHOD,ElementType.TYPE})//指定到特定的方法
@Retention(RetentionPolicy.RUNTIME)
@Inherited//允许子类继承
@Documented//生成java doc
public @interface Description {

	String desc();
	String author();
	int age() default 18;
	
}
