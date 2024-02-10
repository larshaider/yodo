package de.lhaider.yodo.ui.text

import androidx.annotation.StringRes
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource

sealed interface UIText {
    data class DynamicText(val value: String) : UIText
    class ResourceText(@StringRes val resId: Int, vararg val args: Any) : UIText

    @Composable
    fun asString(): String {
        return when (this) {
            is DynamicText -> value
            is ResourceText -> stringResource(resId, args)
        }
    }
}