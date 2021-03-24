package web.model;

public class Car {
    private String type;
    private String name;
    private String colors;

    public Car(String type, String name, String colors) {
        this.type = type;
        this.name = name;
        this.colors = colors;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColors() {
        return colors;
    }

    public void setColors(String colors) {
        this.colors = colors;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", colors='" + colors + '\'' +
                '}';
    }
}
