# ClassConverterJava
 
- Example 
```java
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
```
- Result
```
D/Main_Activity: onCreate: Zein_Zein
```


```
implementation 'com.google.code.gson:gson:2.8.6'
```

- In Function
```java
public class ClassConverterJavaType1 {

    public <T> T convert(Class<T> clazz, Object object){
        Gson gson = new Gson();
        String hashMapString = gson.toJson(object);

        return gson.fromJson(hashMapString, clazz);
    }
}
```
```java
Model2 model2 = new ClassConverterJavaType1().convert(Model2.class, model1);
```

- In Class
```java
public class ClassConverterJavaType2<T> {

    public T convert(Class<T> clazz ,Object object){
        Gson gson = new Gson();
        String hashMapString = gson.toJson(object);

        return gson.fromJson(hashMapString, clazz);
    }
}
```
```java
Model2 model2 = new ClassConverterJavaType2<Model2>().convert(Model2.class, model1);
```

---

```
Copyright 2022 M. Fadli Zein
```