apply(from = "../dsl/android-library.gradle")
apply(from = "../dsl/ktlint.gradle")
apply(from = "../dsl/bintray.gradle")

dependencies {
    /**
     * Kotlin support
     */
    "api"("com.eaglesakura.armyknife.armyknife-runtime:armyknife-runtime:1.3.5")
    "api"("com.eaglesakura.armyknife.armyknife-jetpack:armyknife-jetpack:1.4.2")

    "compileOnly"("io.reactivex.rxjava2:rxkotlin:2.4.0")  // Reactive Extension
    "compileOnly"("io.reactivex.rxjava2:rxandroid:2.1.1")   // Reactive Extension
    "compileOnly"("androidx.activity:activity:1.1.0-rc02")
    "compileOnly"("androidx.activity:activity-ktx:1.1.0-rc02")
    "compileOnly"("androidx.annotation:annotation:1.1.0")
    "compileOnly"("androidx.appcompat:appcompat:1.1.0")
    "compileOnly"("androidx.appcompat:appcompat-resources:1.1.0")
    "compileOnly"("androidx.arch.core:core-common:2.1.0")
    "compileOnly"("androidx.arch.core:core-runtime:2.1.0")
    "compileOnly"("androidx.collection:collection:1.1.0")
    "compileOnly"("androidx.collection:collection-ktx:1.1.0")
    "compileOnly"("androidx.core:core:1.1.0")
    "compileOnly"("androidx.core:core-ktx:1.1.0")
    "compileOnly"("androidx.fragment:fragment:1.1.0")
    "compileOnly"("androidx.fragment:fragment-ktx:1.1.0")
    "compileOnly"("androidx.lifecycle:lifecycle-extensions:2.1.0")
    "compileOnly"("androidx.lifecycle:lifecycle-viewmodel:2.1.0")
    "compileOnly"("androidx.lifecycle:lifecycle-viewmodel-savedstate:1.0.0-rc02")
    "compileOnly"("androidx.lifecycle:lifecycle-viewmodel-ktx:2.1.0")
    "compileOnly"("androidx.lifecycle:lifecycle-runtime:2.1.0")
    "compileOnly"("androidx.lifecycle:lifecycle-common-java8:2.1.0")
    "compileOnly"("androidx.lifecycle:lifecycle-reactivestreams:2.1.0")
    "compileOnly"("androidx.lifecycle:lifecycle-reactivestreams-ktx:2.1.0")
    "compileOnly"("androidx.savedstate:savedstate:1.0.0")
}