package com.deril1709.finalmobile;

import java.util.Locale;

public class Consts {
    public static final String API_KEY = "0ec962168913850ec251f1a62249c1a5";
    public static final String BASE_URL = "http://api.themoviedb.org/3/";
    public static final String IMG_URL = "https://image.tmdb.org/t/p/";

    public static String getLang() {
        switch (Locale.getDefault().toString()) {
            case "in_ID":
                return "id-ID";
            default:
                return "en-US";
        }
    }
}
