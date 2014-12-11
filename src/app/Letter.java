/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 *
 * @author alex
 */
public enum Letter {
    X(-1),O(1);
    
    private int value;
    
    Letter(int value){
        this.value = value;
    }
    public int value(){
        return this.value;
    }
}
