package core;

public class Person {

    private String name;
    private int key;

    public Person(String name, int key) {
        this.name = name;
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String toString() {
        return key + " - " + name;
    }

}
