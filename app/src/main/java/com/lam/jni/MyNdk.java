package com.lam.jni;

public class MyNdk {
    static {
        System.loadLibrary("MyLibrary");    
}   
    public native String getString();
}