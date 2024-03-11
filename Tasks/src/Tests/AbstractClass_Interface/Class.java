package Tests.AbstractClass_Interface;

public class Class extends AbstractClass{

    @Override
    int abstractmethod() {
        return 5;
    }

    @Override
    public void Hello() {

    }

    public static void main(String[] args) {
        Class classname = new Class();
        classname.nonabstractmethod();
        classname.extended2P();
    }
}
