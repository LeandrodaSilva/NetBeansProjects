/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rsa;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Scanner;

/**
 *
 * @author ld_si
 */
public class RSA {

    /**
     * @param args the command line arguments
     */
    
    private int p;
    private int q;
    private int n;
    private int publicKey;
    private int privateKey;
    private int m;
    private final int size;
    
    RSA(int value){
        this.size = value;
        
        
        keyGenerator();
    }   
    
    public void keyGenerator(){
        int p, q, n, m, privateK, publicK;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o primeiro número primo: ");
        p = sc.nextInt();
        System.out.println("Informe o segundo número primo: ");
        q = sc.nextInt();
        
        n = p * q;
        
        
        m = ((p - 1)*(q - 1));
        
        publicKey = mdc(q,p);
        
        privateKey = modInverse(publicKey, m);
        
        
        
    }
   
    static int modInverse(int a, int m) 
    { 
        a = a % m; 
        for (int x = 1; x < m; x++) 
           if ((a * x) % m == 1) 
              return x; 
        return 1; 
    } 
    
    public int mdc(int dividendo, int divisor){
        if (dividendo % divisor == 0) {
            return divisor;
        }else{
            return mdc(divisor, (dividendo % divisor));
        }
    }
    
    
    
    
    
    
    public int getPrivateKey(){
        return this.privateKey;
    }
    
    public int getPublicKey(){
        return this.publicKey;
    }
    
//    public String encrypt(String msg, int key){
//        String r;
//       
//    }
//    
//    public String decrypt(String msg, int key){
//        return  
//    }
}
