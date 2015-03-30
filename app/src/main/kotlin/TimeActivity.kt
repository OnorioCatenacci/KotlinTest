/**
 * Created by ocatenacci on 3/27/2015.
 */

package com.riis.kotlintest

import java.util.GregorianCalendar
import java.util.Locale
import java.util.Date
import java.util.TimeZone
import org.joda.time

public class TimeActivity{

    private val _cal:GregorianCalendar = GregorianCalendar()

    public fun GetTimesInMajorCities(cities:Array<String>):Array<CurrentTime> {

        //Remember the current time zone
        val currentTimeZone = _cal.getTimeZone()

        //Build an array of current times for the list of cities passed in
        val timesInCities = Array<CurrentTime>(cities.size(),
                {i ->
                _cal.setTimeZone(TimeZone.getTimeZone(cities[i]));
                CurrentTime(cities[i], _cal.getTime())
                }
        )

        //Restore the current time zone
        _cal.setTimeZone(currentTimeZone)
        return timesInCities
    }
}

