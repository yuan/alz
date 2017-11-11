package im.alz.test;

public class ClassConstructorTest {
    public static void main(String[] args){
        Child2 child = new Child2();
        child.show();
    }
}

class Parent2{
    private Parent2 mSelf;
    Parent2(){
        mSelf = this;
    }
    public void show(){
        System.out.println(this.getClass().getName());
        System.out.println(super.getClass().getName());
        System.out.println(mSelf.getClass().getName());
    }
}
class Child2 extends Parent2{
    public void show(){
        System.out.println(this.getClass().getName());
        System.out.println(super.getClass().getName());
        super.show();
    }
}
