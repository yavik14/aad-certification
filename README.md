# Associated Android Developer certification preparation

## Exam Content
### 1. Testing and debugging
* 1.1 Write and execute local JVM unit tests
* 1.2 Write and execute Android UI tests
* 1.3 Use the system log to output debug information
* 1.4 Debug and fix issues with an app's functional behavior and usability

### 2. User interface (UI) and app functionality
* 2.1 Create an Activity that displays a layout
* 2.2 Construct a UI with ConstraintLayout
* 2.3 Create a custom view class and add it to a layout
* 2.4 Apply content descriptions to views for accessibility
* 2.5 Implement a custom app theme
* 2.6 Display items in a RecyclerView
* 2.7 Bind local data to a RecyclerView list using the paging library
* 2.8 Implement menu-based or drawer navigation
* 2.9 Localize the app
* 2.10 Display notifications, toasts, and snackbar messages
* 2.11 Schedule a background task using JobScheduler
* 2.12 Efficiently run jobs in the background

### 3. App data and files
* [3.1 Define data using Room entities](https://github.com/yavik14/aad-certification/tree/feature/3.1_Define-data-using-Room-entities)
	* [Room Introduction](https://android.jlelse.eu/android-architecture-components-room-introduction-4774dd72a1ae) 
	* [Room relationships](https://android.jlelse.eu/android-architecture-components-room-relationships-bf473510c14a)
	* [Room Persistence Library](https://developer.android.com/topic/libraries/architecture/room) 
	* [Android Persistence Codelab](https://codelabs.developers.google.com/codelabs/android-persistence/#0)
* 3.2 Access Room database with data access object (DAO)
	* [Save local data using Room](https://developer.android.com/training/data-storage/room/) 
	* [SQLite Cheat Sheet](http://www.sqlitetutorial.net/sqlite-cheat-sheet/)
	* [Android Room with View Codelab](https://codelabs.developers.google.com/codelabs/android-room-with-a-view/#0)
* 3.3 Observe and respond to changing data using LiveData
	* [View Model Overview](https://developer.android.com/topic/libraries/architecture/viewmodel#java) 
	* [Handling Lifecycles with Lifecycle-Aware Components](https://developer.android.com/topic/libraries/architecture/lifecycle)
	* [ViewModels Persistence OnSaveInstanceState](https://medium.com/androiddevelopers/viewmodels-persistence-onsaveinstancestate-restoring-ui-state-and-loaders-fc7cc4a6c090)
	* [Android Lifecycle CodeLab](https://codelabs.developers.google.com/codelabs/android-lifecycles/#0)
	* [Architecture Componens BasicSample](https://github.com/googlesamples/android-architecture-components/tree/master/BasicSample)
* [3.4 Use a Repository to handle data operations](https://github.com/yavik14/aad-certification/tree/feature/3.4_repository_patter_operations)
	* [Retrofit](http://square.github.io/retrofit/)
	* [The Evolution of Repository Pattern](http://hannesdorfmann.com/android/evolution-of-the-repository-pattern) 
	* [Simple Cache Mapping](https://codereview.stackexchange.com/questions/123801/simple-timed-cache-by-wrapping-hashmap)
* [3.5 Read and parse raw resources or asset files](https://github.com/yavik14/aad-certification/tree/feature/3.5_read_parse_raw_and_assets)
	* [AssetsManager from Android Reference](https://developer.android.com/reference/android/content/res/AssetManager) 
	* [AssetsManager example](https://www.concretepage.com/android/android-assetmanager-example-to-load-image-from-assets-folder)
	* [Resource provision from Android Reference](https://developer.android.com/guide/topics/resources/providing-resources?hl=es-419)
	* [File from raw example](https://stackoverflow.com/questions/4087674/android-read-text-raw-resource-file)
* 3.6 Create persistent preference data from user input
* 3.7 Change the behavior of the app based on user preferences