package com.example.library1

import dagger.Module
import dagger.Provides

@Module
object LibraryClassKotlin {
    @Provides @JvmStatic fun newString() = "Hello"
}