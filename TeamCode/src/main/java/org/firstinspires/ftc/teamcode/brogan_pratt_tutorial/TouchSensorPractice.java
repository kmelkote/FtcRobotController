package org.firstinspires.ftc.teamcode.brogan_pratt_tutorial;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.mechanisms.MiniBot;
@TeleOp
public class TouchSensorPractice extends OpMode {
    MiniBot bot = new MiniBot();

    @Override
    public void init() {
        bot.init(hardwareMap);
    }

    @Override
    public void loop() {
        //telemetry.addData("Is Touch Sensor Released", bot.isTouchSensorReleased());

        if (bot.isTouchSensorPressed()) {
            telemetry.addData("Touch Sensor State", "Pressed");
        } else {
            telemetry.addData("Touch Sensor State", "Not Pressed");
        }
    }
}
/*
1. Create a new "getter" method in minibot class called "isTouchSensorReleased" and this returns true if touch sensor is not being pressed.
2. In your telemetry opmode, have telemetry state "pressed" and "not pressed" instead of true or false.

 */