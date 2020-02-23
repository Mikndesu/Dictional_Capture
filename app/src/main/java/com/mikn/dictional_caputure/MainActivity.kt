package com.mikn.dictional_caputure

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mikn.dictional_caputure.capture.CaptureActivity
import com.mikn.dictional_caputure.history.HistoryShowActivity
import com.mikn.dictional_caputure.localscan.LocalScanActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        caputure.setOnClickListener{startActivity(Intent(applicationContext,CaptureActivity::class.java))}
        localscan.setOnClickListener{startActivity(Intent(applicationContext,LocalScanActivity::class.java))}
        history.setOnClickListener{startActivity(Intent(applicationContext,HistoryShowActivity::class.java))}

    }
    
}
