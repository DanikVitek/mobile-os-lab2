package me.danikvitek.lab2

import android.content.res.Resources
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType

inline val Double.dw: Dp
    get() = Resources.getSystem().displayMetrics.let {
        Dp(value = ((this * it.widthPixels) / it.density).toFloat())
    }

inline val Float.dw get() = toDouble().dw

inline val Double.dh: Dp
    get() = Resources.getSystem().displayMetrics.let {
        Dp(value = ((this * it.heightPixels) / it.density).toFloat())
    }

inline val Float.dh get() = toDouble().dh

inline val Double.sw: TextUnit
    get() = Resources.getSystem().displayMetrics.let {
        TextUnit(
            value = ((this * it.widthPixels) / it.scaledDensity).toFloat(),
            type = TextUnitType.Sp,
        )
    }
inline val Float.sw: TextUnit get() = this.toDouble().sw

inline val Double.sh: TextUnit
    get() = Resources.getSystem().displayMetrics.let {
        TextUnit(
            value = ((this * it.heightPixels) / it.scaledDensity).toFloat(),
            type = TextUnitType.Sp,
        )
    }
inline val Float.sh: TextUnit get() = this.toDouble().sh