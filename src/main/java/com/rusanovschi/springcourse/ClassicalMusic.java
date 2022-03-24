/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rusanovschi.springcourse;

/**
 *
 * @author IT-0
 */
public class ClassicalMusic implements Music {

    private ClassicalMusic() {

    }
    
    //factory-method
    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    @Override
    public String getSong() {
        return "Hundarian raphsody";
    }
}
