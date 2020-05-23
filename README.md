# Print
Print is a simple library to print messages for debugging in anroid studio.

## Features
* This library allows you to print simple debug/error messages in the console easily. It is not different from the debug function in android, but it has some extra features like you can pass the function name to find any errors quickly, you can show toast if requrie, etc.

## Latest Release
 [![](https://jitpack.io/v/westbeng/print.svg)](https://jitpack.io/#westbeng/print)

## Getting Started
* **Step 1** Add the JitPack repository to your build file
  ```
  allprojects {
      repositories {
        ...
        maven { url 'https://jitpack.io' }
      }
    }
  ```
 * **Step 2** Add the dependency
   ```
   dependencies {
            implementation 'com.github.westbeng:print:LatestReleaseCode'
    }
   ```
## How to Use
  ### Use of functions

  * ***Print.d()*** - *to print debug messages*
  
  * ***Print.e()*** - *to print error messages*
  
  * ***Print.i()*** - *to print info messages*
  
  * ***Print.w()*** - *to print warning messages*
  
  ### Example

  * ***Simple messsage***
  ```
  Print.d(ctx, message);
  ```
  
  * ***Message with toast***
  ```
  Print.d(ctx, message, true);
  ```
  
  * ***Message with function name***
  ```
  Print.d(ctx, message, functionName);
  ```
    
  * ***Message with function name & toast***
  ```
  Print.d(ctx, message, functionName, true);
  ```

## Authors
* **Westbeng** - *Initial work* - [Visit Website](https://westbeng.com), [Visit GitHub](https://github.com/westbeng)

See also the list of [contributors](https://github.com/westbeng/print/contributors) who participated in this project.

## Built With
* **Android Studio** - [Know more](https://developer.android.com/studio/intro), [Download](https://developer.android.com/studio)

## License
This project is licensed under the MIT License - see the [LICENSE](https://github.com/westbeng/print/blob/master/LICENSE) file for details
