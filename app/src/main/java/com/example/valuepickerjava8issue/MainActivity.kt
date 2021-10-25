package com.example.valuepickerjava8issue

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import com.example.valuepickerjava8issue.databinding.ActivityMainBinding
import com.paulrybitskyi.valuepicker.model.Item

class MainActivity : AppCompatActivity() {

    private lateinit var activityBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        activityBinding = ActivityMainBinding.inflate(LayoutInflater.from(this))

        setContentView(activityBinding.root)

        activityBinding.picker.apply {
            items = listOf(
                TestItem(0, "1", null),
                TestItem(1, "2", null),
                TestItem(2, "3", null)
            )
        }
    }
}

data class TestItem(override val id: Int, override val title: String, override val payload: Any?): Item