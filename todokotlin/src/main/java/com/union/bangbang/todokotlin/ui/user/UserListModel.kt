package com.union.bangbang.todokotlin.ui.user

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import com.union.bangbang.todokotlin.base.data.model.DataService
import com.union.bangbang.todokotlin.base.data.pojo.User
import com.union.bangbang.todokotlin.base.model.BaseModel
import com.union.bangbang.todokotlin.base.model.RecycleModel
import com.union.bangbang.todokotlin.base.recycle.adapter.BindingAdapter
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

/**
 * @name toto
 * @anthor bangbang QQ:740090077
 * @time 2018/12/22 6:16 PM
 * 只有编译器可能不骗你。
 */
class UserListModel @Inject constructor(private val dataService: DataService, app: Application) : RecycleModel(app) {
  /*  fun getUserList() = dataService.userList()
            .subscribeOn(Schedulers.newThread())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({ adapter.addData(it) }, { Log.e("StartUpModel", it.message) })*/
}