package com.tjoeun.a20191112_01_fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tjoeun.a20191112_01_fragment.fragments.FirstFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

    }

    override fun setValues() {
        mainFirstTxt.text  = "첫번째 테스트"
        mainSecondTxt.text = "두번째 테스트"
    }

}
