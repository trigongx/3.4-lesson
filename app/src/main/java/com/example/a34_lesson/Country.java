package com.example.a34_lesson;

import android.widget.ImageView;
import android.widget.TextView;

public class Country {
    private String flag;
    private String name;

    public Country(String flag, String name) {
        this.flag = flag;
        this.name = name;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}



