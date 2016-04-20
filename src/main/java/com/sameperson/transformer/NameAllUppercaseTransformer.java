package com.sameperson.transformer;

import com.sameperson.generator.NameGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("all-letters-uppercase")
public class NameAllUppercaseTransformer implements Transformer {

    @Autowired
    private NameGenerator nameGenerator;

    public String transform() {
        return nameGenerator.generateName().toUpperCase();
    }

}