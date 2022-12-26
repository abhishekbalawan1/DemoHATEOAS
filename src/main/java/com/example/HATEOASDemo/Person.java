package com.example.HATEOASDemo;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.RepresentationModel;
import org.springframework.stereotype.Component;

@Component
public class Person  extends RepresentationModel<Person> {

    String name;
    int age;

    public Person(){}

    public Person(String name, String address, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(Link initialLink, String name, String address, int age) {
        super(initialLink);
        this.name = name;
        this.age = age;
    }

    public Person(Iterable<Link> initialLinks, String name, String address, int age) {
        super(initialLinks);
        this.name = name;
        this.age = age;
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
}
