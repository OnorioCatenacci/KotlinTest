package com.riis.kotlintest

import android.support.v7.app.ActionBarActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem


public class MainActivity : ActionBarActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val t = TimeActivity()
        val times = t.GetTimesInMajorCities(array("America/New_York_City", "America/Chicago", "America/Denver", "America/Los_Angeles"))
    }
}
