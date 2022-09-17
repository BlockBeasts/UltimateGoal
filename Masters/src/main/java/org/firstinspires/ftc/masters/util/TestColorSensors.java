package org.firstinspires.ftc.masters.util;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.ColorSensor;

import org.firstinspires.ftc.masters.RobotClass;
import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;

//@Disabled
@TeleOp(name = "Test color sensors", group ="test")
public class TestColorSensors extends LinearOpMode {

    RobotClass robot;

    @Override
    public void runOpMode() throws InterruptedException {

        robot = new RobotClass(hardwareMap, telemetry, this);

        waitForStart();

        while (opModeIsActive()) {

            telemetry.addData("Left Light Level: ", robot.colorSensorLeft.alpha());
            telemetry.addData("Left Red", robot.colorSensorLeft.red());
            telemetry.addData("Left Blue", robot.colorSensorLeft.blue());
            telemetry.addData("Left Green", robot.colorSensorLeft.green());
            telemetry.addData("Left RGB", robot.colorSensorLeft.argb());
            telemetry.addData("distance left", robot.colorSensorLeft.getDistance(DistanceUnit.CM));

//            telemetry.addData("Middle Light Level: ", robot.colorSensorMiddle.alpha());
//            telemetry.addData("Middle Red", robot.colorSensorMiddle.red());
//            telemetry.addData("Middle Blue", robot.colorSensorMiddle.blue());
//            telemetry.addData("Middle Green", robot.colorSensorMiddle.green());
//            telemetry.addData("Middle RGB", robot.colorSensorMiddle.argb());
//
            telemetry.addData("Right Light Level: ", robot.colorSensorRight.alpha());
            telemetry.addData("Right Red", robot.colorSensorRight.red());
            telemetry.addData("Right Blue", robot.colorSensorRight.blue());
            telemetry.addData("Right Green", robot.colorSensorRight.green());
            telemetry.addData("Right RGB", robot.colorSensorRight.argb());
            telemetry.addData("distance right", robot.colorSensorRight.getDistance(DistanceUnit.CM));
//
            telemetry.update();
        }
    }
}