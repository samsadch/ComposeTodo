# ComposeTodo
Android Todo Application using Jetpack Compose


## Compose playground: To Do App


Compose for learning purpose

* UI completely in [Jetpack Compose](https://developer.android.com/jetpack/compose)
* Uses [Kotlin Coroutines](https://kotlinlang.org/docs/reference/coroutines/coroutines-guide.html)
* Uses [Kotlin Flow](https://kotlinlang.org/docs/flow.html)
* Uses many of the [Architecture Components](https://developer.android.com/topic/libraries/architecture/), including: Room, DataStore, Navigation, ViewModel
* Uses [Hilt](https://dagger.dev/hilt/) for dependency injection

## Prerequisites

* Android Studio Electric Eel | 2022.1.1
* Min SDK 21
* Target SDK 33
* Java 11
* Kotlin 1.7.21

## Setup

1. Clone this repository, `git clone https://github.com/samsadch/ComposeTodo.git`
2. Open via [Android studio](https://developer.android.com/studio)
3. Sync the project, **File -> Sync Project with Gradle files**

## How to build

* Generate debug apk `./gradlew assembleDebug`
* Run unit test `./gradlew testDebug`
* Install on connected device `./gradlew installDebug`
