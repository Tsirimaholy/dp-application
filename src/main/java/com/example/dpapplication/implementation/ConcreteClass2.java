package com.example.dpapplication.implementation;

import com.example.dpapplication.AbstractClass1;
import com.example.dpapplication.ConcreteDependance1;
import com.example.dpapplication.ConcreteDependance2;
import org.springframework.stereotype.Component;

@Component
public class ConcreteClass2 extends AbstractClass1 {
     public ConcreteClass2(ConcreteDependance1 concreteDependance1, ConcreteDependance2 concreteDependance2){
        super(concreteDependance1, concreteDependance2);
    }
}
