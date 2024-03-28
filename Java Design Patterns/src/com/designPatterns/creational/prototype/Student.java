package com.designPatterns.creational.prototype;

public class Student implements Prototype{
    private int id;
    private String name;
    private int className;
    Student(){
        System.out.println("Object from C");
    }

    public Student(int id, String name, int className) {
        System.out.println("Object from PC");
        this.id = id;
        this.name = name;
        this.className = className;
    }

    public void showStudent(){
        System.out.println(toString());
    }
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", className=" + className +
                '}';
    }

    @Override
    public Prototype getClone() {
        return new Student(id,name, className);
    }

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

    public int getClassName() {
        return className;
    }

    public void setClassName(int className) {
        this.className = className;
    }
}
