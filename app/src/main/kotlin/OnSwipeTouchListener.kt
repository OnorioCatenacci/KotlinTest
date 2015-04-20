/**
 * Created by ocatenacci on 4/17/2015.
 */


import android.content.Context
import android.view.GestureDetector
import android.view.View
import android.view.MotionEvent
import android.view.GestureDetector.SimpleOnGestureListener

public class OnSwipeTouchListener(context:Context): View.OnTouchListener{

    private val gestureDetector = GestureDetector(context, GestureListener())
    public override fun onTouch(v:View, e:MotionEvent):Boolean{
        return true
    }

    public fun onSwipeRight():Unit{

    }

    public fun onSwipeLeft():Unit{
    }

}