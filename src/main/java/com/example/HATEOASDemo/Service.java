package com.example.HATEOASDemo;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

@org.springframework.stereotype.Service
public class Service {

    List<Person> persons;
    HashMap<String, List<Address>> addressMap;

    Service(){
        persons = new LinkedList<>();
        addressMap = new HashMap<>();
        Person person1 = new Person("Raju", "Pune", 32);
        Person person2 = new Person("Bandu", "Kolhapur", 34);
        persons.add(person1);
        persons.add(person2);

        List<Address> list1 = new LinkedList<>();
        Address address1 = new Address("Pune","ABC", "123","road1");
        Address address2 = new Address("Mumbai","ABC", "534","rc1");
        list1.add(address1);
        list1.add(address2);

        List<Address> list2 = new LinkedList<>();
        Address address3 = new Address("Pune","ABC", "123","road1");
        Address address4 = new Address("Mumbai","ABC", "534","rc1");
        list2.add(address3);
        list2.add(address4);

        addressMap.put("Raju", list1);
        addressMap.put("Bandu", list2);
    }

    public List<Person> getPersons(){
        return persons;
    }

    public List<Address> getAddress(String name){
        return addressMap.get(name);
    }
}
