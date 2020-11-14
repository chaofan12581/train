package com.bjpowernode.bean;

import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "t_train")
public class Train {
    @Id
    @KeySql(useGeneratedKeys = true)
    private String tid;
    private String tnumber;
    private String taddress;
    private String ttime;
    private String ttype;

    @Override
    public String toString() {
        return "Train{" +
                "tid='" + tid + '\'' +
                ", tnumber='" + tnumber + '\'' +
                ", taddress='" + taddress + '\'' +
                ", ttime='" + ttime + '\'' +
                ", ttype='" + ttype + '\'' +
                '}';
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getTnumber() {
        return tnumber;
    }

    public void setTnumber(String tnumber) {
        this.tnumber = tnumber;
    }

    public String getTaddress() {
        return taddress;
    }

    public void setTaddress(String taddress) {
        this.taddress = taddress;
    }

    public String getTtime() {
        return ttime;
    }

    public void setTtime(String ttime) {
        this.ttime = ttime;
    }

    public String getTtype() {
        return ttype;
    }

    public void setTtype(String ttype) {
        this.ttype = ttype;
    }
}
