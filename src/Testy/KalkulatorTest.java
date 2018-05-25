package Testy;

import Onp.Kalkulator;
import Onp.Zamiana;
import org.junit.Test;


import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class KalkulatorTest {

    @Test
    public void testAddition(){
        String equation = "2+3+23+3=";

        String onp = Zamiana.ZamianaONP(equation);
        assertEquals(onp,"2 3 + 23 + 3 + ");
        assertTrue("Addition test",31.0==Kalkulator.KalkulatorONP(onp));
    }

    @Test
    public void testDiff(){
        String equation = "43-2-3=";

        String onp = Zamiana.ZamianaONP(equation);
        assertEquals(onp,"43 2 - 3 - ");
        Kalkulator.KalkulatorONP(onp);
        assertTrue("Diff test",38.0==Kalkulator.KalkulatorONP(onp));
    }

    @Test
    public void testMultiply(){
        String equation = "6*3*2=";

        String onp = Zamiana.ZamianaONP(equation);
        assertEquals(onp,"6 3 * 2 * ");
        Kalkulator.KalkulatorONP(onp);
        assertTrue("Multiply test",36.0==Kalkulator.KalkulatorONP(onp));
    }

    @Test
    public void testDivide(){
        String equation = "12/4/3=";

        String onp = Zamiana.ZamianaONP(equation);
        assertEquals(onp,"12 4 / 3 / ");
        Kalkulator.KalkulatorONP(onp);
        assertTrue("Divide test",1.0==Kalkulator.KalkulatorONP(onp));
    }

    @Test
    public void testPow(){
        String equation = "10^2^2=";

        String onp = Zamiana.ZamianaONP(equation);
        assertEquals(onp,"10 2 ^ 2 ^ ");
        Kalkulator.KalkulatorONP(onp);
        assertTrue("Power test",10000.0==Kalkulator.KalkulatorONP(onp));
    }

    @Test
    public void testBrack(){
        String equation = "2*3*(2+1)*(9+11)=";

        String onp = Zamiana.ZamianaONP(equation);
        assertEquals(onp,"2 3 *  2 1 +   9 11 +  *  * ");
        Kalkulator.KalkulatorONP(onp);
        assertTrue("Brack test",360.0==Kalkulator.KalkulatorONP(onp));
    }
    @Test
    public void variousEx(){
        String equation = "2*(2+3)=";

        String onp = Zamiana.ZamianaONP(equation);
        assertEquals(onp,"2  2 3 +  * ");
        Kalkulator.KalkulatorONP(onp);
        assertTrue("variousEx test",10.0==Kalkulator.KalkulatorONP(onp));
    }

    @Test
    public void variousEx2(){
        String equation = "(2+8)*(6/3)^2=";

        String onp = Zamiana.ZamianaONP(equation);
        assertEquals(onp," 2 8 +   6 3 /  2 ^  * ");
        Kalkulator.KalkulatorONP(onp);
        assertTrue("variousEx2 test",40.0==Kalkulator.KalkulatorONP(onp));
    }

    @Test
    public void variousEx3(){
        String equation = "4*(3+2)/5=";

        String onp = Zamiana.ZamianaONP(equation);
        assertEquals(onp,"4  3 2 +  5 /  * ");
        Kalkulator.KalkulatorONP(onp);
        assertTrue("variousEx3 test",4.0==Kalkulator.KalkulatorONP(onp));
    }
}
