// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.compose) apply false
    dependencies {
        implementation 'androidx.appcompat:appcompat:1.4.0'
        implementation 'androidx.recyclerview:recyclerview:1.2.1'
        implementation 'com.squareup.retrofit2:retrofit:2.9.0'
        implementation 'com.squareup.retrofit2:converter-gson:2.9.0'
        implementation 'com.github.bumptech.glide:glide:4.12.0'
    }

