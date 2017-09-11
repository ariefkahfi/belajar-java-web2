package com.arief.jsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class Welcome2 {

    public Welcome2() {
        System.err.println(this.getClass().getSimpleName()+"" + "Dipanggil");
    }

    private String a = "Hello";

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }



    public String hello(){
        return "Hello World";
    }
}
