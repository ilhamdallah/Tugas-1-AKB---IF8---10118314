package com.example.tugas1akb_if8_10118314.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class AccountFragment extends Fragment {
    /*
    NIM             : 10118314
    Nama            : Moch Rivally Ilham Bintang
    Kelas           : IF8
    Matakuliah      : Aplikasi Komputasi Bergerak

    4 april 2021  : Membuat aktivity account_fragment untuk logic ketika bottomviewer diklik. juga membuat layout acoount untuk tampilan fragment
    4 april 2021  : Membuat findme, connect instagram, dan konten untuk fragment account
     */
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.account, container, false);
        return view;
    }




}

