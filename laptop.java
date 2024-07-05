public class laptop {
    // поля
    private String model;
    private String ram;
    private String hdd;
    private String os;
    private String color;

    // конструктор
    public laptop(String model, String ram, String hdd, String os, String color) {
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
        this.color = color;
    }

    // геттеры
    public String getModel() {
        return model;
    }

    public String getRAM() {
        return ram;
    }

    public String getHDD() {
        return hdd;
    }

    public String getOS() {
        return os;
    }

    public String getColor() {
        return color;
    }

    // сеттеры
    public void setModel(String model) {
        this.model = model;
    };

    public void setRAM(String ram) {
        this.ram = ram;
    };

    public void setHDD(String hdd) {
        this.hdd = hdd;
    }

    public void setOS(String os) {
        this.os = os;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // вывод
    @Override
    public String toString() {
        String result = String
                .format("С заданными параметрами в наличии есть ноутбуки модели: %s\nНа операционной системе: %s\n"+ //
                    "Оперативная память: %s, жеский диск: %s\n"+ //
                    "Цвет: %s ", model, os, ram, hdd, color);
        return result;
    }

}