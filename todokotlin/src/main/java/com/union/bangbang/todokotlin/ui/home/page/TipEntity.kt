package com.union.bangbang.todokotlin.ui.home.page

import android.databinding.ViewDataBinding
import android.view.View
import com.union.bangbang.todokotlin.R
import com.union.bangbang.todokotlin.base.recycle.adapter.ViewSelectHelper
import org.greenrobot.eventbus.EventBus

/**
不乱于心，不困于情。不畏将来，不念过往。如此，安好!

深谋若谷，深交若水。深明大义，深悉小节。已然，静舒!

善宽以怀，善感以恩。善博以浪，善精以业。这般，最佳!

勿感于时，勿伤于怀。勿耽美色，勿沉虚妄。从今，进取!

无愧于天，无愧于地。无怍于人，无惧于鬼。这样，人生!
 */
class TipEntity(var position: Int) : ViewSelectHelper<ViewDataBinding> {
    override var index: Int
        get() = 0
        set(value) {}
    override var layoutId: IntArray
        get() = intArrayOf(R.layout.holder_tip)
        set(value) {}

    fun onSelectClick(view: View) {
        EventBus.getDefault().post(this)
    }
}