package com.xuda27.wowo.pojo;

import java.math.BigDecimal;

public class Orderinfo {
    private Integer oid;

    private Integer cid;

    private BigDecimal wprice;

    private Integer nums;

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public BigDecimal getWprice() {
        return wprice;
    }

    public void setWprice(BigDecimal wprice) {
        this.wprice = wprice;
    }

    public Integer getNums() {
        return nums;
    }

    public void setNums(Integer nums) {
        this.nums = nums;
    }
}