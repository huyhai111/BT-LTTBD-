package vn.edu.ou.carrider.demo;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends Activity {

    Car Xe;
    ImageView imgCar;
    Animation animation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move);
        imgCar = (ImageView)findViewById(R.id.imgCar);
        Xe = new Car(imgCar);
        Xe.getCarPicture().setImageResource(R.drawable.car);
        Xe.getCarPicture().startAnimation(animation);

    }
}
