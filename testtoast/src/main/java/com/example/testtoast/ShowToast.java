package com.example.testtoast;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by amdin on 2016/11/18.
 */

public class ShowToast {

    public  static void sToast(Context c,String s){
        Toast.makeText(c, s, Toast.LENGTH_SHORT).show();
    }
}
