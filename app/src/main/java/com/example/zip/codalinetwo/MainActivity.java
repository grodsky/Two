package com.example.zip.codalinetwo;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

public class MainActivity extends FragmentActivity {

    private FragmentManager manager;
    private FragmentTransaction transaction;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        manager = getSupportFragmentManager();
        initFragmentLast();
    }

    private void initFragmentLast() {
        transaction = manager.beginTransaction();
        transaction.add(R.id.conteiner, new LastFragment());
        transaction.commit();
    }

}

