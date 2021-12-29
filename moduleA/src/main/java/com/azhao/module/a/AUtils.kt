package com.azhao.module.a

/**
 *@author azhao
 *@date 2021/12/29 10:03
 *
 */
object AUtils {
    fun getGradleMessage(): String{
        return "A:[${BuildConfig.TEST_ACCOUNT}, ${BuildConfig.APP_IS_DEBUG}, ${BuildConfig.CHANNEL}]"
    }
}