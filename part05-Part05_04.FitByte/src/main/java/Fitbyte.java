/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sercan
 */
public class Fitbyte {
    private int age;
    private int hearthRate;
    public Fitbyte(int age, int hearthRate){
        this.age = age;
        this.hearthRate = hearthRate;
    }
    public double targetHeartRate(double percentageOfMaximum){
        double maxRate =206.3 - (0.711 * age);
        double targetRate = (maxRate - hearthRate) * percentageOfMaximum + hearthRate;
        return targetRate;
    }
    
}
