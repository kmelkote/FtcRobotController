package org.firstinspires.ftc.teamcode.brogan_pratt_tutorial;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
//@Disabled
@TeleOp
public class GamePadPractice extends OpMode {

    @Override
    public void init() {

    }

    @Override
    public void loop() {
        // runs 50x+ a second
        double speedForward_left = - gamepad1.left_stick_y / 2.0;
        double speedForward_right = - gamepad1.right_stick_y/2.0;

        double diff_left_x_right_x = gamepad1.left_stick_x - gamepad1.right_stick_x;
        double sum_triggers = gamepad1.left_trigger + gamepad1.right_trigger;

        telemetry.addData("left_joystick_x", gamepad1.left_stick_x);
        telemetry.addData("left_joystick_y", speedForward_left);
        telemetry.addData("right_joystick_x", gamepad1.right_stick_x);
        telemetry.addData("right_joystick_y", speedForward_right);
        telemetry.addData("a button", gamepad1.a);
        telemetry.addData("b button", gamepad1.b);
        telemetry.addLine();
        telemetry.addData("diff_left_right_x", diff_left_x_right_x);
        telemetry.addData("sum of triggers", sum_triggers);

         /*
         Report bumper state
         */

       if (gamepad1.left_bumper){
           telemetry.addData("Left Bumper", "ON");
       } else {
           telemetry.addData("Left Bumper", "OFF");
       }

        if (gamepad1.right_bumper){
            telemetry.addData("Right Bumper", "ON");
        } else {
            telemetry.addData("Right Bumper", "OFF");
        }

    }
    /*
    1. Add telemetry to the right joystick
    2. Add telemetry to the B button
    3. Add telemetry data to report the difference between x left joystick and x right joystick.
    4. Add telemetry data to report the sum of both triggers.
    5. Add telemetry data to report the sum of both bumpers.

     */
}
