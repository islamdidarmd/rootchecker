package com.didar.rootcheckersample

import android.app.Dialog
import android.app.ProgressDialog
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.didar.rootchecker.RootHelper
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.indeterminateProgressDialog
import org.jetbrains.anko.progressDialog
import org.jetbrains.anko.uiThread

class MainActivity : AppCompatActivity() {
    lateinit var dialog: ProgressDialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dialog = indeterminateProgressDialog("Checking Root...")
        dialog.setCancelable(false)
        checkRoot()

        btnCheck.setOnClickListener {
            if (!dialog.isShowing) {
                dialog.show()
                checkRoot()
            }
        }
    }

    private fun checkRoot() {
        doAsync {
            val canRun = RootHelper.getInstance().canRunRootCommands()
            uiThread { context ->
                if (canRun) {
                    tvStatus.text = "Your device is Rooted!"
                } else {
                    tvStatus.text = "Your device doesn't seem to be rooted properly!!"
                }
                dialog.dismiss()
            }
        }
    }
}
