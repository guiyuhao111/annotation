package day01;

import java.lang.annotation.*;

/**
 * Created by Administrator on 2017/12/2.
 * 使用类似于接口方法声明的方式来定义注解的属性：
 * 其中返回值成为注解的类型 方法名为属性的名称
 * @Retention注解：只能够用于修饰一个Annotation定义，
 * 用于指定该Annotation可以保留多长时间，@Rentention包含一个
 * RetentionPolicy类型的成员变量：
 * @RetentionPolicy.Class编译器会把注释记录在class文件中，当运行
 * java程序时，JVM不会保留注释，这是，默认值
 * @RetentionPloicy.Runtime编译器将把注解记录在class文件中，当运行(可以在.class中存在)
 * java程序时，JVM会保留注释，程序可以通过反射获取该注解(可以在运行时存在，反射用到的注解必须是Runtime)
 * @RetentionPolicy.Source:编译器直接丢掉这种策略的注解(只有在.java文件中存在)
 *
 * @Target:注解用于修饰annotation的定义，用于指定被修饰的annotation
 * 能用于修饰那些程序元素(类，方法，属性等等...)，@Target也包含一个名为value的成员变量
 *
 * @Documented:用于指定被改元annotation修饰的annotation类将被javadoc
 * 工具提取成文档
 *
 * @Inherited：被它修饰的Annotation将具有继承性，如果某个类使用了被@Inheriterd
 * 修饰的annotation，则其子类自动具有该注释
 *
 * value属性可省略，没写key代表省略
 */

/**
 * 元注解：描述注解的注解
 */
@Retention(value = RetentionPolicy.RUNTIME)
@Target(value={ElementType.METHOD,ElementType.TYPE})
@Documented
public @interface HelloAnnotation {
    String name();
    String value() default "";
    //定义一个戍卒变量
    String [] like();
}
