package br.udesc.desbravadores.activity;

import android.annotation.SuppressLint;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import br.udesc.desbravadores.R;

public class MainActivity extends AppCompatActivity {


    private static final String[] LOCAIS = new String[] {
           "Cachoeira do Tatete", "Cachoeira da Onça", "Cachoeira Tabarelli", "Cachoeira da Santa", "Prefeitura"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Banco de dados SQLite

        try{
            //Criar Banco de dados
            SQLiteDatabase bancoDados = openOrCreateDatabase("desbravadores", MODE_PRIVATE, null);

            //Criar tabelas
            bancoDados.execSQL("CREATE TABLE IF NOT EXISTS pessoas (nome VARCHAR, email VARCHAR, senha VARCHAR)");


            //Inserir dados
            bancoDados.execSQL("INSERT INTO pessoas(nome, email, senha) VALUES ('Ricardo Augusto', 'ricardoaugustowegner@gmail.com', '12345678')");
            bancoDados.execSQL("INSERT INTO pessoas(nome, email, senha) VALUES ('Luis Felipe', 'luisfelipe@gmail.com', '87654321')");

            //Recuperar Dados
            Cursor cursor = bancoDados.rawQuery("SELECT nome, email, senha FROM pessoas", null);

                // indide da tabela

            int indiceNome = cursor.getColumnIndex("nome");
            int indiceEmail = cursor.getColumnIndex("email");
            int indiceSenha = cursor.getColumnIndex("senha");

            cursor.moveToFirst();

            while (cursor != null){
                Log.i("RESULTADO - nome: ", cursor.getString(indiceNome));
                Log.i("RESULTADO - email: ", cursor.getString(indiceEmail));
                Log.i("RESULTADO - senha: ", cursor.getString(indiceSenha));
                cursor.moveToNext();
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }


        //AutoCompleteTextView texto = findViewById(R.id.editAutoCompletar);
        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
         //       android.R.layout.simple_list_item_1, LOCAIS);
      // texto.setAdapter(adapter);
    }

    @SuppressLint("ResourceAsColor")
    public void abrirToast(View view){

        TextView textView = new TextView(getApplicationContext());
        textView.setBackgroundResource(R.drawable.botao_borda_verde_radius);
        textView.setTextSize(15);
        textView.setTextColor(R.color.cor_text_verde_escuro);
        textView.setText("Cadastrado com Sucesso!");

        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(textView);
        toast.show();
    }





}