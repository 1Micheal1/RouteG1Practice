package nobel.com.testapp.Model;

/**
 * Created by Mohamed Nabil Mohamed (Nobel) on 8/30/2018.
 * byte code SA
 * m.nabil.fci2015@gmail.com
 */

public class Student {
    String name;
    String ImageName;

    public Student(String name, String imageName) {
        this.name = name;
        ImageName = imageName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageName() {
        return ImageName;
    }

    public void setImageName(String imageName) {
        ImageName = imageName;
    }
}
