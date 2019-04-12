package be.pdr.runner;

import be.pdr.business.ObserverClass;
import be.pdr.business.Person;

public class Runner {

    public static void main(String[] args) {

        Person person = new Person();
        ObserverClass observerClass = new ObserverClass();

        person.addNameObserver(observerClass);
        person.addAgeObserver(observerClass);

        person.setName("Philip");
        person.setAge(35);
    }
}
