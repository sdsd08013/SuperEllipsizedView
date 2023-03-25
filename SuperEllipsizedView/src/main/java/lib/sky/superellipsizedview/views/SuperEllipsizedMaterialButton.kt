package lib.sky.superellipsizedview.views

import android.content.Context
import android.util.AttributeSet
import android.view.View
import com.google.android.material.button.MaterialButton
import com.google.android.material.shape.*
import lib.sky.superellipsizedview.R
import kotlin.math.pow

class SuperEllipsizedMaterialButton : MaterialButton {

    constructor(context: Context) : super(context) {
        init(context, null, 0)
    }

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        init(context, attrs, 0)
    }

    constructor(context: Context, attrs: AttributeSet?, defStyle: Int) : super(
        context, attrs, defStyle
    ) {
        init(context, attrs, defStyle)
    }

    private fun init(context: Context, attrs: AttributeSet?, defStyle: Int) {
        buildBezierCurveTreatment(context, attrs, defStyle)?.let {
            background = MaterialShapeDrawable(
                ShapeAppearanceModel.builder().setTopRightCorner(it).setTopLeftCorner(it)
                    .setBottomLeftCorner(it).setBottomRightCorner(it).build()
            )
        }
    }
}

fun View.buildBezierCurveTreatment(
    context: Context, attrs: AttributeSet?, defStyle: Int
): BezierApproximationCurveTreatment? {
    val typedArray =
        context.theme.obtainStyledAttributes(attrs, R.styleable.EllipseView, defStyle, 0)

    return try {
        val radius = typedArray.getDimension(R.styleable.EllipseView_radius, 0f)
        val exponent = typedArray.getFloat(R.styleable.EllipseView_exponent, 0f)

        val root = 1.div(2.0.pow(1.div(exponent).toDouble()))
        val k = 8.div(3).times(root - 0.5).toFloat()

        BezierApproximationCurveTreatment(radius, k)

    } catch (e: Exception) {
        typedArray.recycle()
        null
    }
}
