/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author qzfan
 */
class FizzBuzz {

    static String of(int i) {
        String nStr="";
        if(i % 3 == 0) nStr+= "Fizz";
        if(i % 5 == 0) nStr+= "Buzz";
        if(nStr.isEmpty()) nStr+= i;
        return nStr;
    }
    
}
