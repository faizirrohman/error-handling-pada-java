/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exception_wfh;

/**
 *
 * @author HP
 */
public class ex3 {
    public static void main(String[] args){
        try{
            int a = args.length;
            System.out.println("Nilai a = " + a);
            int b = 40/a;
            int c = {1};
            c[10] = 88;
        } catch (ArithmeticException e){
            System.out.println("Pembagian dengan nol!");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index array OOB : " + e);
        } catch (Throwable t){
            System.out.println("got t " + t);
        }
    }
}
