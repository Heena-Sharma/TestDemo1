# README #



### Assignment ###

* This application is for learning jetpack components like navigation, live Data, data binding. this projects has
single list of data which is showing using recycler view.
* Version- 1.0
* Reference- https://developer.android.com/jetpack/getting-started

### How do I get set up? ###
This project uses the Gradle build system. To build this project
* Summary of set up
- this project setup with MVVM, Data binding, Live Data, Used json data from assests folder named with "testdata.json"



### Dependencies###-
- [AppCompat] - Degrade gracefully on older versions of Android.
  'androidx.appcompat:appcompat:1.3.1'
- [Android KTX]  - Write more concise, idiomatic Kotlin code.
  'androidx.core:core-ktx:1.6.0'
- [Data Binding] - Declaratively bind observable data to UI elements. enabled Data Binding in gradle file.
   buildFeatures {
        viewBinding true
        dataBinding true
    }
-[Material UI]- For creating UI using support material dependency.
'com.google.android.material:material:1.4.0'
-[Constraint Layout]- for Creating UI Used constraint layout for container in which we can add other views and widgets also.
'androidx.constraintlayout:constraintlayout:2.1.0'
[GSON]- Used for converting Json to POJO .
'com.google.code.gson:gson:2.8.6'
-[Lifecycles] - Create a UI that automatically responds to lifecycle events.
'androidx.core:core-ktx:1.6.0'
- [LiveData]- Build data objects that notify views when the underlying database changes.
'androidx.core:core-ktx:1.6.0'
- [Navigation] - Handle everything needed for in-app navigation.
'androidx.navigation:navigation-fragment-ktx:2.3.5'
 'androidx.navigation:navigation-ui-ktx:2.3.5'
- [Glide]- for image loading
glideVersion used-  '4.10.0'
 kapt "com.github.bumptech.glide:compiler:$rootProject.glideVersion"
 implementation "com.github.bumptech.glide:glide:$rootProject.glideVersion"
- [Hilt]- for [dependency injection]
"com.google.dagger:hilt-android:2.38.1"
- [sdp-android]- used for dimensions(for different screen sizes)
'com.intuit.sdp:sdp-android:1.0.6'



### Screenshots###

-[Record List](screenshots/recordList.png "A list of records")

