package com.leojack.Enum;

/**
 * @author leojack
 * @message 基于SearchAble中的条件查询枚举
 */
public enum EffectOn {


     eq("="),

     gt(">"),

     lt("<"),

     ge(">="),

     le("<="),

     ne("!="),

     like("like"),

     in("in");


    private String value;


    EffectOn(String value) {
        this.value = value;
    }

    public String getValue(){
        return this.value;
    }
}
