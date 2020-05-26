package adapter.objectAdapter;

import adapter.classAdapter.USB;
import adapter.classAdapter.USBImpl;
import adapter.classAdapter.VGA;

/**
 * 对象适配器使用组合
 */
public class AdapterUSB2VGA implements VGA {

    USB u = new USBImpl();

    @Override
    public void projection() {
        u.showPPT();
    }
}
