package com.thoughtworks.rectangle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class RectangleTest {
    

    

    @Test
    public void shouldReturnAreaOfTwentyWhenLengthIsFiveAndBreadthIsFour() {
        Rectangle rect = new Rectangle(5.0, 4.0);
        double area=rect.area();
        assertThat(area, is(closeTo(20.0, 0.001)));
    }
    
    @Test
    public void shouldReturnPerimeterWhenLengthAndBreadthGiven(){
        Rectangle rect = new Rectangle(2.5, 5.5);
        double per = rect.perimeter();
        assertThat(per, is(closeTo(16.00, 0.2)));
    }
   
}
