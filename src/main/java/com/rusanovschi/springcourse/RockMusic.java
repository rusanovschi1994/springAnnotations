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
public class RockMusic implements Music {

    @Override
    public void getSong() {
        System.out.println("Will will rock you");
    }
}
