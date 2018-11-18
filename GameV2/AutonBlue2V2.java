package GameV2;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;

@Autonomous
public class AutonBlue2V2 extends LinearOpMode {
    private ElapsedTime runtime = new ElapsedTime();
    DcMotor l1;
    DcMotor r1;
    DcMotor a1;
    DcMotor a2;
    Servo s1;

    @Override
    public void runOpMode() throws InterruptedException {
        telemetry.addData("Status", "Initialized");
        telemetry.update();
        s1 = hardwareMap.servo.get("s1");
        l1 = hardwareMap.dcMotor.get("l1");
        r1 = hardwareMap.dcMotor.get("r1");
        a1 = hardwareMap.dcMotor.get("a1");
        a2 = hardwareMap.dcMotor.get("a2");
        l1.setDirection(DcMotorSimple.Direction.REVERSE);

        waitForStart();
        runtime.reset();
        telemetry.addData("Status", "Run Time:" + runtime.toString());
        telemetry.update();
        //forward
            r1.setPower(0.4);
            l1.setPower(0.4);
            sleep(1450);
            //stop
            l1.setPower(0);
            r1.setPower(0);
            sleep(500);
            //backward
            r1.setPower(-0.3);
            l1.setPower(-0.3);
            sleep(850);
            //stop
            l1.setPower(0);
            r1.setPower(0);
            sleep(500);
            //turn
            r1.setPower(0.5);
            l1.setPower(-0.5);
            sleep(700);
            //stop
            l1.setPower(0);
            r1.setPower(0);
            sleep(500);
            //forward
            r1.setPower(0.4);
            l1.setPower(0.4);
            sleep(1400);
            //stop
            l1.setPower(0);
            r1.setPower(0);
            sleep(500);
            //turn
            r1.setPower(0.5);
            l1.setPower(-0.5);
            sleep(865);
            //stop
            l1.setPower(0);
            r1.setPower(0);
            sleep(500);
            //forward
            r1.setPower(0.411);
            l1.setPower(0.41);
            sleep(2300);
            //stop
            l1.setPower(0);
            r1.setPower(0);
            sleep(500);
            //turn
            r1.setPower(0.5);
            l1.setPower(-0.5);
            sleep(1000);
            //stop and servo
            r1.setPower(0.0);
            l1.setPower(0.0);
            s1.setPosition(0.9);
            sleep(1000);
            //stop and servo
            r1.setPower(0.0);
            l1.setPower(0.0);
            s1.setPosition(0.0);
            sleep(1000);
            //turn
            r1.setPower(0.5);
            l1.setPower(-0.5);
            sleep(1000);
            //stop
            l1.setPower(0);
            r1.setPower(0);
            //forward
            r1.setPower(0.4);
            l1.setPower(0.41);
            sleep(3200);
            //drop arm
            r1.setPower(0.0);
            l1.setPower(0.0);
            a1.setPower(0.6);
            sleep(1000);



    }

}
