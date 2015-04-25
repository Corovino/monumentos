package com.app.monumento.monumentapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class InformacionMonumento extends Fragment {


    ImageView imagen ;
    TextView nombre;
    TextView descripcion;


    public InformacionMonumento() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_informacion_monumento, container, false);

        imagen = (ImageView)v.findViewById(R.id.im_info_imagen);
        nombre = (TextView)v.findViewById(R.id.tx_info_nombre);
        descripcion = (TextView)v.findViewById(R.id.tx_info_descripcion);

        Bundle obtener = getArguments();

        imagen.setImageResource(obtener.getInt("data"));
        nombre.setText(obtener.getString("dato"));

        descripcion.setText(obtener.getString("des"));


        return v;
    }


}
