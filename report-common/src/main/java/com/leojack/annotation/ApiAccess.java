package com.leojack.annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * @author leojack
 * @message 控制接口访问权限
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ApiAccess {

    Level value();

    enum Level {
        GUEST(0),
        PARTENER(1),
        OPS(1),
        ADMIN(4);

        int property;

         Level(int property){
            this.property = property;
        }

        public int getProperty() {
            return this.property;
        }
    }

}
