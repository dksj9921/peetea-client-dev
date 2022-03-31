package com.example.madpt.profile

import android.content.Intent
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.madpt.MainActivity
import com.example.madpt.databinding.ActivityStartProfileBinding

class StartProfile : AppCompatActivity() {

    private lateinit var binding: ActivityStartProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStartProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.statureEdit.setTextIsSelectable(true)
        binding.statureEdit.showSoftInputOnFocus = false
        binding.statureEdit.setOnTouchListener { _: View, event:MotionEvent ->
            when(event.action) {
                MotionEvent.ACTION_DOWN -> {
                    val bottomSheet = NumberPicker()
                    bottomSheet.show(supportFragmentManager, NumberPicker.TAG)
                }
            }
            true
        }

        binding.weightEdit.setTextIsSelectable(true)
        binding.weightEdit.showSoftInputOnFocus = false
        binding.weightEdit.setOnTouchListener { _: View, event:MotionEvent ->
            when(event.action) {
                MotionEvent.ACTION_DOWN -> {
                    val bottomSheet = NumberPicker()
                    bottomSheet.show(supportFragmentManager, NumberPicker.TAG)
                }
            }
            true
        }

        binding.checkButton.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
        }
    }
}