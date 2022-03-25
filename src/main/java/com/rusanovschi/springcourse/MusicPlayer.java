/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rusanovschi.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 *
 * @author IT-0
 */
@Component
public class MusicPlayer {

    private Music music;

    //IoC
    @Autowired

    public MusicPlayer(@Qualifier("classicalMusic") Music music) {
        this.music = music;
    }

    @Override
    public String toString() {
        return "playing: " + music.getSong();
    }
}
