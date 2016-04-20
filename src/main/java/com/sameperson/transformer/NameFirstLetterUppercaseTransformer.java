package com.sameperson.transformer;

import com.sameperson.generator.NameGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("first-letter")
public class NameFirstLetterUppercaseTransformer implements Transformer {

    @Autowired
    private NameGenerator nameGenerator;

        public String transform() {
        String name = nameGenerator.generateName();
        return name.substring(0, 1).toUpperCase() + name.substring(1);
    }

}
