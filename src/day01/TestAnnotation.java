package day01;

import day01.entity.User;

import java.lang.annotation.Annotation;

/**
 * Created by Administrator on 2017/12/2.
 */
public class TestAnnotation {
    @SuppressWarnings("unused")//抑制编译器警告
    public static void main(String[] args) throws ClassNotFoundException {
        A a=new A();
        //@Deprecated表明该方法是一个过期的方法,可以用，但不推荐使用
        a.method();
        String str="abc";
        //使用反射解析注解
        Class<?> c= Class.forName("day01.entity.User");
        Annotation[] annotations = c.getAnnotations();
        for(Annotation annotaion:annotations){
            System.out.println(annotaion);
            //判断是否是指定的注解
            if(c.isAnnotationPresent(HelloAnnotation.class)){
                HelloAnnotation helloAnnotation=(HelloAnnotation)annotaion;
                String[] like = helloAnnotation.like();
                helloAnnotation.value();
                String name = helloAnnotation.name();
                System.out.println(name+","+like);
            }
        }
    }
}
@HelloAnnotation(name="abc",like={"泡妞","美女"})//没有default的=属性可以不写，default内容为属性的值
class A{
    @Deprecated
    void method(){}
}

