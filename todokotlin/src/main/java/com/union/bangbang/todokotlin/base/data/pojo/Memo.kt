package com.union.bangbang.todokotlin.base.data.pojo

import android.databinding.ObservableBoolean
import android.databinding.ViewDataBinding
import android.os.Bundle
import android.os.Parcelable
import android.view.View
import com.google.gson.annotations.Expose
import com.union.bangbang.todokotlin.Constants
import com.union.bangbang.todokotlin.R
import com.union.bangbang.todokotlin.base.recycle.adapter.ViewSelectImp
import com.union.bangbang.todokotlin.base.utils.ArouterUtil
import com.union.bangbang.todokotlin.dagger.module.ActivityModule.Companion.memo_info
import kotlinx.android.parcel.IgnoredOnParcel
import kotlinx.android.parcel.Parcelize

/**
不乱于心，不困于情。不畏将来，不念过往。如此，安好!

深谋若谷，深交若水。深明大义，深悉小节。已然，静舒!

善宽以怀，善感以恩。善博以浪，善精以业。这般，最佳!

勿感于时，勿伤于怀。勿耽美色，勿沉虚妄。从今，进取!

无愧于天，无愧于地。无怍于人，无惧于鬼。这样，人生!
 */
@Parcelize
data class Memo constructor(var id: Long?,
                            var createTime: Long?,
                            var updateTime: Long?,
                            var content: String?,
                            var type: String?,
                            var longitude: Double?,
                            var latitude: Double?,
                            var createId: Long?,
                            var createUserId: Long?,
                            var createUserName: String?

) : ViewSelectImp<ViewDataBinding>(), Parcelable {
    constructor() : this(null,
            null,
            null,
            null,
            null,
            null,
            null, null, null, null)

    override var index: Int
        get() = 0
        set(value) {}
    override var layoutId: IntArray
        get() = intArrayOf(
                R.layout.holder_list_memo,
                R.layout.holder_list_my_memo
        )
        set(value) {}
    @IgnoredOnParcel
    @Expose val isCollect: ObservableBoolean = ObservableBoolean(false)
    fun onDetailClick(view: View) {
        val bundle = Bundle();
        bundle.putParcelable(Constants.Bundle.Memo, this)
        ArouterUtil.navigation(memo_info, bundle)
    }
}

