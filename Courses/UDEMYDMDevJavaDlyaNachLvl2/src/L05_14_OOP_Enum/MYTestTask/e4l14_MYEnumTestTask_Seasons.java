package L05_14_OOP_Enum.MYTestTask;

import L05_14_OOP_Enum.i3l14_Describable;

public enum e4l14_MYEnumTestTask_Seasons implements i3l14_Describable {


    WINTER("winter ", "cold bzzz "),

    SUMMER("summer ", "hooot vary hooot");

    private String name;
    private String description;

    e4l14_MYEnumTestTask_Seasons(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public String getDescription() {
        return name + description;
    }
}