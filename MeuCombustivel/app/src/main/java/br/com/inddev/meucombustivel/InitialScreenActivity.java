package br.com.inddev.meucombustivel;

import android.icu.util.Calendar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import br.com.inddev.meucombustivel.adapter.ListViewAdapter;
import br.com.inddev.meucombustivel.model.entity.Abastecimento;

public class InitialScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_initial_screen);

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
    }
}
