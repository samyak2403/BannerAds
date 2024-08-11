# Banner Ad Integration

This repository contains a class for integrating Google AdMob banner ads into an Android application.

## Overview

The `Control` class helps you load and display banner ads using the Google Mobile Ads SDK. Follow the setup instructions below to integrate the banner ad into your Android project.

## Prerequisites

1. **Google Mobile Ads SDK**: Ensure you have added the Google Mobile Ads SDK to your project. Add the following dependency to your `build.gradle` file:

    ```groovy
    implementation 'com.google.android.gms:play-services-ads:22.0.0'
    ```

2. **AdMob Account**: You need an AdMob account to create an ad unit and obtain your Ad Unit ID for banner ads.

## Setup Instructions

### 1. Configure `activity_main.xml`

Open your `activity_main.xml` file and add a `LinearLayout` where you want the banner ad to be displayed. Assign an ID to this layout.

```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical">

    <!-- Other UI elements -->

    <LinearLayout
        android:id="@+id/bannerAdContainer"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal"/>
</LinearLayout>
```


