package com.gmail.nukyalfiansyah.myapplication;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

//Pada Bahasa Pemrograman Android dengan memanggil dan Activity yang ada
// di Dalam Pembuatan Aplikasi yang dapat dibuat dengan Aplikasi Eclipse, Android Studio dan Lainnya sehingga tercipta App Android,
//Fungsi dari
//import android.content.Intent dan
//import android.os.Bundle;
//Source Code Bahasa Pemrograman Android yang di gunakan untuk membaca Data dengan  tipe berbentuk String, angka
// (integer, float, double), ArrayList, boolean, array, character, dan sebagainya, jadi Fungsi untuk memasukan
// atau memanggil data - data tersebut.

public class MyListAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] maintitle;
    private final String[] subtitle;
    private final Integer[] imgid;
//pada script di atas mengeksekusi pada bagian contex,maintile,subtile,dan imgid
    public MyListAdapter(Activity context, String[] maintitle,String[] subtitle, Integer[] imgid)
    {
        super(context, R.layout.mylist, maintitle);
// TODO Auto-generated constructor stub
        this.context=context;
        this.maintitle=maintitle;
        this.subtitle=subtitle;
        this.imgid=imgid;
    }
//    pada bagian script di atas untuk mendeklrasi dari context,maintile,subtile,imgd bersupaya ketika di panggil maka
    //maka akan terpanggil
    public View getView(int position,View view,ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.mylist, null,true);
        TextView titleText = (TextView) rowView.findViewById(R.id.title);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
        TextView subtitleText = (TextView) rowView.findViewById(R.id.subtitle);
        titleText.setText(maintitle[position]);imageView.setImageResource(imgid[position]);
        subtitleText.setText(subtitle[position]);
        return rowView;
    };
    }

