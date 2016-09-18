package com.abner.mydatabinding;

import android.view.View;
import android.widget.Toast;

/**
 * Created by heng on 2016/9/12.
 */
public class OnItemClick {
    public void onItemClick(View view){
        Toast.makeText(view.getContext(),"this is a item clicked",Toast.LENGTH_LONG).show();
    }
}
