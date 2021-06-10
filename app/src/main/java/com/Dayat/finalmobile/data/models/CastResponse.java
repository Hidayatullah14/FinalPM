package com.deril1709.finalmobile.data.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CastResponse {
    @SerializedName("cast")
    List<Cast> castList;

    public List<Cast> getCastList() {
        return castList;
    }
}
