package optional;

public class Bicke {
    private String bikeName;
    private String model;

    public String getBikeName() {
        return bikeName;
    }

    public void setBikeName(String bikeName) {
        this.bikeName = bikeName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Bicke{" +
                "bikeName='" + bikeName + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
