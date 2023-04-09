package com.example.roomin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var navigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigationView = findViewById(R.id.navigation_view)

        navigationView.setOnItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.navigation_home -> {
                    // 홈 탭을 선택한 경우 처리할 로직을 작성합니다.
                    true
                }
                R.id.navigation_roomin -> {
                    // 대시보드 탭을 선택한 경우 처리할 로직을 작성합니다.
                    true
                }
                R.id.navigation_service -> {
                    // 알림 탭을 선택한 경우 처리할 로직을 작성합니다.
                    true
                }
                R.id.navigation_mypage-> {
                    // 알림 탭을 선택한 경우 처리할 로직을 작성합니다.
                    true
                }
                else -> false
            }
        }
        Log.d("MY_TAG", "This is my log message")
        navigationView.selectedItemId = R.id.navigation_home
    }
}