package cloud.apposs.rest.validator.checker;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 被注释的字符串的大小必须在指定的范围内
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Length {
    /**
     * 是否强制需要此值
     */
    boolean require() default true;

    /**
     * 最小值
     */
    int min() default Integer.MIN_VALUE;

    /**
     * 最大值
     */
    int max() default Integer.MAX_VALUE;

    /**
     * 错误消息输出
     */
    String message() default "";
}
