package com.azhao.module.b

/**
 *@author azhao
 *@date 2021/12/29 10:03
 *
 */
object BUtils {
    fun getGradleMessage(): String{
        return "B:[${BuildConfig.TEST_ACCOUNT}, ${BuildConfig.APP_IS_DEBUG}, ${BuildConfig.CHANNEL}]"
    }
}