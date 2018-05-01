package colorito.com.coloritoversion30;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Configuracion extends Activity {
    RadioButton parti10, parti15, parti20, pal3, pal5, pal7, int0, int2, int5;
    int tiempoPartida, tiempoPalabra, intentos;
    Button boton;
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.configuracion);
        parti10= (RadioButton) findViewById(R.id.buton10s);
        parti15= (RadioButton) findViewById(R.id.buton15s);
        parti20= (RadioButton) findViewById(R.id.buton20s);
        pal3= (RadioButton) findViewById(R.id.buton3s);
        pal5= (RadioButton) findViewById(R.id.buton5s);
        pal7= (RadioButton) findViewById(R.id.buton7s);
        int0= (RadioButton) findViewById(R.id.buton0int);
        int2= (RadioButton) findViewById(R.id.buton2int);
        int5= (RadioButton) findViewById(R.id.buton5int);
        boton= (Button) findViewById(R.id.bton);

    }
    public void BotonPartida (View v){
        boolean checked =((RadioButton)v).isChecked();
        switch (v.getId()){
            case R.id.buton10s:
                if (checked){
                    tiempoPartida=10;
                }
                break;
            case R.id.buton15s:
                if (checked){
                    tiempoPartida=15;
                }
                break;
            case R.id.buton20s:
                if (checked){
                    tiempoPartida=20;
                }
                break;
        }
    }

    public void BotonPalabra (View v){
        boolean checked = ((RadioButton)v).isChecked();
        switch (v.getId()){
            case R.id.buton3s:
                if (checked){
                    tiempoPalabra=3;
                }
                break;
            case R.id.buton5s:
                if (checked){
                    tiempoPalabra=5;
                }
                break;
            case R.id.buton7s:
                if (checked){
                    tiempoPalabra=7;
                }
                break;
        }
    }

    public void BotonIntentos (View v){
        boolean checked = ((RadioButton)v).isChecked();
        switch (v.getId()){
            case R.id.buton0int:
                if (checked){
                    intentos=0;
                }
                break;
            case R.id.buton2int :
                if (checked){
                    intentos=2;
                }
                break;
            case R.id.buton5int:
                if (checked){
                    intentos=5;
                }
                break;
        }
    }

    public void pasarDatos (View view){
        Intent intent = new Intent(this,Partida.class);
        intent.putExtra("tiempoPalabra", tiempoPalabra);
        intent.putExtra("tiempoPartida",tiempoPartida);
        intent.putExtra("intentos",intentos);
        startActivity(intent);
    }



}
