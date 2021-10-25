ISSUE stacktrace:
/Users/maksym.barchynskyi/Dev/android/ValuePickerJava8Issue/app/build/generated/data_binding_base_class_source_out/debug/out/com/example/valuepickerjava8issue/databinding/ActivityMainBinding.java:
12: error: cannot access ValuePickerView import com.paulrybitskyi.valuepicker.ValuePickerView; ^ bad
class file:
/Users/maksym.barchynskyi/.gradle/caches/transforms-3/9973bcbbd76f413a65af1b3636c29770/transformed/jetified-valuepicker-1.0.2-api.jar(
com/paulrybitskyi/valuepicker/ValuePickerView.class)
class file has wrong version 55.0, should be 52.0 Please remove or make sure it appears in the
correct subdirectory of the classpath.

Preconditions:
Android Studio Arctic Fox | 2020.3.1 Build #AI-203.7717.56.2031.7583922, built on July 26, 2021
Runtime version: 11.0.10+0-b96-7281165 x86_64

How to reproduce:
1. ValuePicker version 1.0.2
2. Gradle JDK version 1.8 (1.8.0_191)
3. Compile project

Notes:
There are no issues when Gradle JDK is set to 11