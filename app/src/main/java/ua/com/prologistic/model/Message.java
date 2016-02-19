package ua.com.prologistic.model;

import com.parse.ParseClassName;
import com.parse.ParseObject;

/**
 * Created by Andrew on 05.02.2016.
 */
@ParseClassName("Message")
public class Message extends ParseObject {

    public Message() {
    }

    public String getUserId() {
        return getString("userId");
    }

    public String getBody() {
        return getString("body");
    }

    public void setUserId(String userId) {
        put("userId", userId);
    }

    public void setBody(String body) {
        put("body", body);
    }
}
