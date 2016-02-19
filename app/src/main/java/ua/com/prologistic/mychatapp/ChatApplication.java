package ua.com.prologistic.mychatapp;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

import ua.com.prologistic.model.Message;

/**
 * Created by Andrew on 15.01.2016.
 */
public class ChatApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.enableLocalDatastore(this);
        ParseObject.registerSubclass(Message.class);
        Parse.initialize(this);
    }
}
