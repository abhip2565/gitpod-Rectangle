package com.thoughtworks.rectangle;

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
        assertThat(rectangle1.area(), is(equalTo(20)) );
    }

   
}
