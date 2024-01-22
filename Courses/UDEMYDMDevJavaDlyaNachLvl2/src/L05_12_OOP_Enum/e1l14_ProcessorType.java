package L05_12_OOP_Enum;

public enum e1l14_ProcessorType implements i3l14_Describable {
    BIT_32("bit-32"),
//            {
//        @Override
//        public void getDescription() {
//            System.out.println("bit-32 description");
//        }
//    },
    BIT_64("bit-64");
//            {
//        @Override
//        public void getDescription() {
//            System.out.println("bit-64 description");
//        }
//    };


    private String name;

    e1l14_ProcessorType(String name) {
        this.name = name;
    }

    @Override
    public String getDescription() {
        return name + " description";
    }

//    public abstract void getDescription();

    public String getName() {
        return name;
    }
}
