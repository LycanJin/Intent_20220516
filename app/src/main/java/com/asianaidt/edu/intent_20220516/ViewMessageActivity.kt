package com.asianaidt.edu.intent_20220516

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_view_message.*

class ViewMessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_message)

        // 메시지 뽑아 오기
        val receivedMessage = intent.getStringExtra("key_message")

        // 텍스트 뷰에 반영
        txt_message.text = receivedMessage

    }
}