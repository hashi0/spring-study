package com.bai.pojo;

public class Cat extends Pet {
    private String type;
    private String name;
    private int age;

    void shout() {
        System.out.println("meow~");
    }


    public Cat() {
    }

    public Cat(String type, String name, int age) {
        this.type = type;
        this.name = name;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
            "type='" + type + '\'' +
            ", name='" + name + '\'' +
            ", age=" + age +
            '}';
    }

}
