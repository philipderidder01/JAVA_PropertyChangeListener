package be.pdr.business;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Person {

    //STATE
    private String name;
    private int age;

    private PropertyChangeSupport changeSupport;

    //CONSTRUCTOR
    public Person() {
        changeSupport = new PropertyChangeSupport(this);
    }

    //GETTERS
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    //SETTERS
    public void setName(String cName) {
        String oldName = name;
        this.name = cName;
        changeSupport.firePropertyChange("NameChanged", oldName, name);
    }

    public void setAge(int cAge) {
        int oldAge = age;
        this.age = cAge;
        changeSupport.firePropertyChange("AgeChanged", oldAge, age);
    }

    //METHOD TO ADD AN OBSERVER IN OBSERVING CLASS WHEN NAME IS CHANGED
    public void addNameObserver(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener("NameChanged", listener);
    }

    //METHOD TO ADD AN OBSERVER IN OBSERVING CLASS WHEN AGE IS CHANGED
    public void addAgeObserver(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener("AgeChanged", listener);
    }
}
