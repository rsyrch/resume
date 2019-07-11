package www.rsyrch.com.resume.controller;

public class Car {
    private int id;
    private String name;
    private String time;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Car() {}

    public Car(int id, String name, String time) {
        this.id = id;
        this.name = name;
        this.time = time;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
