package paul.host.iquii.ui.view

import android.annotation.SuppressLint
import android.content.Context
import android.view.MotionEvent
import android.view.ScaleGestureDetector
import android.view.View
import androidx.appcompat.widget.AppCompatImageView
import com.squareup.picasso.Picasso
import kotlin.math.max
import kotlin.math.min


@SuppressLint("ClickableViewAccessibility")
class InteractiveImageView(context: Context) : AppCompatImageView(context) {

    private val detector: ScaleGestureDetector = ScaleGestureDetector(context, ScaleListener())
    private val picasso: Picasso = Picasso.Builder(context).build()

    private object Position {
        var x = 0f
        var y = 0f
    }

    init {
        setOnTouchListener { _, event ->
            detector.onTouchEvent(event)
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    Position.x = x - event.rawX
                    Position.y = y - event.rawY
                    true
                }
                MotionEvent.ACTION_MOVE -> {
                    val parent = parent as View
                    val newX = min((parent.width - width).toFloat(), event.rawX + Position.x)
                    val newY = min((parent.height - height).toFloat(), event.rawY + Position.y)
                    animate().x(newX).y(newY).setDuration(0).start()
                    true
                }
                else -> super.onTouchEvent(event)
            }
        }
    }

    fun setImage(url: String?) {
        if (url != null) picasso.load(url).into(this)
    }

    private var scaleFactor = 1.0f

    private inner class ScaleListener : ScaleGestureDetector.SimpleOnScaleGestureListener() {
        override fun onScale(scaleGestureDetector: ScaleGestureDetector): Boolean {
            scaleFactor *= scaleGestureDetector.scaleFactor
            scaleFactor = max(0.1f, min(scaleFactor, 10.0f))
            scaleX = scaleFactor
            scaleY = scaleFactor
            return true
        }
    }
}
