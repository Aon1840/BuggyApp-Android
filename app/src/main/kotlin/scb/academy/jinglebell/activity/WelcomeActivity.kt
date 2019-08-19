package scb.academy.jinglebell.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_welcome.*
import scb.academy.jinglebell.R

class WelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        val nickname = intent?.getStringExtra("nickname") as String

        tvNickname.setText(nickname)

        Log.d("test","------ nick name from deteail: ${nickname}")
    }
}
