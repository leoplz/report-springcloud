package com.leojack.utils;


import com.leojack.Enum.EffectOn;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author leojack
 * @message 链表形式的SearchFilter,采用头插法，灵感来自于jdk1.7的Entry对象
 */
@Data
@AllArgsConstructor
public class SearchFilter {

    private EffectOn effectOn;

    private String property;

    private Object value;

    private  SearchFilter nextSearchFilter;


}
