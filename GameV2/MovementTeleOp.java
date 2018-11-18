package Game;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;

@TeleOp
public class MovementTeleOp extends LinearOpMode {
    private ElapsedTime runtime = new ElapsedTime();
    DcMotor l1;
    DcMotor r1;
    DcMotor a1;
    DcMotor a2;
    Servo s1;

    @Override
    public void runOpMode() throws InterruptedException{
        telemetry.addData("Status","Initialized");
        telemetry.update();
        s1 = hardwareMap.servo.get("s1");
        l1 = hardwareMap.dcMotor.get("l1");
        r1 = hardwareMap.dcMotor.get("r1");
        a1 = hardwareMap.dcMotor.get("a1");
        a2 = hardwareMap.dcMotor.get("a2");
        l1.setDirection(DcMotorSimple.Direction.REVERSE);
        waitForStart();
        runtime.reset();

        while(opModeIsActive()) {
            telemetry.addData("Status", "Run Time:" + runtime.toString());
            l1.setPower(-gamepad1.left_stick_y);
            r1.setPower(-gamepad1.right_stick_y);

            a2.setPower(-gamepad2.right_stick_y);


            if(gamepad2.a){
                a1.setPower(0.6);
            }else if(gamepad2.b){
                a1.setPower(-0.8);
            }else{
                a1.setPower(0.0);
            }


            if (gamepad1.a) {
                l1.setPower(1.0);
                r1.setPower(1.0);
            } else if (gamepad1.b) {
                l1.setPower(-1.0);
                r1.setPower(-1.0);
            } else {
                l1.setPower(0.0);
                r1.setPower(0.0);
            }


            }
            }

                }





