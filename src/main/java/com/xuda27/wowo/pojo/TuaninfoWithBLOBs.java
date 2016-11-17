package com.xuda27.wowo.pojo;

public class TuaninfoWithBLOBs extends Tuaninfo {
    private String tip;

    private String intr;

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip == null ? null : tip.trim();
    }

    public String getIntr() {
        return intr;
    }

    public void setIntr(String intr) {
        this.intr = intr == null ? null : intr.trim();
    }
}