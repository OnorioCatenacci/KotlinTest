package com.riis.kotlintest

import android.content.Context
import android.content.Intent
import android.support.v7.app.ActionBarActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.TextView


public class MainActivity : ActionBarActivity() {  //Note varName: type declaration

    companion object appContext{                                       //Note: companion object
        fun getApplicationContext():Context = getApplicationContext()  //Note: function definition is inlined
    }

    override fun onCreate(savedInstanceState: Bundle?) {  //Note Bundle is nullable
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val t = TimeActivity()
        val times = t.GetTimesInMajorCities(array(getString(R.string.tz_name_New_York_City), getString(R.string.tz_name_Chicago), getString(R.string.tz_name_Denver), getString(R.string.tz_name_Los_Angeles)))
        setTimeMessage(R.id.timeNYC,times,0)
        setTimeMessage(R.id.timeChicago, times, 1)
    }

    public fun setPreferences(view: View?){
        val preferencesIntent = Intent(this, javaClass<KotlinTestPreferences>())
        startActivity(preferencesIntent)
    }

    fun setTimeMessage(viewId:Int, arrayOfTimes:Array<CurrentTime>, cityIdx: Int ){
        val tv:TextView? = findViewById(viewId) as? TextView
        val city = arrayOfTimes[cityIdx].cityName
        val currentTimeInCity = arrayOfTimes[cityIdx].currentTimeInCity
        val msg = "Time in the $city time zone is $currentTimeInCity"
        tv?.setText(msg)
    }
}
