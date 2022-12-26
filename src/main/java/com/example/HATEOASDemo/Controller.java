package com.example.HATEOASDemo;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.LinkBuilder;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {


    Service service = new Service();

    @GetMapping("/person/{name}")
    public Person getPerson(@PathVariable String name){
        return new Person();
    }

    @GetMapping("/persons")
    public List<Person> getPersons(){
        List<Person> list = service.getPersons();
        for(final Person person : list){
            Link link = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(Controller.class).
                    getPerson(person.name)).withSelfRel();
            person.add(link);
            Link addresslink = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(Controller.class).
                    getAddress(person.name)).withRel("allAddresses");
            person.add(addresslink);
        }
        return list;
    }

    @GetMapping("/address/{name}")
    public List<Address> getAddress(@PathVariable String name){
        List<Address> list = service.getAddress(name);
//        for(Address address : list){
//            Link link = WebMvcLinkBuilder.linkTo(Controller.class).slash(address.getCity()).withSelfRel();
//            address.add(link);
//        }
        return list;
    }

}
