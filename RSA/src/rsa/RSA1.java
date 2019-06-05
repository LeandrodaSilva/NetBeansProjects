/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rsa;

import java.math.BigInteger;
import java.security.SecureRandom;

/**
 *
 * @author ld_si
 */
public class RSA1 {

    /**
     * @param args the command line arguments
     */
    
    private BigInteger p;
    private BigInteger q;
    private BigInteger n;
    private BigInteger publicKey;
    private BigInteger privateKey;
    private BigInteger m;
    private final int size;
    
    RSA1(int value){
        this.size = value;
        stepOne();
        stepTwo();
        stepThree();
        stepFour();
        stepFive();
    }   
    
    
    private void stepOne(){  
        SecureRandom r = new SecureRandom();
        this.p = new BigInteger(this.size / 2, 100, r);
        this.q = new BigInteger(this.size / 2, 100, r);
        while(this.q.equals(this.p)) {
            this.q = new BigInteger(this.size / 2, 100, r);
            System.out.println("new q: "+this.q.toString());
        }
        System.out.println("p: "+p);
        System.out.println("q: "+q);
    }
    
    private void stepTwo(){
       this.n = this.p.multiply(this.q);
    }
    
    private void stepThree(){
        this.m = (p.subtract(BigInteger.ONE)).multiply(q.subtract(BigInteger.ONE));
    }
    
    private void stepFour(){
        publicKey = new BigInteger("3");
        while(m.gcd(publicKey).intValue() > 1){
            publicKey = publicKey.add(new BigInteger("2"));
        }
        System.out.println("publick: "+ publicKey);
    }
    
    private void stepFive(){
        privateKey = publicKey.modInverse(m);
    }
    
    public BigInteger getPrivateKey(){
        return this.privateKey;
    }
    
    public BigInteger getPublicKey(){
        return this.publicKey;
    }
    
    public String encrypt(String msg, BigInteger key){
        return new BigInteger(msg.getBytes()).modPow(key, n).toString();
    }
    
    public String decrypt(String msg, BigInteger key){
        return  new String(new BigInteger(msg).modPow(key, n).toByteArray());
    }
}
