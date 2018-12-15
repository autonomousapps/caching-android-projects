plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-kapt")
}
android {
    compileSdkVersion(28)

    defaultConfig {
        minSdkVersion(21)
        targetSdkVersion(28)
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "android.support.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("debug") {
            isMinifyEnabled = project.hasProperty("minify")
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }

        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }

    sourceSets {
        getByName("main").java.srcDir("src/main/kotlin")
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${rootProject.ext.get("kotlin_version")}")
    implementation("com.google.dagger:dagger:2.16")
    kapt("com.google.dagger:dagger-compiler:2.16")

    implementation("com.android.support:appcompat-v7:28.0.0")
    testImplementation("junit:junit:4.12")
}

tasks.withType(JavaCompile::class) {
    doLast {
        println("Hello")
    }
}

//open class CustomTask : DefaultTask() {
//
//    @Input
//    fun input() = "hola"
//
//    @OutputFile
//    fun output() = project.file("$buildDir/out")
//
//    @TaskAction
//    fun action() {
//        println("Hello")
////        output().writeText(input())
//    }
//}
//
//tasks.register("custom", CustomTask::class) {
//    doFirst {
//        println("Goodbye")
//    }
//}

//tasks.getByName("custom") {
//    doFirst {
//        println("FU")
//    }
//}