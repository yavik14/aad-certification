# Associated Android Developer certification preparation

## Exam Content
### 1. Testing and debugging
* 1.1 Write and execute local JVM unit tests
	* [Android Dev: Fundamentals of Testing](https://developer.android.com/training/testing/fundamentals)
	* [Code Lab: Unit Test
](https://codelabs.developers.google.com/codelabs/android-training-unit-tests/index.html?index=..%2F..android-training#0)
	* [Code Lab: Unit testing with JUnit and Mockito](https://codelabs.developers.google.com/codelabs/android-testing/index.html?index=..%2F..android-training#5)
* 1.2 Write and execute Android UI tests
	* [Android Dev: Automate UI Test](https://developer.android.com/training/testing/ui-testing/) 
	* [Code Lab: Espresso for UI testing](https://codelabs.developers.google.com/codelabs/android-training-espresso-for-ui-testing/index.html?index=..%2F..android-training#0)
* 1.3 Use the system log to output debug information
	* [Android Dev: Write & view logs with Logcat](https://developer.android.com/studio/debug/am-logcat)
	* [Code Lab: Add Log Statements to your app](https://codelabs.developers.google.com/codelabs/android-training-hello-world/index.html?index=..%2F..android-training#7)
	
* 1.4 Debug and fix issues with an app's functional behavior and usability
	* [Android Dev: Debug your app](https://developer.android.com/studio/debug/)
	* [Code Lab: Android Studio debugger](https://codelabs.developers.google.com/codelabs/android-training-using-debugger/index.html?index=..%2F..android-training#0)


### 2. User interface (UI) and app functionality
* 2.1 Create an Activity that displays a layout
	* [Android Dev: App Fundamentals](https://developer.android.com/guide/components/fundamentals)
* 2.2 Construct a UI with ConstraintLayout
	* [Android Dev: Build a responsive UI with ConstraintLayout](https://developer.android.com/training/constraint-layout/) 
	* [Building interfaces with ConstraintLayout](https://www.youtube.com/watch?time_continue=9&v=XamMbnzI5vE)
* 2.3 Create a custom view class and add it to a layout
	* [Android Dev: Custom view components](https://developer.android.com/guide/topics/ui/custom-components)
* 2.4 Apply content descriptions to views for accessibility
	* [Android Dev: Build more accesible custom views](https://developer.android.com/guide/topics/ui/accessibility/custom-views) 
	* [Adding accesibility features to apps](https://www.youtube.com/watch?v=1by5J7c5Vz4) 
	* [Android Dev: setContentDescription()](https://developer.android.com/reference/android/view/View#setContentDescription(java.lang.CharSequence))
* 2.5 Implement a custom app theme
	* [Android Dev: Styles and Themes](https://developer.android.com/guide/topics/ui/look-and-feel/themes)
	* [Code Lab: Drawables, Styles and Themes](https://codelabs.developers.google.com/codelabs/android-training-drawables-styles-and-themes/index.html?index=..%2F..android-training#3) 
	* [Code Lab: Themes and final touches](https://codelabs.developers.google.com/codelabs/android-training-drawables-styles-and-themes/index.html?index=..%2F..android-training#5)
* 2.6 Display items in a RecyclerView
	* [Android Dev: Create list with RecyclerView](https://developer.android.com/guide/topics/ui/layout/recyclerview) 
* 2.7 Bind local data to a RecyclerView list using the paging library
	* [Code Lab: Paging Library](https://codelabs.developers.google.com/codelabs/android-paging/#0) 
* 2.8 Implement menu-based or drawer navigation
	* [Android Dev: Create a navigation drawer](https://developer.android.com/training/implementing-navigation/nav-drawer)
	* [Code Lab: Menu and pickers](https://codelabs.developers.google.com/codelabs/android-training-menus-and-pickers/index.html?index=..%2F..android-training#0) 
	* [Code Lab: User Navigation](https://codelabs.developers.google.com/codelabs/android-training-provide-user-navigation/index.html?index=..%2F..android-training#0)
* 2.9 Localize the app
	* [Android Dev: Localize your App](https://developer.android.com/guide/topics/resources/localization)
* 2.10 Display notifications, toasts, and snackbar messages
	* [Android Dev: Toast](https://developer.android.com/guide/topics/ui/notifiers/toasts)
	* [Android Dev: Snackbar](https://developer.android.com/reference/android/support/design/widget/Snackbar)
	* [Code Lab: Notifications](https://codelabs.developers.google.com/codelabs/android-training-notifications/index.html?index=..%2F..android-training#0)
* 2.11 Schedule a background task using JobScheduler
	* [Android Dev: Job Scheduler](https://developer.android.com/reference/android/app/job/JobScheduler) 
* 2.12 Efficiently run jobs in the background
	* [Code Lab: JobScheduler](https://codelabs.developers.google.com/codelabs/android-training-job-scheduler/index.html?index=..%2F..android-training#0) 
	

### 3. App data and files
* [3.1 Define data using Room entities](https://github.com/yavik14/aad-certification/tree/feature/3.1_Define-data-using-Room-entities)
	* [Room Introduction](https://android.jlelse.eu/android-architecture-components-room-introduction-4774dd72a1ae) 
	* [Room relationships](https://android.jlelse.eu/android-architecture-components-room-relationships-bf473510c14a)
	* [Android Dev: Room Persistence Library](https://developer.android.com/topic/libraries/architecture/room) 
	* [Code Lab: Android Persistence](https://codelabs.developers.google.com/codelabs/android-persistence/#0)
* 3.2 Access Room database with data access object (DAO)
	* [Android Dev: Save local data using Room](https://developer.android.com/training/data-storage/room/) 
	* [SQLite Cheat Sheet](http://www.sqlitetutorial.net/sqlite-cheat-sheet/)
	* [Code Lab: Android Room with View](https://codelabs.developers.google.com/codelabs/android-room-with-a-view/#0)
* 3.3 Observe and respond to changing data using LiveData
	* [Android Dev: View Model Overview](https://developer.android.com/topic/libraries/architecture/viewmodel#java) 
	* [Android Dev: Handling Lifecycles with Lifecycle-Aware Components](https://developer.android.com/topic/libraries/architecture/lifecycle)
	* [ViewModels Persistence OnSaveInstanceState](https://medium.com/androiddevelopers/viewmodels-persistence-onsaveinstancestate-restoring-ui-state-and-loaders-fc7cc4a6c090)
	* [Code Lab: Android Lifecycles](https://codelabs.developers.google.com/codelabs/android-lifecycles/#0)
	* [Architecture Componens BasicSample](https://github.com/googlesamples/android-architecture-components/tree/master/BasicSample)
* [3.4 Use a Repository to handle data operations](https://github.com/yavik14/aad-certification/tree/feature/3.4_repository_patter_operations)
	* [Retrofit](http://square.github.io/retrofit/)
	* [The Evolution of Repository Pattern](http://hannesdorfmann.com/android/evolution-of-the-repository-pattern) 
	* [Simple Cache Mapping](https://codereview.stackexchange.com/questions/123801/simple-timed-cache-by-wrapping-hashmap)
* [3.5 Read and parse raw resources or asset files](https://github.com/yavik14/aad-certification/tree/feature/3.5_read_parse_raw_and_assets)
	* [Android Dev: AssetsManager](https://developer.android.com/reference/android/content/res/AssetManager) 
	* [AssetsManager example](https://www.concretepage.com/android/android-assetmanager-example-to-load-image-from-assets-folder)
	* [Android Dev: Resource provision](https://developer.android.com/guide/topics/resources/providing-resources?hl=es-419)
	* [File from raw example](https://stackoverflow.com/questions/4087674/android-read-text-raw-resource-file)
* 3.6 Create persistent preference data from user input
	* [Android Dev: Shared Preferences](https://developer.android.com/reference/android/content/SharedPreferences.Editor) 
	* [Code Lab: Shared Preferences](https://codelabs.developers.google.com/codelabs/android-training-shared-preferences/index.html?index=..%2F..android-training#0)
* 3.7 Change the behavior of the app based on user preferences
	* [Code Lab: App Settings](https://codelabs.developers.google.com/codelabs/android-training-adding-settings-to-app/index.html?index=..%2F..android-training#1) 