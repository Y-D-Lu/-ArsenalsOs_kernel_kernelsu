package cn.arsenals.rootarsenals.ui.util

import androidx.compose.material3.SnackbarHostState
import androidx.compose.runtime.compositionLocalOf
import cn.arsenals.rootarsenals.ui.component.DialogHostState

val LocalSnackbarHost = compositionLocalOf<SnackbarHostState> {
    error("CompositionLocal LocalSnackbarController not present")
}

val LocalDialogHost = compositionLocalOf<DialogHostState> {
    error("CompositionLocal LocalDialogController not present")
}