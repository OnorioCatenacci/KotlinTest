/**
 * Created by ocatenacci on 3/27/2015.
 */

package com.riis.kotlintest

import org.joda.time
import org.joda.time.DateTime
import org.joda.time.DateTimeZone
import org.joda.time.format.DateTimeFormatter
import org.joda.time.format.ISODateTimeFormat

public class TimeActivity{
    public fun GetTimesInMajorCities(cities:Array<String>):Array<CurrentTime> {
        //Set a baseline for the date time
        val utcDateTime = DateTime(DateTimeZone.UTC)
        val timeFormatter = ISODateTimeFormat.hourMinute()

        //Build an array of current times for the list of cities passed in
        val timesInCities = Array<CurrentTime>(cities.size(),
                {i ->
                val dtz = DateTimeZone.forID(cities[i]);
                val timeNow = utcDateTime.toDateTime(dtz);
                CurrentTime(cities[i], timeFormatter.print(timeNow))
                }
        )
        return timesInCities
    }
}

