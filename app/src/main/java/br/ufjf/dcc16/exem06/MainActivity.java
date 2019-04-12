package br.ufjf.dcc16.exem06;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<String> palavras = new ArrayList<String>(){{
        add("Um");
        add("Segundo");
        add("Três");
        add("Quatro");
    }};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView rv = findViewById(R.id.rvPalavras);
        PalavraAdapter pAdapter = new PalavraAdapter(this.palavras);
        rv.setAdapter(pAdapter);
        rv.setLayoutManager(new LinearLayoutManager(this));
        pAdapter.setOnPalavraClickListener(new PalavraAdapter.OnPalavraClickListener() {
            @Override
            public void onPalavraClick(View v, int position) {
                Toast.makeText(MainActivity.this, palavras.get(position), Toast.LENGTH_SHORT).show();;
            }
        });
    }
}
