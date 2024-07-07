plugins {
    alias(libs.plugins.androidApplication)
}

android {
    namespace = "com.abdullah.tvshowsbyabdullah"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.abdullah.tvshowsbyabdullah"
        minSdk = 21
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    buildFeatures {
        dataBinding = true
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)

    // Material Design
    implementation (libs.material)

    //Retrofit & Gson
    implementation ("com.squareup.retrofit2:retrofit:2.9.0")
    implementation ("com.squareup.retrofit2:converter-gson:2.9.0")

    // Picasso
    implementation ("com.squareup.picasso:picasso:2.71828")

    //Lifecycle Extensions
    implementation ("androidx.lifecycle:lifecycle-extensions:2.2.0")

    // Room & RxJava Support
    implementation ("androidx.room:room-runtime:2.6.1")
    implementation ("androidx.room:room-rxjava2:2.6.1")
    annotationProcessor ("androidx.room:room-compiler:2.6.1")

    // RxJava
    implementation ("io.reactivex.rxjava2:rxandroid:2.0.1")

    // Scalable Size Units
    implementation ("com.intuit.sdp:sdp-android:1.0.6")
    implementation ("com.intuit.ssp:ssp-android:1.0.6")

// Rounded Image View
    implementation ("com.makeramen:roundedimageview:2.3.0")
}