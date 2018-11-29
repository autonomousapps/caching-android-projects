package com.example.library1;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class LibraryClassAnnotated {
    @Provides static int provideInt() {
        return 1;
    }
}
