////////////////////////////////////////////////////////////////////
// Marco Borella 1204685
// Riccardo Lotto 1204687
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import org.junit.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class RomanPrinterTest {

    @Test
    public void testInit(){

        RomanPrinter test = new RomanPrinter();

        try (MockedStatic<IntegerToRoman> integerToRomanMockedStatic = Mockito.mockStatic(IntegerToRoman.class)){
            integerToRomanMockedStatic.when(()->IntegerToRoman.convert(1)).thenReturn("I");

            assertEquals(null, test.print(1));
        }

    }

}