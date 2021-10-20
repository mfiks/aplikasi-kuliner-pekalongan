package com.example.kulinerpekalongan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String namaKuliner[]={"Nasi Megono",
                            "Soto Tauto",
                            "Apem Kesesi",
                            "Pindang Tetel",
                            "Kluban",
                            "Sayur Botok",
                            "Glundung",
                            "Srintil",
                            "Growol",
                            };

        int gambarKuliner[]={R.drawable.megono,
                            R.drawable.taoto,
                            R.drawable.apem,
                            R.drawable.pindangtetel,
                            R.drawable.kluban,
                            R.drawable.botok,
                            R.drawable.glundung,
                            R.drawable.srintil,
                            R.drawable.growol
                            };

        String ketKuliner[]={"Nasi megono yaitu nasi yang dipadukan dengan sayur olahan nangka muda yang dipadukan dengan bumbu sambal kelapa.",
                            "Soto tauto lebih mirip jenis makanan sop daging kuah kental yang diracik menggunakan bumbu tauco",
                            "Apem kesesi adalah salah satu kue tradisional khas Pekalongan.",
                            "Pindang tetel lebih mirip rawon dan dibuat dari tetelan daging iga sapi, bukan ikan pindang",
                            "Kluban terdiri dari sayuran yang diberi bumbu parutan kelapa, kluban mirip seperti urap",
                            "Sayur Botok adalah campuran dari tahu dan bongkrek, dan menggunakan sayur dari parutan kelapa",
                            "Glundung bahan bakunya berupa ketela pohon, Glundung dilengkapi dengan gula aren sebagai isinya",
                            "Srinthil hampir mirip dengan Ongol-ongol yakni sama-sama memiliki tekstur yang kenyal, gurih, serta manis karena terdapat campuran gula merah",
                            "Bahan dasar dari growol ini adalah singkong. Growol juga seringkali dijadikan sebagai makanan alternatif pengganti nasi oleh masyarakat lokal Pekalongan"
                            };

        String[] hargaKuliner ={"Rp. 2.000",
                                "Rp. 20.000",
                                "Rp. 1.000",
                                "Rp. 15.000",
                                "Rp. 5.000",
                                "Rp. 5.000",
                                "Rp. 1.000",
                                "Rp. 3.000",
                                "Rp. 2.000"};


        listView=findViewById(R.id.listDataKuliner);
        AdapterKuliner adapterKuliner = new AdapterKuliner(this, namaKuliner, gambarKuliner,ketKuliner, hargaKuliner);
        listView.setAdapter(adapterKuliner);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String nm_Kuliner = namaKuliner[position].toString();
                int gbr_kuliner = gambarKuliner[position];
                String ket_kuliner = ketKuliner[position].toString();
                String hrg_kuliner = hargaKuliner[position].toString();

                //Toast.makeText(MainActivity.this, ""+gbr_buah, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,DetailKuliner.class);
                intent.putExtra("namakuliner", nm_Kuliner);
                intent.putExtra("gambarkuliner",gbr_kuliner);
                intent.putExtra("ketkuliner",ket_kuliner);
                intent.putExtra("hrgkuliner", hrg_kuliner);
                startActivity(intent);
            }


        });
    }
}