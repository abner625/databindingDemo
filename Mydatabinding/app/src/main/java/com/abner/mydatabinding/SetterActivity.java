package com.abner.mydatabinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.abner.mydatabinding.databinding.SetterLayoutBinding;

/**
 * Created by heng on 2016/9/13.
 */
public class SetterActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SetterLayoutBinding binding = DataBindingUtil.setContentView(this,R.layout.setter_layout);
        binding.setImageUtil("http://images.csdn.net/20150810/Blog-Image%E5%89%AF%E6%9C%AC.jpg");
    }
}
