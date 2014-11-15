package me.gurpreetsingh.snapsingh;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

/**
 * Created by Gurpreet on 2014-11-14.
 */
public class SnapSinghApplication extends Application
{
    @Override
    public void onCreate()
    {
        super.onCreate();
        Parse.initialize(this, "WRFWXyfaLViNErFpnQxA5BoKXiG6vtvB0leyv7pX", "P3vUl9yu71rRCybSka1VQKB24036DrVwiWA0OKXJ");
    }
}
