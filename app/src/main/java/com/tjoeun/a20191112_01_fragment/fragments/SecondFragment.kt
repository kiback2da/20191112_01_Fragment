package com.tjoeun.a20191112_01_fragment.fragments

import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.tjoeun.a20191112_01_fragment.R
import kotlinx.android.synthetic.main.fragment_second.*

class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_second,container,false)
    }

    // 액티비티 위에 얹어졌을때 실행되는 fun
    // 실질적으로 Fragment 입장에서는 OnCreate나 마찬가지
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)


        secondFragmentTxt.text = "두번째 프래그먼트에서 \n글자 바꿈"
        secondFragmentTxt.gravity = Gravity.CENTER

    }
}