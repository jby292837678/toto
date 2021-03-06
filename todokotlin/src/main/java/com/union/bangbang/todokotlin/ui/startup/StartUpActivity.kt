package com.union.bangbang.todokotlin.ui.startup

import android.os.Bundle
import com.union.bangbang.todokotlin.R
import com.union.bangbang.todokotlin.base.activity.BaseActivity
import com.union.bangbang.todokotlin.base.model.BaseModel
import com.union.bangbang.todokotlin.base.utils.ArouterUtil
import com.union.bangbang.todokotlin.base.utils.TransitionTypeValue
import com.union.bangbang.todokotlin.dagger.module.ActivityModule.Companion.home_page
import com.union.bangbang.todokotlin.databinding.ActivityStartupBinding
import com.union.bangbang.todokotlin.ui.user.login.LoginModel
import io.reactivex.functions.Consumer
import javax.inject.Inject


class StartUpActivity : BaseActivity<ActivityStartupBinding>() {
    override fun initViewModel(): BaseModel? = viewModel
    @Inject
    lateinit var viewModel: StartUpModel;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setImmersive()
        viewModel.refresh()
        viewModel.startTiming(Consumer {
            if (it) {
                LoginModel.background = viewModel.urlOb.get()
                ArouterUtil.navigation(home_page, transitionType = TransitionTypeValue.fade)
                viewModel.stopAllDisposable()
                window.decorView.postDelayed({
                    finish()
                }, 333)
            }
        }, time = 5)
    }

    override fun getLayoutId(): Int = R.layout.activity_startup
}
