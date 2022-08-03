package model;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

public class Person {
    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void init(){
        System.out.println("Bean inti");
    }

    public void destroy(){
        System.out.println("Bean destroy");
    }

    @Bean(name = "person", initMethod = "init", destroyMethod = "destroy")
    @Scope(value = "prototype")
    public Person person(){
        return new Person();
    }
}
