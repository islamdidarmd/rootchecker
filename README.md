# rootchecker
A class to verify if the device is rooted or not

[![](https://jitpack.io/v/droidbond/LoadingButton.svg)](https://jitpack.io/v/droidbond/LoadingButton)

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
         implementation 'com.github.droidbond:rootchecker:$latest_release'
   }
```

### How to use
If you don't want to include this project with gradle just copy `RootHelper.kt` class in your project and import.
To get root status just do `RootHelper.getInstance().canRunRootCommands()`
`canRunRootCommands()` method returns a boolean

For a complete example see the sample app `https://github.com/droidbond/rootchecker/tree/master/app`
