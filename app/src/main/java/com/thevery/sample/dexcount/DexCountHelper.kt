package com.thevery.sample.dexcount

import android.support.annotation.Keep
import kotlinx.coroutines.experimental.CommonPool
import kotlinx.coroutines.experimental.launch

class DexCountHelper {

    private val labelsToMark = setOf<String>()
    private val originalState = mapOf<String, MarkedState>()

    enum class MarkedState {
        MARKED_ALL, MARKED_SOME, MARKED_NONE
    }

    @Keep
    fun coroutines() {
        val finalLabelToMark = labelsToMark.filter { lid -> originalState[lid] != MarkedState.MARKED_ALL }

        launch(CommonPool) {
            // +2 methods here :(
            // val finalLabelToMark = labelsToMark.filter { lid -> originalState[lid] != MarkedState.MARKED_ALL }
            println("finalLabelToMark = $finalLabelToMark")
        }
    }
}
