package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.robotcore.hardware.DigitalChannel;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class MiniBot {
    private DigitalChannel touchSensor; //touch sensor on minibot

    public void init(HardwareMap hwMap){
        touchSensor = hwMap.get(DigitalChannel.class, "touch_sensor");
        touchSensor.setMode(DigitalChannel.Mode.INPUT);
    }

    public boolean isTouchSensorReleased() {
        return touchSensor.getState();
    }

    public boolean isTouchSensorPressed(){
        return !touchSensor.getState();
    }
}
