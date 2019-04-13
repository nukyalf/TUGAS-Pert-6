package com.gmail.nukyalfiansyah.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
//Pada Bahasa Pemrograman Android dengan memanggil dan Activity yang ada
// di Dalam Pembuatan Aplikasi yang dapat dibuat dengan Aplikasi Eclipse, Android Studio dan Lainnya sehingga tercipta App Android,
//Fungsi dari
//import android.content.Intent dan
//import android.os.Bundle;
//Source Code Bahasa Pemrograman Android yang di gunakan untuk membaca Data dengan  tipe berbentuk String, angka
// (integer, float, double), ArrayList, boolean, array, character, dan sebagainya, jadi Fungsi untuk memasukan
// atau memanggil data - data tersebut.
public class Custome1 extends AppCompatActivity {

    ListView list;
    String[] maintitle ={
            "Sobari Panji","Atika Nurrul H",
            "Randitya Analis P","Anna Ineke C.T",
            "Yuliana anjar w","M Khusnun F","Sirojudin A.G","Frans Abadi P"
    };
//    pada script di atas adalah untuk mendeklrasikan tiles yang dimana ketika di masukan data di atas maka nama
// tiles akan berubah nama seperti yang di atas
    String[] subtitle ={
            "sobaripanji8@gmail.com","atikanurrulhafizah@gmail.com",
            "randityaanalasiputra1234@gmail.com","itheedens@gmail.com",
            "anjaryuliyana.ya@gmail.com","khusnunmkf@gmail.com","sirojudinag@gmail.com","fransabadi91@gmail.com"
    };
//    pada bagian script di atas adalah tidak jauh dari sebelumnya,pada bagian subtitle ini adalah untuk menampilkan
//    nama di bawah maintile,jadi pada maintile akan menampilkan nama lebih besar ketimbang subtile
    Integer[] imgid={
            R.drawable.download_1,R.drawable.download_2,
            R.drawable.download_3,R.drawable.download_4,
            R.drawable.download_5,R.drawable.download_6,
            R.drawable.download_7,R.drawable.download_8,
    };
//    pada bagian script di atas adlah untuk memberikan gambar pada tiles tersebut

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custome1);

        MyListAdapter adapter=new MyListAdapter(this, maintitle, subtitle,imgid);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);
//pada bagian script di atas adalah untuk menghubungkan dari maintitle ,subtitle dan imgid bserupaya ketika di jalankan aplikasi
//        maka gambar dll akan tampil
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,int position, long id) {
// TODO Auto-generated method stub
                if(position == 0) {
//code specific to first list item
                    Toast.makeText(getApplicationContext(),"Place Your First Option Code",
                            Toast.LENGTH_SHORT).show();
                }else if(position == 1) {
//code specific to 2nd list item
                    Toast.makeText(getApplicationContext(),"Place Your Second Option Code",Toast.
                            LENGTH_SHORT).show();
                }
                else if(position == 2) {
                    Toast.makeText(getApplicationContext(),"Place Your Third Option Code",
                            Toast.LENGTH_SHORT).show();
                }
                else if(position == 3) {
                    Toast.makeText(getApplicationContext(),"Place Your Forth Option Code",
                            Toast.LENGTH_SHORT).show();
                }
                else if(position == 4) {
                    Toast.makeText(getApplicationContext(),"Place Your Fifth Option Code",
                            Toast.LENGTH_SHORT).show();
                }
//                pada bagian script di atas adalah untuk mengurutkan data data tiles,dan ketika di pilih akan
                //menampilan kalimat place yout fith option code
            }
        });
    }
}
