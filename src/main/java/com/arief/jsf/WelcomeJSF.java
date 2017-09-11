package com.arief.jsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

@ManagedBean
@RequestScoped
public class WelcomeJSF {

    private String bla = "Hello JSF";
    private String myName="Hello World";

    public WelcomeJSF() {
        System.err.println(this.getClass().getSimpleName()+"" + "Called");
    }

    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }

    public String getBla() {
        return bla;
    }

    public void setBla(String bla) {
        this.bla = bla;
    }
}
