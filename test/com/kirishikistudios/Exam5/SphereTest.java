package com.kirishikistudios.Exam5;

import org.junit.*;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * User: yamadanaoyuki
 * Date: 2013/04/21
 * Time: 21:35
 */
public class SphereTest {
    @Test
    public void testInit(){
        Sphere sphere = new Sphere();
        assertThat(sphere, is(instanceOf(Sphere.class)));
    }
}
