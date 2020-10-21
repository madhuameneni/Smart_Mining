# Smart_Mining
•	Underground mine with intense geo-technique  activity and workers who put their lives at risk to extract ores.
Control System Pseudocode:
•	Temperature is more then 40 / if the oxygen is less then 22/toxic gases is more then 2 then on the ventilators( MotorManager()) .
•	Gyroscope is more then 5 / if the oxygen is less then 19/toxic gases is more then 5 then ON the Alarms( AlarmManager()) .
•	When the motion sensor detects any motions in the mining compartments then the light will be turned ON for certain duration(lightManager()).

I contains below projects :
PrintInfoServer -----> ME Server ---> receives message from the SE server.
SE_Smart_server ----> SE Server ----> receives sensor values when it reaches threshold from the ME client.
Smart_mine_ME -----> ME Client -----> captures the sensor data and sends to SE client.

