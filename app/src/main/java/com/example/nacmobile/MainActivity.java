package com.example.nacmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    GridView gridView;

    String[] store = {"Mercado Livre", "Buscapé", "eBay", "WebMotors", "Magalu",
            "NetShoes", "Americanas", "Submarino"};

    int[] image = {R.drawable.mercadolivre, R.drawable.buscape, R.drawable.ebay,
            R.drawable.webmotors, R.drawable.magalu, R.drawable.netshoes,
            R.drawable.americanas, R.drawable.submarino};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.grid_view);
        MainAdapter adapter = new MainAdapter(MainActivity.this,store,image);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = null;

                switch (position) {
                    case 0:
                        intent = new Intent(MainActivity.this, MercadoLivreActivity.class);
                        startActivity(intent);
                        return;
                    case 1:
                        intent = new Intent(MainActivity.this, BuscapeActivity.class);
                        startActivity(intent);
                        return;
                    case 2:
                        intent = new Intent(MainActivity.this, EbayActivity.class);
                        startActivity(intent);
                        return;
                    case 3:
                        intent = new Intent(MainActivity.this, WebmotorsActivity.class);
                        startActivity(intent);
                        return;
                    case 4:
                        intent = new Intent(MainActivity.this, MagaluActivity.class);
                        startActivity(intent);
                        return;
                    case 5:
                        intent = new Intent(MainActivity.this, NetshoesActivity.class);
                        startActivity(intent);
                        return;
                    case 6:
                        intent = new Intent(MainActivity.this, AmericanasActivity.class);
                        startActivity(intent);
                        return;
                    case 7:
                        intent = new Intent(MainActivity.this, SubmarinoActivity.class);
                        startActivity(intent);
                        return;

                }

            }
        });
    }

    public void onMagalu(View view) {

        Intent intent = new Intent(this,MagaluActivity.class);

        startActivity(intent);

    }

}
