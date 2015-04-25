package com.app.monumento.monumentapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import com.app.monumento.monumentapp.MonumentosAdapter;
import com.app.monumento.monumentapp.Monumentos;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class Imagenes extends Fragment {


    private GridView gr_versiones;
    private List<Monumentos> versiones;
    Fragment fg = null;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_imagenes, container, false);

        gr_versiones = (GridView)v.findViewById(R.id.gr_main_monumentos);

        versiones = new ArrayList<>();


        versiones.add(new Monumentos(R.drawable.gonzalo,"Gonzalo Jimenez de Quesada.","Natural de Granada, España, se adentró por las selvas del norte de Colombia hasta llegar a tierra Muisca y fundar Santa Fe de Bogotá en 1538.\n" +
                "\n" +
                "La estatua es obra del escultor español Juan de Avalos y está fundida en bronce. El conquistador es presentado con su traje de soldado, portando una espada terminada en cruz."));
        versiones.add(new Monumentos(R.drawable.josedecaldas,"Fransico José de Caldas.","Natural de Popayán, fue uno de los grandes sabios de su época, dirigiendo el Observatorio Astronómico y publicando en un periódico de corte científico. En la estatua –también en bronce- aparece en una pose reflexiva y acompañado de algunos de los instrumentos que utilizó en sus investigaciones. La obra es del escultor francés Raul Carlos Verlet."));
        versiones.add(new Monumentos(R.drawable.josecuervo,"Rufino José Cuervo.","Bogotano e hijo de Rufino Cuervo, en su día presidente interino de la República.\n" +
                "\n" +
                "Destaca como un gran conocedor de la lengua castellana y autor de diversas obras sobre gramática y filología. Comenzó con la vasta obra “Diccionario de Construcción y Régimen de la Lengua Castellana” terminado años después de su muerte."));
        versiones.add(new Monumentos(R.drawable.camilotorres,"Camilo Torres","Conocido como “El Verbo de la Revolución” porque redactó la primera protesta escrita contra el Gobierno Español. Terminó fusilado, siendo expuesta su cabeza en una jaula. En la estatua se le representa ataviado como un abogado de su época –mediados S. XVIII- portando una amplia toga."));
        versiones.add(new Monumentos(R.drawable.simonbolivar,"Simón Bolivar.","Qué decir del Gran Libertador. Nació en Caracas y liberó del yugo español a países como Bolivia, Perú, Ecuador, Venezuela y Colombia.\n" +
                "\n" +
                "La estatua es del escultor italiano Pietro Tenerani. Bolívar aparece luciendo uniforme militar y una gran capa al estilo de los grandes mandatarios romanos. En una mano porta una espada y en la otra un documento."));
        versiones.add(new Monumentos(R.drawable.policarpa,"Policarpa Salavarrieta.","Se la puede considerar como la gran espía de su época, suministrando información muy importante para la lucha por la Independencia. Fue fusilada a los 21 años de edad.\n" +
                "\n" +
                "“La Pola” aparece en esta estatua de Dionisio Cortés en la pose que ella misma eligió para ser fusilada. Sentada, con las manos atadas tras su espalda y los ojos descubiertos."));
        versiones.add(new Monumentos(R.drawable.santander,"Francisco de Paula Santander.","Oriundo de Cúcuta, luchó junto a Bolívar en la campaña de 1819. Su mérito tras la Independencia fue impulsar la creación de leyes y poner orden a las finanzas del país.\n" +
                "\n" +
                "La estatua es obra del italiano Pietro Costa y Santander aparece vestido de militar, portando una espada en una mano y un documento en otra, símbolo de su gran faceta para promover leyes."));


        MonumentosAdapter adapterVersiones = new MonumentosAdapter(getActivity(),versiones);

        gr_versiones.setAdapter(adapterVersiones);

        gr_versiones.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                //metodos de fragmento
                FragmentManager fm = getActivity().getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                //igualar variable a nuevo fragmento
                fg = new InformacionMonumento();
               //remplazamos el fragmento actual por el nuevo
                ft.replace(R.id.fl_mian_contenedor, fg);
                ft.addToBackStack(null);
                ft.commit();

                Bundle args = new Bundle();

                Monumentos m = versiones.get(position);

                args.putInt("data",m.getImagen());
                args.putString("dato",m.getDescripcion());
                args.putString("des",m.getParrafo());
                fg.setArguments(args);



            }

        });
        return v;
    }



}
