package com.example.tony.cachingandroidprojects;

import com.example.library1.LibraryClassAnnotated;
import com.example.library1.LibraryClassKotlin;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {
        LibraryClassKotlin.class,
        LibraryClassAnnotated.class
})
public interface Injector {

    String newString();
    int newInt();
}
