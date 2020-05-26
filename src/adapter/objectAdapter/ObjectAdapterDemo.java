package adapter.objectAdapter;

import adapter.classAdapter.Projector;
import adapter.classAdapter.VGA;

public class ObjectAdapterDemo {

    public static void main(String[] args) {
        VGA vga = new AdapterUSB2VGA();
        //进行投影
        Projector p1=new Projector();
        p1.projection(vga);
    }
}
