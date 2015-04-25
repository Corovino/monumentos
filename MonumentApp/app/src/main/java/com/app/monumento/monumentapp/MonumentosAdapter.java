package com.app.monumento.monumentapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Patricia Gloria on 10/02/2015.
 */
public class MonumentosAdapter extends BaseAdapter {


    private Context c ;
    private List<Monumentos> versiones;


    public MonumentosAdapter(Context c , List<Monumentos> versiones){
        this.c = c;
        this.versiones = versiones;
    }


    @Override
    public int getCount() {
        return versiones.size();
    }

    @Override
    public Object getItem(int position) {
        return versiones.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
                    convertView = LayoutInflater.from(c).inflate(R.layout.item_monumentos,null);

        }
        ImageView imagen = (ImageView)convertView.findViewById((R.id.img_item_vers));
        TextView nombre = (TextView)convertView.findViewById(R.id.tx_item_vers_nombre);

        Monumentos v = versiones.get(position);

        imagen.setImageResource(v.getImagen());
        nombre.setText(v.getDescripcion());


        return convertView;
    }
}
