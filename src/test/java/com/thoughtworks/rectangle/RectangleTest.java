package com.thoughtworks.rectangle;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class RectangleTest {
    private Rectangle rectangle1;

    @BeforeEach
    public  void setup() {
        rectangle1 = new Rectangle(5, 4); 
    }

    @Test
    public void shouldReturnAreaOfTwentyWhenLengthIsFiveAndBreadthIsFour() {
        assertEquals( 20, rectangle1.area(),"Area should be calculated correctly");
    }

   
}
