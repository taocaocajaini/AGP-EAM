package com.hsk.hxqh.agp_eam.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

import com.hsk.hxqh.agp_eam.R;


public class LoadActivity extends BaseActivity {


    private static final int ANIMATION_DURATION = 2000;
    private static final float SCALE_END = 1.13F;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Handler x = new Handler();
        x.postDelayed(new splashhandler(), 2000);
    }

    @Override
    protected void findViewById() {

    }

    @Override
    protected void initView() {

    }


    class splashhandler implements Runnable {

        public void run() {
            jumpLoginActivity();
        }

    }


    /**
     * 跳转至登录界面
     */
    private void jumpLoginActivity() {
        Intent intent = new Intent();
        intent.setClass(this, LoginActivity.class);
        startActivity(intent);
    }


}
