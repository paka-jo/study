package com.paka.annotation_circulation.solution;

import com.paka.annotation_circulation.common.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service("animalServicePrimary")
public class AnimalSer {

    private Animal animal;

    @Autowired
    public AnimalSer(Animal animal) { this.animal =animal;}

    public void AnimalCry() { animal.cry();}
}


