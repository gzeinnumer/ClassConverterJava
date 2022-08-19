package com.gzeinnumer.classconverterjava;

import com.google.gson.Gson;

public class ClassConverterJavaType2<T> {

    public ClassConverterJavaType2() {
    }

    public T convert(Class<T> clazz, Object object){
        Gson gson = new Gson();
        String hashMapString = gson.toJson(object);

        return gson.fromJson(hashMapString, clazz);
    }
}
