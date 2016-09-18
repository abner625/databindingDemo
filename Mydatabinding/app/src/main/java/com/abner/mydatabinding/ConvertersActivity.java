package com.abner.mydatabinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.abner.mydatabinding.databinding.ConvertersLayoutBinding;

import java.util.Date;

/**
 * Created by heng on 2016/9/13.
 */
public class ConvertersActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ConvertersLayoutBinding binding = DataBindingUtil.setContentView(this,R.layout.converters_layout);
        binding.setTime(new Date());
    }
}
