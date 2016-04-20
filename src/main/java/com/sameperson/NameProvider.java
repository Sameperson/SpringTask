package com.sameperson;

import com.sameperson.transformer.Transformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class NameProvider {

    @Autowired
    @Qualifier("first-letter-uppercase")
    private Transformer transformerFirstLetterUppercase;
    @Autowired
    @Qualifier("all-letters-uppercase")
    private Transformer transformerAllUppercase;

    public String getFirstLetterUppercase() {
        return transformerFirstLetterUppercase.transform();
    }

    public String getAllUppercase() {
        return transformerAllUppercase.transform();
    }
}
