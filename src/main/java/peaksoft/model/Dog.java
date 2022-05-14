package peaksoft.model;

import org.springframework.stereotype.Component;

/*
peaksoft.model
Tarih: 12.05.2022, Saat: 17:03, Author: Grey
*/
@Component
public class Dog extends Animal{
    @Override
    public String toString() {
        return "I'm dog";
    }
}
