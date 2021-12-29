package com.azhao.test

import android.content.Context
import android.content.pm.ApplicationInfo
import android.content.pm.PackageManager
import java.lang.Exception

/**
 *@author azhao
 *@date 2021/12/29 10:04
 *
 */
object Utils {
    fun getGradleMessage(): String {
        return  return "app:[${BuildConfig.TEST_ACCOUNT}, ${BuildConfig.APP_IS_DEBUG}, ${BuildConfig.CHANNEL}]"
    }


    /**
     * 获取当前配置的渠道
     * 通过清单文件获取app build的渠道配置信息
     */
    fun getChannel(context: Context): String? {
        if (BuildConfig.APP_IS_DEBUG) {
            val appInfo: ApplicationInfo
            try {
                appInfo = context.packageManager.getApplicationInfo(
                    context.packageName,
                    PackageManager.GET_META_DATA
                )
                return appInfo.metaData.getString("CHANNEL")
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }

        return ""
    }
}