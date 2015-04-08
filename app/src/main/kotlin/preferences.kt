
/**
 * Created by onorio_development on 4/7/15.
 *
 * Manage app preferences.
 */

package com.riis.kotlintest

import android.os.Bundle
import android.preference.PreferenceActivity
import android.app.Activity
import android.app.FragmentManager
import android.app.FragmentTransaction


public class KotlinTestPreferences: PreferenceActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val prefFragment = PrefFragment()
        val fragmentManager = getFragmentManager()
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(android.R.id.content, prefFragment);
        fragmentTransaction.commit()
    }
}