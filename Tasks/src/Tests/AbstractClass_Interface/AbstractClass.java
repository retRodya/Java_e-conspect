package Tests.AbstractClass_Interface;

public abstract class AbstractClass extends AbstractClass2 implements Interface  {

    String field;


    int nonabstractmethod() {
        return 5;
    }

    abstract int abstractmethod ();
}
