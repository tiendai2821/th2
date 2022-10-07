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
public class ObjectOK implements Serializable{
    static final long serialVersionUID = 1L;
    
    private Object value;

    public ObjectOK() {
    }

    public ObjectOK(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "ObjectOK{" + "value=" + value + '}';
    }

    
}
