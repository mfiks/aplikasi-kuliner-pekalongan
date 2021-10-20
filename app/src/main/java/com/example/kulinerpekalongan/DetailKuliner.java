package com.example.kulinerpekalongan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailKuliner extends AppCompatActivity {
    ImageView gambarkuliner_detail;
    TextView namakuliner_detail, keterangankuliner_detail, hargakuliner_detail;

    String namakuliner_key = "namakuliner";
    String ketkuliner_key = "ketkuliner";
    String hrgkuliner_key = "hrgkuliner";
    int gambarkuliner;


    String namaKulinere;
    String ketKulinere;
    String hrgKulinere;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_kuliner);
        gambarkuliner_detail=findViewById(R.id.tampilDetailGambar);
        namakuliner_detail=findViewById(R.id.tampilDetailNama);
        keterangankuliner_detail=findViewById(R.id.tampilDetailKeterangan);
        hargakuliner_detail=findViewById((R.id.tampilDetailHarga));

        Bundle bundle = getIntent().getExtras();

        gambarkuliner = bundle.getInt(String.valueOf("gambarkuliner"));
        namaKulinere=bundle.getString("namakuliner");
        ketKulinere=bundle.getString("ketkuliner");
        hrgKulinere=bundle.getString("hrgkuliner");

        gambarkuliner_detail.setImageResource(gambarkuliner);
        namakuliner_detail.setText(namaKulinere);
        keterangankuliner_detail.setText(ketKulinere);
        hargakuliner_detail.setText(hrgKulinere);

    }
}