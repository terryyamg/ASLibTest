package com.terryyamg.libtest;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.rey.material.drawable.RippleDrawable;
import com.rey.material.widget.Button;
import com.rey.material.widget.FloatingActionButton;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bt_flat = (Button) findViewById(R.id.button_bt_flat);
        Button bt_flat_color = (Button) findViewById(R.id.button_bt_flat_color);
        Button bt_flat_wave = (Button) findViewById(R.id.button_bt_flat_wave);
        Button bt_flat_wave_color = (Button) findViewById(R.id.button_bt_flat_wave_color);
        Button bt_raise = (Button) findViewById(R.id.button_bt_raise);
        Button bt_raise_color = (Button) findViewById(R.id.button_bt_raise_color);
        Button bt_raise_wave = (Button) findViewById(R.id.button_bt_raise_wave);
        Button bt_raise_wave_color = (Button) findViewById(R.id.button_bt_raise_wave_color);
        FloatingActionButton bt_float = (FloatingActionButton) findViewById(R.id.button_bt_float);
        FloatingActionButton bt_float_color = (FloatingActionButton) findViewById(R.id.button_bt_float_color);
        FloatingActionButton bt_float_wave = (FloatingActionButton) findViewById(R.id.button_bt_float_wave);
        FloatingActionButton bt_float_wave_color = (FloatingActionButton) findViewById(R.id.button_bt_float_wave_color);

        /*左邊正常速度*/
        View.OnClickListener listener = new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (v instanceof FloatingActionButton) {
                    FloatingActionButton bt = (FloatingActionButton) v;
                    bt.setLineMorphingState((bt.getLineMorphingState() + 1) % 2, true);
                }

                System.out.println(v + " " + ((RippleDrawable) v.getBackground()).getDelayClickType());
            }
        };
        /*右邊DELAY速度*/
        View.OnClickListener listener_delay = new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (v instanceof FloatingActionButton) {
                    FloatingActionButton bt = (FloatingActionButton) v;
                    bt.setLineMorphingState((bt.getLineMorphingState() + 1) % 2, true);
                }

                System.out.println(v + " " + ((RippleDrawable) v.getBackground()).getDelayClickType());
            }
        };

        /*監聽事件*/
        bt_flat.setOnClickListener(listener);
        bt_flat_wave.setOnClickListener(listener);
        bt_raise.setOnClickListener(listener);
        bt_raise_wave.setOnClickListener(listener);
        bt_float.setOnClickListener(listener);
        bt_float_wave.setOnClickListener(listener);

        bt_flat_color.setOnClickListener(listener_delay);
        bt_flat_wave_color.setOnClickListener(listener_delay);
        bt_raise_color.setOnClickListener(listener_delay);
        bt_raise_wave_color.setOnClickListener(listener_delay);
        bt_float_color.setOnClickListener(listener_delay);
        bt_float_wave_color.setOnClickListener(listener_delay);

    }

}
