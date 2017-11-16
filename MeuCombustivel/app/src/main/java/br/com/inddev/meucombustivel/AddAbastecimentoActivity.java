package br.com.inddev.meucombustivel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AddAbastecimentoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_abastecimento);

        this.setTitle("Novo abastecimento");
    }
}
