/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdapractice;

/**
 *
 * @author Vihan De Silva
 */
public class Math implements iAdd {

    @Override
    public int add(int a, int b) {
        int sum = a+b;
        return sum;
    }
    
}
