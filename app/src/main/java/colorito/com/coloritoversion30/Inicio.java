package colorito.com.coloritoversion30;


import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

public class Inicio extends Activity {

    Button bjugar, bconfi, bpuntajes;
    int tiempoPartida, tiempoPalabra, intentos;
    RelativeLayout layout;
    AnimationDrawable animationDrawable;
    protected void onCreate (Bundle savedInstanceState) {
        tiempoPartida=10; tiempoPalabra=3; intentos=0;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activty_inicio);
        bpuntajes= (Button) findViewById(R.id.puntajes);
        bjugar= (Button)findViewById(R.id.jugar);
        bconfi= (Button)findViewById(R.id.configuracion);
        layout= (RelativeLayout) findViewById(R.id.mipantalla);
        animationDrawable=(AnimationDrawable)layout.getBackground();
        animationDrawable.setEnterFadeDuration(4500);
        animationDrawable.setExitFadeDuration(4500);
        animationDrawable.start();

    }
    public void jugar (View v ){
        Intent i= new Intent(this, Partida.class);
        i.putExtra("tiempoPartida", tiempoPartida);
        i.putExtra("tiempoPalabra", tiempoPalabra);
        i.putExtra("intentos", intentos);
        startActivity(i);
    }

    public void configuracion (View v){
        Intent i= new Intent(this, Configuracion.class);
        startActivity(i);
    }

    public void Puntajes (View v){
        Intent i= new Intent(this, Puntajes.class );
        startActivity(i);
    }





}
