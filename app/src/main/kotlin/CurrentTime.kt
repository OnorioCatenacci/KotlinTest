/**
 * Created by ocatenacci on 3/27/2015.
 */
package com.riis.kotlintest

import org.joda.time.DateTime
import java.util.Date

public data class CurrentTime(val cityName:String = "", val currentTimeInCity: DateTime)