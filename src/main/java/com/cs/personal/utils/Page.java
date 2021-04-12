package com.cs.personal.utils;

import lombok.Data;

import java.util.List;

/**
 * @author ：chenshuo
 * @date ：Created in 2021/4/12 14:40
 * @description：分页对象
 * @version: 1.0$
 */
@Data
public class Page<T> {
    /**
     * 起始页数
     */
    private int page;
    /**
     * 每页显示数量
     */
    private int size;
    /**
     * 返回数据集合
     */
    private List<T> rows;
    /**
     * 总数据量
     */
    private long total;
}
