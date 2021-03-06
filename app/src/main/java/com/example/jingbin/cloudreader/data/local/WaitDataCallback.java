package com.example.jingbin.cloudreader.data.local;

/**
 * @author jingbin
 * @data 2018/4/19
 * @Description
 */

public interface WaitDataCallback {

    /**
     * 返回数据为null
     */
    void onDataNotAvailable();

    /**
     * @param bean 返回数据
     */
    void getData(Wait bean);
}
