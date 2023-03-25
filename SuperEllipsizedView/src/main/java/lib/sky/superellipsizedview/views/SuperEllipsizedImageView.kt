package lib.sky.superellipsizedview.views

import android.content.Context
import android.util.AttributeSet
import com.google.android.material.imageview.ShapeableImageView
import com.google.android.material.shape.ShapeAppearanceModel

class SuperEllipsizedImage: ShapeableImageView {
    constructor(context: Context): super(context) {
        init(context, null, 0)
    }

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        init(context, attrs, 0)
    }

    constructor(context: Context, attrs: AttributeSet?, defStyle: Int) : super(context, attrs, defStyle) {
        init(context, attrs, defStyle)
    }

    private fun init(context: Context, attrs: AttributeSet?, defStyle: Int) {
        buildBezierCurveTreatment(context, attrs, defStyle)?.let {
            shapeAppearanceModel = ShapeAppearanceModel.builder()
                .setTopRightCorner(it)
                .setTopLeftCorner(it)
                .setBottomLeftCorner(it)
                .setBottomRightCorner(it)
                .build()
        }
    }
}