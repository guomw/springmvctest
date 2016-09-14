package com.guo.enums;

/**
 * Created by MengWen Guo on 2016/09/14.
 * Created Date 2016/09/14.
 */

public enum ApiRequestCode {

    OK(200,"OK"),
    ERROR(0,"错误")

    ;
    private int nCode;
    private String desc;
    ApiRequestCode(int _nCode,String _desc) {
        this.nCode = _nCode;
        this.desc=_desc;
    }
    @Override
    public String toString() {
        return this.desc;
    }

    public int toInt() {
        return nCode;
    }
}
