package com.abner.mydatabinding;

import android.databinding.Bindable;
import android.databinding.ObservableField;

/**
 * Created by heng on 2016/9/9.
 */
public class Student extends ObservableField{
    private String name;
    private int age;
    private int cardid;

    public Student(){}
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Student(String name, int age, int cardid) {
        this.name = name;
        this.age = age;
        this.cardid = cardid;
    }
    @Bindable
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(com.abner.mydatabinding.BR.name);
    }
    @Bindable
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        notifyPropertyChanged(com.abner.mydatabinding.BR.age);
    }
    @Bindable
    public int getCardid() {
        return cardid;
    }

    public void setCardid(int cardid) {
        this.cardid = cardid;
        notifyPropertyChanged(com.abner.mydatabinding.BR.cardid);
    }

}
