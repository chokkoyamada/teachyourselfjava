package com.kirishikistudios.Exam5;

import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

import static org.junit.Assert.assertThat;

/**
 * User: yamadanaoyuki
 * Date: 2013/04/21
 * Time: 22:40
 */
public class Sphere3Test {
    @Test
    public void testInit1(){
        Sphere3 sphere3 = new Sphere3();
        assertThat(sphere3.radius, is(1d));
        sphere3.x = 0;
        sphere3.y = 0;
        sphere3.z = 0;
    }
}
