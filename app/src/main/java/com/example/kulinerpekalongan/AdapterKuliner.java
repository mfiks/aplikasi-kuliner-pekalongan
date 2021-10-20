package com.example.kulinerpekalongan;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class AdapterKuliner extends ArrayAdapter {

    String namaKuliner [];
    String ketKuliner [];
    String hargaKuliner [];
    int gambarKuliner [];
    Activity activity;

    public AdapterKuliner(MainActivity activity, String[] namaKuliner, int[] gambarKuliner, String[] ketKuliner, String[] hargaKuliner){
        super(activity, R.layout.list_item,namaKuliner);
        this.namaKuliner = namaKuliner;
        this.ketKuliner = ketKuliner;
        this.hargaKuliner = hargaKuliner;
        this.gambarKuliner = gambarKuliner;
        this.activity = activity;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = activity.getLayoutInflater();
        View v=inflater.inflate(R.layout.list_item, null);

        ImageView gambar;
        TextView nama_kuliner, harga_kuliner;


        gambar = v.findViewById(R.id.gambar_kuliner);
        nama_kuliner = v.findViewById(R.id.nama_kuliner);
        harga_kuliner = v.findViewById(R.id.harga_kuliner);

        gambar.setImageResource(gambarKuliner[position]);
        nama_kuliner.setText(namaKuliner[position]);
        harga_kuliner.setText(hargaKuliner[position]);

        return v;
    }
}
