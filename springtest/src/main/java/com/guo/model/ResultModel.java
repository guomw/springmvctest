package com.guo.model;

import com.guo.enums.ApiRequestCode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by MengWen Guo on 2016/09/14.
 * Created Date 2016/09/14.
 */

public class ResultModel {
    private int status;
    private String desc;
    private Object result;

    /**
     * 构造函数
     */
    public ResultModel() {
        this.status = 0;
        this.desc = "";
        this.result = null;
    }

    /**
     * 设置状态值
     *
     * @param apiRequestCode 状态值
     */
    public void setResult(ApiRequestCode apiRequestCode) {
        this.status = apiRequestCode.toInt();
        this.desc = apiRequestCode.toString();
        this.result = null;
    }

    /**
     * 设置状态值和对象
     *
     * @param apiRequestCode 状态值
     * @param data           对象
     */
    public void setResult(ApiRequestCode apiRequestCode, Object data) {
        this.status = apiRequestCode.toInt();
        this.desc = apiRequestCode.toString();
        this.result = data;
    }

    /**
     * 设置状态值、描述、对象
     *
     * @param apiRequestCode 状态值
     * @param _desc          状态描述
     * @param data           对象
     */
    public void setResult(ApiRequestCode apiRequestCode, String _desc, Object data) {
        this.status = apiRequestCode.toInt();
        this.desc = _desc;
        this.result = data;
    }

    /**
     * 将对象数据放入Map词典中
     */
    public Map getMap() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("status", this.status);
        map.put("desc", this.desc);
        map.put("result", this.result);
        return map;
    }
}
