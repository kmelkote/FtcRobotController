package org.firstinspires.ftc.teamcode.brogan_pratt_tutorial;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
@Disabled
@TeleOp
public class VariablePractice extends OpMode {
    @Override
    public void init() {
        int teamNumber = 20405;
        double motorSpeed = 0.75;
        boolean armDown = true;
        String teamName = "RMS Dragons";
        int motorAngle = 90;

        telemetry.addData("Team Number", teamNumber);
        telemetry.addData("motor speed", motorSpeed);
        telemetry.addData("claw closed", armDown);
        telemetry.addData("name", teamName);
        telemetry.addData("motor angle", motorAngle);
    }

    @Override
    public void loop() {
        /*
        1. Change the string variable name to your team name.
        2. Create an int called "motorangle" and store and angle between 0-100 and then display in your init method
         */

    }
}
