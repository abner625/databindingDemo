package com.abner.mydatabinding;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by heng on 2016/9/12.
 */
public class FragmentActivity extends AppCompatActivity {
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_layout);
        getSupportFragmentManager().beginTransaction().replace(R.id.frame,new MyFragment()).commit();
    }
}
