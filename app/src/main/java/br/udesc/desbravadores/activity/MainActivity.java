package br.udesc.desbravadores.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import br.udesc.desbravadores.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void fazerLogin(View view) {
        Intent login = new Intent(MainActivity.this, LoginActivity.class);
        startActivity(login);
    }

    public void listaLocais(View view) {
        Intent listaLocais = new Intent(MainActivity.this, PontosTuristicosAcitivity.class);
        startActivity(listaLocais);
    }
}

    //private static final String[] LOCAIS = new String[]{
    //      "Cachoeira do Tatete", "Cachoeira da Onça", "Cachoeira Tabarelli", "Cachoeira da Santa", "Prefeitura"
    //};

    //AutoCompleteTextView texto = findViewById(R.id.editAutoCompletar);
    //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
    //       android.R.layout.simple_list_item_1, LOCAIS);
    //texto.setAdapter(adapter);
