package Prototype;

import build.Computer;

/**
 * 原型模式 通过复制现有实例来创建新的实例，无需知道相应类的信息。
 * 可以解决构建复杂对象的资源消耗问题，能再某些场景中提升构建对象的效率；
 * 还有一个重要的用途就是保护性拷贝，可以通过返回一个拷贝对象的形式，实现只读的限制。
 */
public class Prototype implements Cloneable{

    @Override
    public Object clone() throws CloneNotSupportedException {
        Prototype proto = (Prototype) super.clone();
        return proto;
    }
}
