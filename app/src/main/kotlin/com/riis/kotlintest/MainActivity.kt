package com.riis.kotlintest

import android.support.v7.app.ActionBarActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView


public class MainActivity : ActionBarActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val t = TimeActivity()
        val times = t.GetTimesInMajorCities(array(getString(R.string.tz_name_New_York_City), getString(R.string.tz_name_Chicago), getString(R.string.tz_name_Denver), getString(R.string.tz_name_Los_Angeles)))
//        val initMsgTextView = getTextView("InitMsg")
    }
}
