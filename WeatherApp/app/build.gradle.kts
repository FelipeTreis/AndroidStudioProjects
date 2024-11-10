plugins {
    id("com.android.application") // Sem versão
    id("org.jetbrains.kotlin.android") // Sem versão
}

android {
    compileSdk = 33
    namespace = "com.example.weatherapp"

    defaultConfig {
        applicationId = "com.example.weatherapp"
        minSdk = 21
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    // Outras dependências...
}
