package DZ.DZ1.DZ06;

public class Notebook {
    private String modelName;
    private int ram;
    private int storageSize;
    private String OS;
    private String color;

    public Notebook(String modelName, int ram, int storageSize, String OS, String color) {
        this.modelName = modelName;
        this.ram = ram;
        this.storageSize = storageSize;
        this.OS = OS;
        this.color = color;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorageSize() {
        return storageSize;
    }

    public void setStorageSize(int storageSize) {
        this.storageSize = storageSize;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
