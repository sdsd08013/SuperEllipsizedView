package lib.sky.superellipsizedview.views

import com.google.android.material.shape.CornerTreatment
import com.google.android.material.shape.ShapePath

class BezierApproximationCurveTreatment(
    private val ellipseRadius: Float,
    private val rate: Float
) : CornerTreatment() {

    override fun getCornerPath(
        shapePath: ShapePath,
        angle: Float,
        interpolation: Float,
        radius: Float
    ) {
        shapePath.reset(ellipseRadius, 0f)
        shapePath.cubicToPoint(
            ellipseRadius.times(1 + rate),
            0f,
            ellipseRadius.times(2f),
            ellipseRadius.times(1 - rate),
            ellipseRadius.times(2f),
            ellipseRadius
        )
    }
}