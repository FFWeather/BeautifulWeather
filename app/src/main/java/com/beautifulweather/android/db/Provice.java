package com.beautifulweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by linlinshi on 2018/5/23.
 */

public class Provice extends DataSupport {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    private int id;
    private String provinceName;
    private int  provinceCode;

}
