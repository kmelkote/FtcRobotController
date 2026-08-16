package org.firstinspires.ftc.teamcode.brogan_pratt_tutorial;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
@Disabled
@TeleOp
public class IfPractice extends OpMode {
    @Override
    public void init() {


    @Override
    public void loop() {

        double motorSpeed = -gamepad1.left_stick_y;

        if (!gamepad1.a){
            motorSpeed *= 0.5;
        }
        telemetry.addData("Left stick value", motorSpeed);

        /*
        if (gamepad1.aWasPressed()){
            telemetry.addData("Left stick value", motorSpeed);
        }
        else {
            telemetry.addData("Left stick value", motorSpeed*0.5);
        }
        */
        /*
        double leftY = - gamepad1.left_stick_y;
        if (leftY < 0.1 && leftY > -0.1){
            telemetry.addData("Left stick", "in Dead Zone");
        }

        */
        /*
        if (leftY < 0) {
            telemetry.addData("Left stick", "is Negative");
        }
        else if (leftY > 0.5) {
            telemetry.addData(("Left stick"), "greater than 50%");
        }
        else if (leftY > 0) {
            telemetry.addData("Left stick", "is Positive");
        }
        else {
            telemetry.addData("Left stick", "is Zero!");
        }
        */
        //telemetry.addData("Left stick value", leftY);

    /*
       boolean aButton = gamepad1.a; //press TRUE, else FALSE

       if (aButton){
            telemetry.addData("A Button", "Pressed");

        }
        else {
            telemetry.addData("A Button", "NOT Pressed");
        }

        telemetry.addData("A Button State", aButton);
    */

    }
}

/*

AND  - && - if (leftY < 0.5 && leftY > 0) {
OR - || - if (leftY < 0 || leftY < -0.5) {
NOT - ! - if (

1. Make a turbo button. If the a button is NOT pressed, multiply the motor speed by 0.5, otherwise use the standard speed.
 */
