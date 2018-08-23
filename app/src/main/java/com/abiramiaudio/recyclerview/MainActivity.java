package com.abiramiaudio.recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Window;
import android.view.WindowManager;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Book> list = new ArrayList<Book>();
    RecyclerView recyclerView;
    AdView mAdview1;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        MobileAds.initialize(this, "ca-app-pub-3940256099942544~3347511713");

        list.add(new Book("32Mnz5bOY70", R.drawable.thumbnail1));
        list.add(new Book("XdTozH06RfU", R.drawable.thumbnail2));
        list.add(new Book("khnnaXzSl4M", R.drawable.thumnail3));
        list.add(new Book("HdiK3VmSlPo", R.drawable.thumbnail4));
        list.add(new Book("3PVy4tFjITY", R.drawable.thumbnail5));
        list.add(new Book("aKZELKrZP8U", R.drawable.thumbnail6));
        list.add(new Book("ZcODpAFqJLY", R.drawable.thumbnail7));
        list.add(new Book("TQEZPj1vZEs", R.drawable.thumbnail8));
        list.add(new Book("yEL9DT_pQ4o", R.drawable.thumbnail9));
        list.add(new Book("4fFyKUGWF8s", R.drawable.thumbnail10));



        mAdview1 = (AdView)findViewById(R.id.adView1);


        AdRequest adRequest1 = new AdRequest.Builder().addTestDevice("B71D897C6FB5FFEC8184442E74C7E952").build();
        mAdview1.loadAd(adRequest1);


        recyclerView = (RecyclerView)findViewById(R.id.rc);
        MyAdapter myAdapter = new MyAdapter(this,list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
       // recyclerView.setLayoutManager(new GridLayoutManager(this,3));
        recyclerView.setAdapter(myAdapter);



    }
}
