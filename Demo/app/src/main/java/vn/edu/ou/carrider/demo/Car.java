package vn.edu.ou.carrider.demo;

import android.widget.ImageView;

/**
 * Created by Danh on 3/26/2017.
 */

public class Car {
    private ImageView CarPicture;

    public Car(ImageView carPicture) {
        CarPicture = carPicture;
    }

    public void setCarPicture(ImageView carPicture) {
        CarPicture = carPicture;
    }

    public ImageView getCarPicture() {
        return CarPicture;
    }
}
