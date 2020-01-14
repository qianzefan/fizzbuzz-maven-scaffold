/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


/**
 *
 * @author qzfan
 */
public class FBTest {
    
    public FBTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    
     @Test
     public void fiss_buzz_test() {
         assertEquals(FizzBuzz.of(1),"1");
         assertEquals(FizzBuzz.of(3),"Fizz");
         assertEquals(FizzBuzz.of(5),"Buzz");
         assertEquals(FizzBuzz.of(15),"FizzBuzz");
         
     }
}
