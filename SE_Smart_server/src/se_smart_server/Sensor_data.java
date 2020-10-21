/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se_smart_server;

/**
 *
 * @author Madhu
 */
public class Sensor_data {

    public double getTemperature() {
        return temperature;
    }

    public double getO2() {
        return o2;
    }

    public double getMotion() {
        return motion;
    }

    public double getToxic() {
        return toxic;
    }

    public double getGyroscope() {
        return gyroscope;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void setO2(double o2) {
        this.o2 = o2;
    }

    public void setMotion(double motion) {
        this.motion = motion;
    }

    public void setToxic(double toxic) {
        this.toxic = toxic;
    }

    public void setGyroscope(double gyroscope) {
        this.gyroscope = gyroscope;
    }
    double temperature, o2, motion, toxic, gyroscope;
}
