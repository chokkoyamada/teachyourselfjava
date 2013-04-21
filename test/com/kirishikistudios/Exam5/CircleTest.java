package com.kirishikistudios.Exam5;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * User: yamadanaoyuki
 * Date: 2013/04/21
 * Time: 21:02
 */
public class CircleTest {
    @Test
    public void testInit(){
        Circle circle = new Circle(5);
        assertThat(circle, is(instanceOf(Circle.class)));
        assertThat(circle.point_x, is(0d));
        assertThat(circle.point_x, is(0d));
    }
    @Test
    public void testInit2(){
        Circle circle = new Circle(1, 2, 5);
        assertThat(circle.radius, is(5d));
        assertThat(circle.point_x, is(1d));
        assertThat(circle.point_y, is(2d));
    }
}
