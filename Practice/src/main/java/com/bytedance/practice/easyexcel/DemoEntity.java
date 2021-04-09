package com.bytedance.practice.easyexcel;

import lombok.Data;

/**
 * @author freesia <yukaibo@bytedance.com>
 * @date 2020/11/1 4:05 下午
 **/
@Data
public class DemoEntity {

    private String shipmentNum;

    private String buyerId;

    private Double serviceScore;

    private Double transferScore;

    private String text;
}
