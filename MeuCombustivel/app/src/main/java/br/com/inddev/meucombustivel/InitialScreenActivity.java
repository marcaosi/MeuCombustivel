package br.com.inddev.meucombustivel;

import android.content.Intent;
import android.icu.util.Calendar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import br.com.inddev.meucombustivel.adapter.ListViewAdapter;
import br.com.inddev.meucombustivel.model.entity.Abastecimento;

public class InitialScreenActivity extends AppCompatActivity {

    private Button newSupllyButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_initial_screen);

        newSupllyButton = (Button) findViewById(R.id.initial_screen_newSupply_button);

        Abastecimento abastecimento = new Abastecimento();
        abastecimento.setDataHora(System.currentTimeMillis());
        abastecimento.setPosto("Posto 459 - Congonhal");
        abastecimento.setPrecoPorLitro(4.15);
        abastecimento.setQuantidadeLitros(20l);
        abastecimento.setQuilometragemAtual(150000l);
        abastecimento.setId(1l);

        List<Abastecimento> abastecimentoArrayList = new ArrayList<>();
        abastecimentoArrayList.add(abastecimento);

        ListView abastecimentoListView = (ListView) findViewById(R.id.initial_screen_listView);
        ListViewAdapter listViewAdapter = new ListViewAdapter(this, abastecimentoArrayList);
        abastecimentoListView.setAdapter(listViewAdapter);

        newSupllyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentNewSupplyActivity = new Intent(InitialScreenActivity.this, AddAbastecimentoActivity.class);
                startActivity(intentNewSupplyActivity);
            }
        });
    }
}
