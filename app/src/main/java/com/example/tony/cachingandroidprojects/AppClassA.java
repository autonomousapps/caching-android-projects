package com.example.tony.cachingandroidprojects;

import com.example.library1.LibraryClassA;

public class AppClassA {

    public void hello() {
        new LibraryClassA().doAThing();
    }

    public void inject() {
        Injector injector = DaggerInjector.create();
        injector.newString();
        injector.newInt();
    }
}
