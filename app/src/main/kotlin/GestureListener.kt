/**
 * Created by ocatenacci on 4/17/2015.
 */

import android.view.GestureDetector
import android.view.MotionEvent
import com.riis.kotlintest.MainActivity

public class GestureListener:GestureDetector.SimpleOnGestureListener(){

    val SWIPE_DISTANCE_THRESHOLD = 100F
    val SWIPE_VELOCITY_THRESHOLD = 100F

    public override fun onFling(e1:MotionEvent, e2:MotionEvent, velocityX:Float, velocityY:Float):Boolean{
        val xDistance = e2.getX() - e1.getX()
        val yDistance = e2.getY() - e1.getY()

        val stl = OnSwipeTouchListener(MainActivity.getApplicationContext())

        if ((Math.abs(xDistance) > Math.abs(yDistance)) && (Math.abs(xDistance) > SWIPE_DISTANCE_THRESHOLD) && (Math.abs(velocityX) > SWIPE_VELOCITY_THRESHOLD)){
            if (xDistance > 0) stl.onSwipeRight() else stl.onSwipeLeft()
            return true
        }
        else
        {
            return false
        }
    }
}