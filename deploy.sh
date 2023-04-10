#! /bin/bash

### Please run `emulator -avd Automotive_API_33 -writable-system` and wait for the emulator started, then run this script

# 1. build the apk
./gradlew :app:assembleDebug

# 2. sign the app the system signature
apksigner sign --key platform.pk8 --cert platform.x509.pem app/build/outputs/apk/debug/TwCarService.apk

# 3. remount the emulator file system
adb root
adb remount

# 4. remove origin carservice
adb shell "rm -r system/priv-app/CarService/CarService.apk"
adb shell "rm -r system/priv-app/CarService/TwCarService.apk"
adb shell "rm -r system/priv-app/CarService/oat"

# 5. push the apk file to system directory
adb push app/build/outputs/apk/debug/TwCarService.apk system/priv-app/CarService

# 6. reboot
adb reboot