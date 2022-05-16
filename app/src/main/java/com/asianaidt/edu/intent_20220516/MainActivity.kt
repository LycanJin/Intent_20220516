package com.asianaidt.edu.intent_20220516

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_move.setOnClickListener {

            // 다른 화면으로 넘어가기
            val myIntent = Intent(this, OtherActivity::class.java)
            startActivity(myIntent)

        }

        btn_send_message.setOnClickListener {

            // 다른 액티비티로 메시지 넘기기
            val message = edt_message.text.toString()

            val intent = Intent(this, ViewMessageActivity::class.java)
            // 출발전에 데이터 첨부
            intent.putExtra("key_message", message)
            startActivity(intent)

        }
    }
}