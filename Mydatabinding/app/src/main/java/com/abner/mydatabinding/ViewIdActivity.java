package com.abner.mydatabinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.abner.mydatabinding.databinding.ViewidLayoutBinding;

/**
 * Created by heng on 2016/9/13.
 */
public class ViewIdActivity extends AppCompatActivity {
    public ViewidLayoutBinding binding;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.viewid_layout);
        binding.setStu(new Student("及时行乐",18));
        binding.setClick(this);
    }

    public void onViewClick(View view){
        binding.textview.setText("人生苦短");
    }
}
