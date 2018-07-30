package com.example.sanjay.garbhraksha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AnganWadi_page extends AppCompatActivity {

    private ListView mPeopleList;
    final String[] mListnames = {"Sarswati Parmar","Plabita Borthakur","Rajeshree Kumari","Manisha Pandey"
    ,"Devika Shastri","Begum Hasrat Mahal","Aaliya Khan","Savitri Pandey","Sanjana Soni","Abhilasha Parik", "Natasha Dubey","Rani Das", "Sulekha Sahani" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_angan_wadi_page);

        init();
        ArrayAdapter adapter = new ArrayAdapter<String>(AnganWadi_page.this,android.R.layout.simple_list_item_1,mListnames);
        mPeopleList.setAdapter(adapter);
    }

    void init(){
        mPeopleList = (ListView)findViewById(R.id.anganwadi_List);
    }
}
