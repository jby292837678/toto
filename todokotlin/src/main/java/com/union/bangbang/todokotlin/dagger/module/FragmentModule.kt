package com.union.bangbang.todokotlin.dagger.module

import com.union.bangbang.todokotlin.dagger.annotation.FragmentScope
import com.union.bangbang.todokotlin.ui.home.surrounding.HomeSurroundingFragment
import com.union.bangbang.todokotlin.ui.home.moment.HomeMomentFragment
import com.union.bangbang.todokotlin.ui.home.page.HomePageFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
不乱于心，不困于情。不畏将来，不念过往。如此，安好!

深谋若谷，深交若水。深明大义，深悉小节。已然，静舒!

善宽以怀，善感以恩。善博以浪，善精以业。这般，最佳!

勿感于时，勿伤于怀。勿耽美色，勿沉虚妄。从今，进取!

无愧于天，无愧于地。无怍于人，无惧于鬼。这样，人生!
 */

@Module
abstract class FragmentModule {
    @FragmentScope
    @ContributesAndroidInjector
    abstract fun bindHomeMomentFrament(): HomeMomentFragment

    @FragmentScope
    @ContributesAndroidInjector
    abstract fun bindHomePageFrament(): HomePageFragment

    @FragmentScope
    @ContributesAndroidInjector
    abstract fun bindHomeSurroundingFrament(): HomeSurroundingFragment
}