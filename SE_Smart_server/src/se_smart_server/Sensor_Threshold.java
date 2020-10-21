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
public class Sensor_Threshold {

    public Sensor_data get_Sensor_threshold(String data) {
        double temperature = 32, toxicGas = 3, o2 = 20, motion = 0, gyroscope = 0;
        Sensor_data sd = new Sensor_data();
        if (data.contains("Temperature")) {
            System.out.println("Temperature123 :  " + data);
            data = data.substring(13);
            System.out.println("Temperature :  " + data);
            temperature = Double.parseDouble(data);
            sd.setTemperature(temperature);
            sd.setO2(o2);
            sd.setGyroscope(gyroscope);
            sd.setMotion(motion);
            sd.setToxic(toxicGas);
        } else if (data.contains("Oxygen")) {
            System.out.println("O2 testing123 : " + data);
            data = data.substring(8);
            System.out.println("O2 testing : " + data);
            o2 = Double.parseDouble(data);
            sd.setO2(o2);
            sd.setTemperature(temperature);
            sd.setGyroscope(gyroscope);
            sd.setMotion(motion);
            sd.setToxic(toxicGas);
        } else if (data.contains("Gas")) {
            System.out.println("Gas testing123 : " + data);
            data = data.substring(6);
            System.out.println("Gas testing : " + data);
            toxicGas = Double.parseDouble(data);
            sd.setToxic(toxicGas);
            sd.setTemperature(temperature);
            sd.setO2(o2);
            sd.setGyroscope(gyroscope);
            sd.setMotion(motion);
        } else if (data.contains("Gyroscope")) {
            System.out.println("Gyroscope123 : " + data);
            data = data.substring(12);
            System.out.println("Gyroscope : " + data);
            gyroscope = Double.parseDouble(data);
            sd.setGyroscope(gyroscope);
            sd.setTemperature(temperature);
            sd.setO2(o2);
            sd.setMotion(motion);
            sd.setToxic(toxicGas);
        } else if (data.contains("Motion")) {
            data = data.substring(9);
            motion = Double.parseDouble(data);
            sd.setMotion(motion);
            sd.setTemperature(temperature);
            sd.setO2(o2);
            sd.setGyroscope(gyroscope);
            sd.setToxic(toxicGas);
        }
        return sd;
    }
}
