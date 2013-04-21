package com.kirishikistudios.Exam5;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

/**
 * User: yamadanaoyuki
 * Date: 2013/04/21
 * Time: 21:11
 */
public class PersonTest {
    @Test
    public void testPerson(){
        Person person = new Person();
        assertThat(person, is(Person.class) );
    }
}
