package jp.techacademy.yuu.funakoshi.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human = Human("舩越 優", 27, "Kotlin")      // 名前を舩越 優、年齢27歳,思考Kotlinで、Humanのインスタンスを作る

        human.say()
        human.think()
    }
}