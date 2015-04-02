/**
 * Created by ocatenacci on 3/27/2015.
 */

package com.riis.kotlintest

import org.joda.time
import org.joda.time.DateTime
import org.joda.time.DateTimeZone

public class TimeActivity{

    public fun GetTimesInMajorCities(cities:Array<String>):Array<CurrentTime> {


        //Set a baseline for the date time
        val utcDateTime = DateTime(DateTimeZone.UTC)

        //Build an array of current times for the list of cities passed in
        val timesInCities = Array<CurrentTime>(cities.size(),
                {i ->
                val dtz:DateTimeZone = DateTimeZone.forID(cities[i]);
                CurrentTime(cities[i], utcDateTime.toDateTime(dtz))
                }
        )

        return timesInCities
    }
}

