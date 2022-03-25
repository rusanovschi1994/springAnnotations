/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rusanovschi.springcourse;

import org.springframework.stereotype.Component;

/**
 *
 * @author IT-0
 */
@Component
public class RockMusic implements Music {

    
    @Override
    public String getSong() {
        return "We will rock you";
    }
}
