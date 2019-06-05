/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ld_si
 */
public class Provider {
    private String name;
    private String cnpj;
    private String adress;

    public Provider(String name, String cnpj, String adress) {
        this.name = name;
        this.cnpj = cnpj;
        this.adress = adress;
    }
    
    public Provider() {
        this.name = "";
        this.cnpj = "";
        this.adress = "";
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
    
    
}
