package com.gzeinnumer.classconverterjava;

import com.google.gson.Gson;

public class ClassConverterJavaType1 {

    public ClassConverterJavaType1() {
    }

    public <T> T convert(Class<T> clazz, Object object){
        Gson gson = new Gson();
        String hashMapString = gson.toJson(object);

        return gson.fromJson(hashMapString, clazz);
    }
}
