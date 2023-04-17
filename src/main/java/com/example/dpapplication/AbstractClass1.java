package com.example.dpapplication;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public abstract class AbstractClass1 {
    protected ConcreteDependance1 concreteDependance1;
    protected ConcreteDependance2 concreteDependance2;
}
