package com.abner.mydatabinding;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by heng on 2016/9/13.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{

    private ArrayList<Student> datas = new ArrayList<>();
    private Student stu = new Student();
    public MyAdapter(ArrayList<Student> data) {
        datas.addAll(data);
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ViewDataBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),R.layout.recyclerview_item,parent,false);
        ViewHolder viewHolder = new ViewHolder(binding.getRoot());
        viewHolder.setBinding(binding);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        //出错点，变量名用错了，写成name了,应该是布局文件中的name对应的名字
        holder.getBinding().setVariable(com.abner.mydatabinding.BR.student,datas.get(position));
        holder.getBinding().executePendingBindings();
    }

    @Override
    public int getItemCount() {
        return datas.size();
    }


    class ViewHolder extends RecyclerView.ViewHolder{
        private ViewDataBinding binding;
        public ViewHolder(View itemView) {
            super(itemView);
        }
        public ViewDataBinding getBinding() {
            return binding;
        }
        public void setBinding(ViewDataBinding binding) {
            this.binding = binding;
        }
    }
}

