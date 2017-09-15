package com.rhy.stw.bean;

import java.io.Serializable;

/**
 * Created by yan_t on 2017-09-12.
 */
public class CheXi implements Serializable{
    private String chexi;

    public CheXi(String s) {
        chexi = s;
    }

    public String getChexi() {
        return chexi;
    }

    public void setChexi(String chexi) {
        this.chexi = chexi;
    }
}
