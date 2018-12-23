package com.didar.rootchecker

import java.io.*

class RootHelper {
    companion object {
        private var instance: RootHelper? = null
        fun getInstance(): RootHelper {
            if (instance == null) {
                instance = RootHelper()
            }
            return instance!!
        }
    }

    fun canRunRootCommands(): Boolean {
        var canRun = false
        try {
            val process = Runtime.getRuntime().exec("su")
            val out = DataOutputStream(process.outputStream)
            val `in` = BufferedReader(InputStreamReader(DataInputStream(process.inputStream)))
            out.writeBytes("whoami\n")
            out.flush()
            if (`in`.readLine().contains("root")) {
                canRun = true
            }
            out.writeBytes("exit\n")
            out.flush()
            process.waitFor()
        } catch (e: Exception) {
            e.printStackTrace()
            canRun = false
        }
        return canRun
    }
}