## BannerAds  Library
>Android library for add Naive Ads .

## Update
- Updated to the latest version of Admob SDK
- Supported on Android SDK 30, 31, 32, 33, 34
- Updated RVAdapter to Kotlin

## For developer
To make your app can earn more revengue ` by Showing Native Ads into RecyclerView list items `. Please check more details from below.

## How to use NaiveAds RecyclerView Library
Step 1. Add the JitPack repository to your build file 
  ```
  allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  ```
  If you are using Android Studio Bumble bee or latest version, add JitPack repository to `settings.gradle` file.
  ```
  dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven { url 'https://jitpack.io' } // add this line
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

 import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        enableEdgeToEdge();
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            WindowInsetsCompat.Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Initialize Control class and load the banner ad
        Control control = new Control(this);
        String adUnitId = getString(R.string.admob_banner_id); // Fetch the AdMob banner ID from resources
        control.loadBannerAd(R.id.bannerAdContainer, adUnitId);
    }
}

  

      

## Demo
Native ads Small Layout |  Native ads Medium Layout
:-------------------------:|:-------------------------:
<img src="1.png" width="250px"/>  |  <img src="2.png" width="250px"/> 
