package colorito.com.coloritoversion30;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Cargar_Pantalla extends AppCompatActivity {


    ImageView imagen;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cargar__pantalla);
        imagen=(ImageView) findViewById(R.id.imagen);
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.anima_1);
        imagen.startAnimation(animation);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(Cargar_Pantalla.this, Inicio.class);
                startActivity(i);
                finish();
            }
        }, 5000);
    }
}
