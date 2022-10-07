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
public class IntOK implements Serializable{
    static final long serialVersionUID = 3L;
    
    private int value;

    public IntOK() {
    }

    public IntOK(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "IntOK{" + "value=" + value + '}';
    }
    
    
}
