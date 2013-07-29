package com.Valentin.actividades;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ActividadUno extends Activity {
	
	EditText editor;
	String cadena;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_uno);
        
        editor=(EditText)findViewById(R.id.texto);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_actividad_uno, menu);
        return true;
    }
    
    public void lanzar(View v)
    {
    	
    	//ponemos en el string lo que obtuvimos en la cadena de texto
    	cadena=editor.getText().toString();
    	
    	//creando aviso(notificacion) y concatenamos el texto obtenido
    	Toast.makeText(this, "Se presiono el boton y lanza app " + cadena, Toast.LENGTH_LONG).show();
    	
    	//creando el intent
    	Intent inten=new Intent(this,ActividadDos.class);
    	//metiendo valor a intent pasa valores a la otra actividad
    	inten.putExtra("NOMBRE", cadena);
    	
    	//lanzamos intent
    	this.startActivity(inten);
    }
}
