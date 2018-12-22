package com.union.bangbang.todokotlin.base.data.pojo

/**
 * @name toto
 * @anthor bangbang QQ:740090077
 * @time 2018/12/21 10:47 PM
 * 只有编译器可能不骗你。
 */

data class InfoEntity<T>(
    val code: Int,
    val `data`: T
)

data class TouristEntity(
    val token: Token,
    val user: User
)

data class Token(
    val id: Int,
    val token: String,
    val userEntity: User
)

data class User(
        var id: Int,
        val name: String
)