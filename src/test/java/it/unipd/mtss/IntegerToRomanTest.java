////////////////////////////////////////////////////////////////////
// Marco Borella 1204685
// Riccardo Lotto 1204687
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IntegerToRomanTest {

    @Test
    public void testInit(){
        IntegerToRoman test = new IntegerToRoman();
        assertEquals(null, test.convert(0));
    }

}