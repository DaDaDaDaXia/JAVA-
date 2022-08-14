package com.tz.java1;

public class Zhan {
    private int zhen = 0;
    Object[] obj;
    public Zhan(){
        obj = new Object[10];
    }
    public Zhan(int len) {
        obj = new Object[len];
    }

    public void ru(Object obj){
        if (zhen >= this.obj.length){
            System.out.println("栈满了。");
        }
        else {
            this.obj[zhen] = obj;
            zhen += 1;
        }
    }
    public void chu(){
        if (zhen == 0){
            System.out.println("栈是空的。");
        }else {
            this.obj[zhen] = 0;
            zhen -= 1;
        }
    }

    public int getZhen() {
        return zhen-1;
    }

    public void setZhen(int zhen) {
        this.zhen = zhen;
    }
}
