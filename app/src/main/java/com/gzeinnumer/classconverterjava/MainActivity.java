package com.gzeinnumer.classconverterjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Main_Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        example1();
        example2();
    }

    private void example1() {
        Model1 model1 = new Model1();
        model1.setId(1);
        model1.setName("Zein");

        Model2 model2 = new ClassConverterJavaType1().convert(Model2.class, model1);

        Log.d(TAG, "onCreate: "+model1.getName()+"_"+model2.getName());
    }

    private void example2() {
        Model1 model1 = new Model1();
        model1.setId(1);
        model1.setName("Zein");

        Model2 model2 = new ClassConverterJavaType2<Model2>().convert(Model2.class, model1);

        Log.d(TAG, "onCreate: "+model1.getName()+"_"+model2.getName());
    }
}