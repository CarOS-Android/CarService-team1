set -e

./gradlew car-lib:assembleRelease
./gradlew car-lib:publish