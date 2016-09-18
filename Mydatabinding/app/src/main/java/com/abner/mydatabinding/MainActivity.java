package com.abner.mydatabinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.abner.mydatabinding.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.HashMap;

public class    MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        binding.setStu(new Student("abner",19,430422199));

        binding.setError(false);
        binding.setName("my name is abner");
        ArrayList<String> list = new ArrayList<>();
        list.add("arraylist::::::::::::::::::::::::::::::::::");
        binding.setArray(list);

        HashMap<String,String> map = new HashMap<>();
        map.put("name","abner");
        map.put("age","11");
        binding.setMap(map);


        binding.setClick(new OnItemClick());

        People people = new People();
        people.name.set("abner27625###############################");
        people.isMan.set(false);
        binding.setPeople(people);
    }
}
