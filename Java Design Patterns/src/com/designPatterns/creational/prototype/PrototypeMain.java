package com.designPatterns.creational.prototype;

public class PrototypeMain {

    public static void main(String[] args) {
//        Student student = new Student(1,"Santhosh",12);
//        student.showStudent();
//        Student student1 = (Student) student.getClone();
//        //student1.setName("Rocky");
//        student1.showStudent();
//        System.out.println(student.equals(student1));

        Car v = new Car("test","test","test",100);
        v.showDetails();
        //v.getClone();
        Bus b = new Bus("ASHOK","LONG","YELLOW",80);
        b.showDetails();
    }
}
