package GameV2;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;

@Autonomous
public class AutonBlue1V2 extends LinearOpMode {
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
              l1.setPower(0.35);
              r1.setPower(0.4);
              sleep(2500);
              //stop
              l1.setPower(0);
              r1.setPower(0);
              sleep(500);
              //back
              r1.setPower(-0.3);
              l1.setPower(-0.3);
              sleep(500);
              //stop
              l1.setPower(0);
              r1.setPower(0);
              sleep(500);
              //turn
              l1.setPower(-0.5);
              r1.setPower(0.5);
              sleep(1200);
              //stop and servo down
              l1.setPower(0);
              r1.setPower(0);
              s1.setPosition(0.8);
              sleep(1000);
              //stop and servo up
              l1.setPower(0);
              r1.setPower(0);
              s1.setPosition(0.0);
              sleep(1000);
              //turn to face crater
              l1.setPower(-0.5);
              r1.setPower(0.5);
              sleep(1300);
              //stop
              l1.setPower(0);
              r1.setPower(0);
              sleep(500);
              //forward
              l1.setPower(0.515);
              r1.setPower(0.52);
              sleep(3000);
              //stop
              l1.setPower(0);
              r1.setPower(0);
              sleep(500);
              //backup
              l1.setPower(-0.3);
              r1.setPower(-0.3);
              sleep(800);
              //forward
              l1.setPower(1.0);
              r1.setPower(1.0);
              sleep(1200);

        }

}