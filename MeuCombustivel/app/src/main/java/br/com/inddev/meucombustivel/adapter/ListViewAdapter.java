package br.com.inddev.meucombustivel.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import br.com.inddev.meucombustivel.R;
import br.com.inddev.meucombustivel.model.entity.Abastecimento;

/**
 * Created by marca on 16/11/2017.
 */

public class ListViewAdapter extends BaseAdapter {
    private List<Abastecimento> itemList;
    private Context context;

    public ListViewAdapter(Context context, List<Abastecimento> itemList) {
        this.itemList = itemList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return itemList.size();
    }

    @Override
    public Object getItem(int position) {
        return itemList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return itemList.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Abastecimento abastecimento = itemList.get(position);
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = convertView;
        if(view == null){
            view = inflater.inflate(R.layout.item_list_view, parent, false);
        }

        TextView postoTextView = (TextView)view.findViewById(R.id.initial_screen_textView_posto);
        postoTextView.setText(abastecimento.getPosto());

        TextView valorTextView = (TextView)view.findViewById(R.id.initial_screen_textView_valor);
        valorTextView.setText("R$ "+String.valueOf(abastecimento.getPrecoPorLitro()*abastecimento.getQuantidadeLitros()));

        TextView litrosTextView = (TextView)view.findViewById(R.id.initial_screen_textView_litros);
        litrosTextView.setText(String.valueOf(abastecimento.getQuantidadeLitros())+" Litros");

        return view;
    }
}
