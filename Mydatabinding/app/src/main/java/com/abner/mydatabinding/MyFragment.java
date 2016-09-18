package com.abner.mydatabinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by heng on 2016/9/12.
 */
public class MyFragment extends Fragment {
//    public FragmentListBinding binding;
    public com.abner.mydatabinding.Custom binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//        ViewDataBinding viewDataBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_list,container,false);
//        binding = (FragmentListBinding) viewDataBinding;
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_list,container,false);
        binding.setStu(new Student("人生如戏",25,5564644));
        binding.setClick(this);
        return binding.getRoot();
    }
    //这个参数列表与点击事件的参数列表不相同导致报错，长点脑子
    public void onFragmentClick(View view){
        binding.setStu(new Student("追逐梦想",456,531314416));
    }
}
