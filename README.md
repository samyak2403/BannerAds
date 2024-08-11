# BannerAds Library

An Android library for integrating Native Ads into your RecyclerView list items.

## Update

- Updated to the latest version of Admob SDK
- Supported on Android SDK 30, 31, 32, 33, 34
- Updated RVAdapter to Kotlin

## For Developers

To maximize your app's revenue by displaying Native Ads within RecyclerView list items, follow the instructions below.

## How to Use the NaiveAds RecyclerView Library

### Step 1: Add the JitPack Repository

Add the JitPack repository to your project’s build file:

**For Gradle (in `settings.gradle` for Android Studio Bumblebee or later):**

```gradle
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven { url 'https://jitpack.io' } // Add this line
    }
}
```
  
  
Step 2. Add the dependency
  

	dependencies {
	        implementation 'com.github.samyak2403:BannerAds:1.0.1'
	}


Step 3. In your MainActivity.kt, add the following code to initialize and load the banner ad:

kotlin:

  

        class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Initialize Control class and load the banner ad
        val control = Control(this)
        val adUnitId = getString(R.string.admob_banner_id) // Fetch the AdMob banner ID from resources
        control.loadBannerAd(R.id.bannerAdContainer, adUnitId)
    }
}
           
 If you prefer Java, use the following setup in your MainActivity.java:


        // Initialize Control class and load the banner ad
        Control control = new Control(this);
        String adUnitId = getString(R.string.admob_banner_id); // Fetch the AdMob banner ID from resources
        control.loadBannerAd(R.id.bannerAdContainer, adUnitId);
 
  

      

## Demo
Native ads Small Layout |  Native ads Medium Layout
:-------------------------:|:-------------------------:
<img src="1.png" width="250px"/>  |  <img src="2.png" width="250px"/> 
