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

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;


public class FinalJuego extends Activity {

    ArrayList<Integer> puntos = new ArrayList<>();
    Button pasar;
    TextView texto;
    Context context;
    int puntaje, p1, p2, p3, p4, p5, vpd=0;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.final_juego);
        Bundle bundle = getIntent().getExtras();
        puntaje = bundle.getInt("puntaje");
        texto = (TextView) findViewById(R.id.textpuntaje);
        puntos.add(puntaje);
        texto.setText("" + puntaje);
        pasar = (Button) findViewById(R.id.buttonpasar);
        CargarPuntajes ();

    }

    private void CargarPuntajes() {
        SharedPreferences guardardatos = getSharedPreferences("Datos", Context.MODE_PRIVATE) ;
        int pt1= guardardatos.getInt("P1", vpd);
        int pt2= guardardatos.getInt("P2", vpd);
        int pt3= guardardatos.getInt("P3", vpd);
        int pt4= guardardatos.getInt("P4", vpd);
        int pt5= guardardatos.getInt("P5", vpd);
    }

    public void guardarPreferencias(){
        top5();
        SharedPreferences guardardatos = getSharedPreferences("Datos", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = guardardatos.edit();
        editor.putInt("P1", p1);
        editor.putInt("P2", p2);
        editor.putInt("P3", p3);
        editor.putInt("P4", p4);
        editor.putInt("P5", p5);
        editor.commit();
    }

    public void pasarpuntos(View v) {
        guardarPreferencias();
        Intent i = new Intent(this, Puntajes.class);
        startActivity(i);
        onPause();
    }

    public  void top5(){
        Comparator<Integer> comparator = Collections.reverseOrder();
        Collections.sort(puntos, comparator);
        p1=puntos.get(0);
        if (puntos.size()>=2){
            p2=puntos.get(1);
        }
        if (puntos.size()>=3){
            p3=puntos.get(2);
        }
        if (puntos.size()>=4){
            p4= puntos.get(3);
        }

        if(puntos.size()>=5){
            p5= puntos.get(4);
        }
    }


}
