package com.Valentin.actividades;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ActividadDos extends Activity {
	
	TextView vista;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_dos);
        
        vista=(TextView)findViewById(R.id.Vista);
        
        //regresa intent que lleva la aplicación
        Intent lanzador=this.getIntent();
      //OBTENER SECUENCIA DE CARACTERES, EL "NOMBRE" ES LO MISMO QUE ESTA EN ACTIVIDAD UNO
        String cad=lanzador.getCharSequenceExtra("NOMBRE").toString(); 
       //IMPRIMO EN vista
        vista.setText(cad);
        
        //O BIEN SE PODÍA HACER ESTO
        //vista.setText(this.getIntent().getCharSequenceExtra("NOMBRE").toString());
    }

 
    
}
