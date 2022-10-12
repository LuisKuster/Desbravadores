package br.udesc.desbravadores;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    //private static final String[] LOCAIS = new String[] {
    //        "Cachoeira do Tatete", "Cachoeira da Onça", "Cachoeira Tabarelli", "Cachoeira da Santa", "Prefeitura"
    //};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //AutoCompleteTextView texto = findViewById(R.id.editAutoCompletar);
       // ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
        //        android.R.layout.simple_list_item_1, LOCAIS);
       //texto.setAdapter(adapter);
    }

    @SuppressLint("ResourceAsColor")
    public void abrirToast(View view){

        TextView textView = new TextView(getApplicationContext());
        textView.setBackgroundResource(R.drawable.botao_login);
        textView.setTextSize(22);
        textView.setTextColor(R.color.cor_text_verde_escuro);
        textView.setText("Cadastrado com Sucesso!!!");

        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(textView);
        toast.show();
    }





}