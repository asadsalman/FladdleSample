# FladleSample
Sample Android project that uses the `com.android.test` plugin to test with the [Fladle Plugin](https://runningcode.github.io/fladle/).


# Build APKs
Run:
```
./gradlew assembleDebug assembleDebugAndroidTest
```

# Run tests
```
./gradlew connectedDebugAndroidTest
```

# Flank Yaml:
```
gcloud:
  app: ./app/build/outputs/apk/debug/app-debug.apk
  test: ./testmodule2/build/outputs/apk/debug/testmodule2-debug.apk
```