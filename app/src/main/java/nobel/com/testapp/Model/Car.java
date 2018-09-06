package nobel.com.testapp.Model;

/**
 * Created by Mohamed Nabil Mohamed (Nobel) on 9/6/2018.
 * byte code SA
 * m.nabil.fci2015@gmail.com
 */
public class Car {
    String name;
    String date;
    int carImage;
    int carMake;

    public Car(String name, String date, int carImage, int carMake) {
        this.name = name;
        this.date = date;
        this.carImage = carImage;
        this.carMake = carMake;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getCarImage() {
        return carImage;
    }

    public void setCarImage(int carImage) {
        this.carImage = carImage;
    }

    public int getCarMake() {
        return carMake;
    }

    public void setCarMake(int carMake) {
        this.carMake = carMake;
    }
}
