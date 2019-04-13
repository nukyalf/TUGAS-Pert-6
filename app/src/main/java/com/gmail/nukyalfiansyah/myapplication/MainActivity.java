package com.gmail.nukyalfiansyah.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AlertDialog ;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
//Pada Bahasa Pemrograman Android dengan memanggil dan Activity yang ada
// di Dalam Pembuatan Aplikasi yang dapat dibuat dengan Aplikasi Eclipse, Android Studio dan Lainnya sehingga tercipta App Android,
//Fungsi dari
//import android.content.Intent dan
//import android.os.Bundle;
//Source Code Bahasa Pemrograman Android yang di gunakan untuk membaca Data dengan  tipe berbentuk String, angka
// (integer, float, double), ArrayList, boolean, array, character, dan sebagainya, jadi Fungsi untuk memasukan
// atau memanggil data - data tersebut.

public class MainActivity extends AppCompatActivity {

    EditText username,Password; //pada script di samping adalah untuk mendeklarasikan dari username dan password ketika ingin
                                //login ke dalam sistem
    Button button3,button4;//pada bagian button3 dan button 4 untuk mengaktifkan dari tombol untuk bisa lanjut ke bagian selanjutnya

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText) findViewById(R.id.username);
        Password = (EditText) findViewById(R.id.password);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
//pada bagian username,password,button3/4 adalah untuk bisa memanggil dari script itu sendiri yang fungsinya mengkoneksikan dari script 1
        //ke satunya
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (username.getText().toString().equals("nuky.alfiansyah") && Password.getText().toString().equals("165410206")) {
                    Toast.makeText(MainActivity.this,"Selamat Datang Nuky",Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent(MainActivity.this, Custome1.class);
                    startActivity(intent);
                    //pada bagian script di atas adalah untuk membuat akun login dengan menggunakan if jadi untuk username nya adalah
                    // nuky alfiansyah dan untuk passwordnya 165410206,dan ketika berhasil login akan pop up pesan seperti
                    //selamat datang nuky
                } else{
                    //jika login gagal
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setMessage("Username atau password Anda salah")
                            .setNegativeButton("Retry",null).create().show();
                //pada bagian else ini ketika username password,tidak di isi atau salah maka tidak akan bisa melanjutkan ke
                    //halaman selanjutnya dan akan menerima pesan pop up seperti username atau password anda salah
                }

            }
        });
        button4.setOnClickListener(new View.OnClickListener() {//pada script di samping yaitu ketika di pilih tombol button4/registrasi
                                                                //maka akan pindah ke halaman selanjutnya
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,registrasi.class);
                startActivity(intent);
                //pada bagian startactivity intent ini adalah untuk memulai perpindahan halaman
            }
        });
    }


}



