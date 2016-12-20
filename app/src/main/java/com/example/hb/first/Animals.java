package com.example.hb.first;

import android.content.Context;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by HP on 17-12-2016.
 */

public class Animals {
    String dogbark="bhoo bhoo";
    String cat="meow meow";

    public String bark(){
        return dogbark;
    }
    public String  cat(){
        return cat;
    }
    static String hema(){
        return "Hello";
    }
    public void print(Context context){
        Toast.makeText(context,"context passing",Toast.LENGTH_SHORT).show();

    }

}
