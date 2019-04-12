package be.pdr.business;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class ObserverClass implements PropertyChangeListener {

    //
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if (evt.getPropertyName().equals("NameChanged")) {
            System.out.println("Property Name = " + evt.getPropertyName());
            System.out.println("Old Value = " + evt.getOldValue());
            System.out.println("New Value = " + evt.getNewValue());
        } else if (evt.getPropertyName().equals("AgeChanged")) {
            System.out.println("Property Name = " + evt.getPropertyName());
            System.out.println("Old Value = " + evt.getOldValue());
            System.out.println("New Value = " + evt.getNewValue());
        }
    }
}
