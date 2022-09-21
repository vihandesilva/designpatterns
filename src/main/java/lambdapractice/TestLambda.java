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
public class TestLambda {
    
    public static void main(String[] args) {
        //Lambda function
        iAdd m = (int a, int b) -> {int sum = a+b; System.out.println("LAMBDA Sum: " + sum); return sum;};     
        m.add(0, 0);
        
        //Overriding method in Anonymous inner class
        Add math = new Add(){
            public int add(int a, int b){
                int sum = a+b;
                System.out.println("ANON INNER CLASS Sum: " + sum);
                return sum;               
            }
        };
        
        math.add(0, 0);
        
    }
}
