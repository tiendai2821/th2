/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author 503
 */
public class StringOK implements Serializable{
    static final long serialVersionUID = 2L;
    
    private String value;

    public StringOK() {
    }

    public StringOK(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "StringOK{" + "value=" + value + '}';
    }
    
    
}
