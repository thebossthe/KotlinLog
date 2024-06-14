package jp.techacademy.yuu.funakoshi.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human = Human("一郎", 45, "Kotlin")      // 名前、年齢,思考で、Humanのインスタンスを作る

        human.say()
        human.think()

        val human2 = Human("次郎", 40, "Java")      // 名前、年齢,思考で、Humanのインスタンスを作る

        human2.say()
        human2.think()
    }
}