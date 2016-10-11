package annotations;

import java.lang.reflect.Method;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException {
		//1.使用类加载器
		Class class1 = Class.forName("annotations.Child");
		//2.找到类上面的注解
		boolean isExist =class1.isAnnotationPresent(Description.class);
		if(isExist){
			//3.拿到实例注解
			Description description = (Description) class1.getAnnotation(Description.class);
			System.out.println(description.desc());
		}
		Method[] ms = class1.getMethods();
		for(Method m:ms){
			boolean isMethodExist = m.isAnnotationPresent(Description.class);
			if(isMethodExist){
				Description methodAnnotation = m.getAnnotation(Description.class);
				System.out.println(methodAnnotation.age()+methodAnnotation.author()+methodAnnotation.desc());
			}
		}
	}
}
