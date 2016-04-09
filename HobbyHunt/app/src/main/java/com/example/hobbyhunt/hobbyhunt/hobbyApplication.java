package com.example.hobbyhunt.hobbyhunt;

import com.firebase.client.Firebase;

/**
 * Created by John Bradbury on 4/9/2016.
 */
public class hobbyApplication extends android.app.Application{
    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
        // other setup code
    }
}
