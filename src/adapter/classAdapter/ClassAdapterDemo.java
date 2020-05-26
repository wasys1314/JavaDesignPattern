package adapter.classAdapter;


/**
 * 类适配器
 * 通过多重继承目标接口和被适配者类方式来实现适配
 */
public class ClassAdapterDemo {

    public static void main(String[] args) {
        //通过适配器创建一个VGA对象，这个适配器实际是使用的是USB的showPPT（）方法
        VGA a=new AdapterUSB2VGA();
        //进行投影
        Projector p1=new Projector();
        p1.projection(a);
    }

}
