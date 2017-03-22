package com.sdp.panda.gaodemaptestdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class MainActivity extends Activity {

    @InjectView(R.id.btn_last)
    Button btnLast;
    @InjectView(R.id.btn_wakeUp)
    Button btnWakeUp;
    @InjectView(R.id.btn_weilan)
    Button btnWeilan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
    }

    @OnClick({R.id.btn_last, R.id.btn_wakeUp,R.id.btn_weilan})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_last:
                startActivity(new Intent(this, LasLocationActivity.class));
                break;
            case R.id.btn_wakeUp:
                startActivity(new Intent(this, UpCpuLocationActivity.class));
                break;
            case R.id.btn_weilan:
                startActivity(new Intent(this, WeiLanLocationActivity.class));
                break;
        }
    }

}
