package colorito.com.coloritoversion30;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class Puntajes extends Activity  {
    Button bguardar;
    TextView t1, t2, t3, t4, t5;
    Context context;
   int vpd=0;
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bguardar = (Button) findViewById(R.id.guardar);
        Bundle bun = getIntent().getExtras();
        t1= (TextView) findViewById(R.id.t1) ;
        t2= (TextView) findViewById(R.id.t2) ;
        t3= (TextView) findViewById(R.id.t3);
        t4= (TextView) findViewById(R.id.t4);
        t5= (TextView) findViewById(R.id.t5);
        mostrarPuntajes();

    }

    public void mostrarPuntajes (){
            SharedPreferences guardardatos = getSharedPreferences("Datos", Context.MODE_PRIVATE) ;
            int pt1= guardardatos.getInt("P1", vpd);
            int pt2= guardardatos.getInt("P2", vpd);
            int pt3= guardardatos.getInt("P3", vpd);
            int pt4= guardardatos.getInt("P4", vpd);
            int pt5= guardardatos.getInt("P5", vpd);
            t1.setText(""+pt1);
            t2.setText(""+pt2);
            t3.setText(""+pt3);
            t4.setText(""+pt4);
            t5.setText(""+pt5);



    }

    public void guardar (View v){
        Intent intent = new Intent(this, Inicio.class);
        startActivity(intent);
    }

    public void volverjuego (View v){
        Intent intent = new Intent(this, Partida.class);
        startActivity(intent);
    }

}
