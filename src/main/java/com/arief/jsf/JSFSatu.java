package com.arief.jsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class JSFSatu {


    public JSFSatu() {
        System.err.println("constructor-dipanggil");
    }

    public JSFSatu(String a) {
        A = a;
    }

    private String A = "Hallo";


    public String getA() {
        return A;
    }

    public void setA(String a) {
        this.A = a;
    }
}
