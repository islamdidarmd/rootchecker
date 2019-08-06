# rootchecker
A class to verify if the device is rooted or not

[![](https://jitpack.io/v/islamdidarmd/LoadingButton.svg)](https://jitpack.io/v/islamdidarmd/LoadingButton)

## Installation (with Gradle)
Add the dependency to your root *build.gradle*:
```groovy
   repositories {
        jcenter()
        maven { url "https://jitpack.io" }
   }
   ```
Now add this dependency in your module *build.gradle*
```groovy
   dependencies {
         implementation 'com.github.islamdidarmd:rootchecker:$latest_release'
   }
```

### How to use
If you don't want to include this project in gradle, just copy `RootHelper.kt` class in your project and use it.
To get root status just do `RootHelper.getInstance().canRunRootCommands()`<br>This method returns a boolean

For a complete example see the sample app `https://github.com/islamdidarmd/rootchecker/tree/master/app`
