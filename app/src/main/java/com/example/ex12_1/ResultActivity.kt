package com.example.ex12_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar
import android.widget.TextView
import org.w3c.dom.Text

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        title = "투표 결과"

        var intent = intent
        var votecount = intent.getIntArrayExtra("voteCount")
        var imgName = intent.getStringArrayExtra("imgName")

        var tv = arrayOfNulls<TextView>(imgName!!.size)
        var rBar = arrayOfNulls<RatingBar>(imgName!!.size)
        var tvId = arrayOf(R.id.tv1,R.id.tv2,R.id.tv3,R.id.tv4,R.id.tv5,R.id.tv6,R.id.tv7,R.id.tv8,R.id.tv9)
        var rBarId = arrayOf(R.id.rbar1,R.id.rbar2,R.id.rbar3,R.id.rbar4,R.id.rbar5,R.id.rbar6,R.id.rbar7,R.id.rbar8,R.id.rbar9)
        for(i in imgName.indices){
            tv[i]!!.setText(imgName[i])
            rBar[i] = findViewById<RatingBar>(rBarId[i])
            rBar[i]!!.rating = votecount!![i].toFloat()
        }
        var btnReturn = findViewById<Button>(R.id.btnReturn)
        btnReturn.setOnClickListener{
            finish()
        }
    }
}