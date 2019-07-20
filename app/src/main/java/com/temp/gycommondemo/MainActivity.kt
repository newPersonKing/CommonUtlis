package com.temp.gycommondemo

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextPaint
import android.text.method.LinkMovementMethod
import android.text.style.ClickableSpan
import android.view.View
import com.temp.commonutil.span.SpanUtils
import com.temp.commonutil.toast.ToastUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var spanUtils = SpanUtils()
        var spannableStringBuilder = spanUtils.appendImage(R.drawable.ic_mtrl_chip_close_circle)
                .append("red")
                .setUnderline()
                .setForegroundColor(Color.RED)
                .setClickSpan(object :ClickableSpan(){
                    override fun onClick(widget: View) {
                        ToastUtils.showLong("setClickSpan")
                    }

                    override fun updateDrawState(ds: TextPaint) {

                    }
                })
                .append("green")
                .setForegroundColor(Color.GREEN)
                .appendLine()
                .appendLine("line")
                .appendSpace(10)
                .append("newtext=========newtext")
                .setBullet(Color.YELLOW,5,2)
                .setLeadingMargin(20,20)
                .setShadow(10f,10f,20f,Color.GREEN)
                .append("=================")
                .create();
//        spanUtils.setClickSpan(object :ClickableSpan(){
//            override fun onClick(widget: View) {
//              ToastUtils.showLong("setClickSpan")
//            }
//
//            override fun updateDrawState(ds: TextPaint) {
//
//            }
//        })

        tv_text.movementMethod = LinkMovementMethod.getInstance()
        tv_text.setText(spannableStringBuilder)
    }
}
