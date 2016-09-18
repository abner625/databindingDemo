package com.abner.mydatabinding;

import android.databinding.BindingAdapter;
import android.databinding.BindingConversion;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by heng on 2016/9/13.
 * 这个类是与SetterActivity或者ConvertersActivity连用，与其他无关
 */
public class Utils {
    //这里面的image对应的是布局文件里面的app:image,这两个必须保持相同
    @BindingAdapter({"bind:image"})
    public static void imageLoader(ImageView imageView, String url){
        Glide.with(imageView.getContext()).load(url).into(imageView);
    }
    @BindingConversion
    public static String dataFormat(Date date){
        //如果写成yyyy-mm-dd则返回的是年-分钟-日，需要写成yyyy-MM-dd
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return simpleDateFormat.format(date);
    }
}

