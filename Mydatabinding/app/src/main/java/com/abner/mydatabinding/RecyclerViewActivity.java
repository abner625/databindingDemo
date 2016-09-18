package com.abner.mydatabinding;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

/**
 * Created by heng on 2016/9/13.
 */
public class RecyclerViewActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    public ArrayList<Student> data = new ArrayList<>();
    private Student stu = new Student();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recyclerview_layout);
        for(int i = 0;i< 10;i++){
            data.add(new Student(stu.getName()+i,18+i));
        }
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        recyclerView.setAdapter(new MyAdapter(data));

    }
    public void onNameClick(View view){
        stu.setName("皮革很惨");
    }

}
