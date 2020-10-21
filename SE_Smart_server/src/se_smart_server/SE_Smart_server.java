/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se_smart_server;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Madhu
 */
public class SE_Smart_server {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        String clientSentence;
        boolean ventilator = false, alarm = false, light = false;
        Socket clientSocket = new Socket("127.0.0.1", 1313);
        System.out.println("Server is open123");
        PrintWriter outToServer = new PrintWriter(clientSocket.getOutputStream(), true);
        ServerSocket welcomeSocket = new ServerSocket(7000);
        System.out.println("Server is open");

        while (true) {
            Socket connectionSocket = welcomeSocket.accept();
            Scanner inFromClient = new Scanner(connectionSocket.getInputStream());
            System.out.println("Server is ope564n");
            System.out.println("Server is ope564n" + inFromClient.toString());
            while (inFromClient.hasNext()) {
                clientSentence = inFromClient.nextLine();
                System.out.println("madhu...." + clientSentence);
                Sensor_Threshold st = new Sensor_Threshold();
                Sensor_data sd = st.get_Sensor_threshold(clientSentence);

                if (alarm) {
                    outToServer.println("Move out Emergency.......... pom pom..");
                }
                if ((sd.getTemperature() > 40 || sd.getO2() < 22 || sd.getToxic() > 2)) {
                    alarm = false;
                    System.out.println("on the Ventilators..... " + " temperature : " + sd.getTemperature() + " O2 : " + sd.getO2() + " toxic : " + sd.getToxic());
                    outToServer.println("on the Ventilators..... " + " temperature : " + sd.getTemperature() + " O2 : " + sd.getO2() + " toxic :" + sd.getToxic());
                }
                if ((sd.getGyroscope() > 5 || sd.getO2() < 19 || sd.getToxic() > 5 || sd.getGyroscope() < -5.0)) {
                    alarm = true;
                    System.out.println("Move out Emergency.......... pom pom.. " + " Gyro : " + sd.getGyroscope() + " O2 : " + sd.getO2() + " Toxic : " + sd.getToxic());
                    outToServer.println("Move out Emergency.......... pom pom.. " + " Gyro : " + sd.getGyroscope() + " O2 : " + sd.getO2() + " Toxic : " + sd.getToxic());
                } else {
                    System.out.println("good..............");
                    outToServer.println("All good workers.....");
                }
                if (sd.getMotion() == 1.0) {
                    System.out.println("on the lights.............");
                    outToServer.println("ON the lights workers are working");
                }
            }
        }
    }

}
