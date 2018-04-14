package colorito.com.coloritoversion30;


import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

public class Inicio extends Activity {

    ImageButton imagen;
    RelativeLayout layout;
    AnimationDrawable animationDrawable;
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activty_inicio);
        imagen= (ImageButton)findViewById(R.id.imageButton2);
        layout= (RelativeLayout) findViewById(R.id.mipantalla);
        animationDrawable=(AnimationDrawable)layout.getBackground();
        animationDrawable.setEnterFadeDuration(4500);
        animationDrawable.setExitFadeDuration(4500);
        animationDrawable.start();
    }
}
