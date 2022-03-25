/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rusanovschi.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author IT-0
 */
@Component
public class Computer {
    
    private int id;
    private MusicPlayer musicPlayer;
    
    @Autowired
    public Computer(MusicPlayer musicPlayer){
        this.id = 1;
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        return "Computer with id = " + id + ", " + musicPlayer; 
    } 
}
