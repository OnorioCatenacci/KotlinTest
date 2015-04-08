/**
 * Created by onorio_development on 4/8/15.
 */

package com.riis.kotlintest

import android.os.Bundle;
import android.preference.PreferenceFragment;

public class PrefFragment: PreferenceFragment() {

    override public fun onCreate(savedInstanceState:Bundle?) {
        super.onCreate(savedInstanceState)
        addPreferencesFromResource(R.xml.preferences)
    }
}