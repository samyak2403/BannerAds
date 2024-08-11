//*
// * Created by Samyak kamble on 8/11/24, 8:29 PM
// *  Copyright (c) 2024 . All rights reserved.
// *  Last modified 8/11/24, 8:29 PM
// */
//
package com.samyak2403.bannerad



import android.app.Activity
import android.util.DisplayMetrics
import android.widget.LinearLayout
import android.widget.Toast
import com.google.android.gms.ads.AdListener
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdSize
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.LoadAdError

class Control(private val activity: Activity) {

    fun loadBannerAd(linearLayoutId: Int, adUnitId: String) {
        val linearLayout: LinearLayout? = activity.findViewById(linearLayoutId)
        if (linearLayout != null) {
            val adView = AdView(activity)
            adView.adUnitId = adUnitId

            val adSize = getAdSize()
            adView.setAdSize(adSize)

            linearLayout.addView(adView)
            adView.adListener = object : AdListener() {
                override fun onAdClicked() {
                    super.onAdClicked()
                }

                override fun onAdClosed() {
                    super.onAdClosed()
                }

                override fun onAdFailedToLoad(loadAdError: LoadAdError) {
                    super.onAdFailedToLoad(loadAdError)
                    // Toast.makeText(activity, "Ad Failed", Toast.LENGTH_SHORT).show()
                }

                override fun onAdImpression() {
                    super.onAdImpression()
                }

                override fun onAdLoaded() {
                    super.onAdLoaded()
                }

                override fun onAdOpened() {
                    super.onAdOpened()
                }
            }
            val adRequest = AdRequest.Builder().build()
            adView.loadAd(adRequest)
        } else {
            Toast.makeText(activity, "LinearLayout not found", Toast.LENGTH_SHORT).show()
        }
    }

    private fun getAdSize(): AdSize {
        val outMetrics = DisplayMetrics()
        activity.windowManager.defaultDisplay.getMetrics(outMetrics)
        val density = outMetrics.density

        val adWidthPixels = outMetrics.widthPixels.toFloat()
        val adWidth = (adWidthPixels / density).toInt()

        return AdSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(activity, adWidth)
    }
}
