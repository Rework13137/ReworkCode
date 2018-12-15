package GameV3;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;

@TeleOp
public class TeleOpV3 extends LinearOpMode {
    private ElapsedTime runtime = new ElapsedTime();
    DcMotor ld;
    DcMotor rd;
    Servo tm;
    DcMotor hk;
    DcMotor cs;
    DcMotor ds;
    Servo bs;
    DcMotor vm;

    @Override
    public void runOpMode() throws InterruptedException{
        telemetry.addData("Status","Initialized");
        telemetry.update();
        tm = hardwareMap.servo.get("tmarker");
        ld = hardwareMap.dcMotor.get("ld");
        rd = hardwareMap.dcMotor.get("rd");
        hk = hardwareMap.dcMotor.get("hk");
        cs = hardwareMap.dcMotor.get("cs");
        bs = hardwareMap.servo.get("bs");
        ds = hardwareMap.dcMotor.get("ds");
        vm = hardwareMap.dcMotor.get("vm");
        ld.setDirection(DcMotorSimple.Direction.REVERSE);
        waitForStart();
        runtime.reset();

        while(opModeIsActive()) {
            telemetry.addData("Status", "Run Time:" + runtime.toString());


            ld.setPower(-gamepad1.left_stick_y);
            rd.setPower(-gamepad1.right_stick_y);

            if (gamepad2.a){
                hk.setPower(0.55);
            }else if (gamepad2.b){
                hk.setPower(-0.55);
            }else{
                hk.setPower(0.0);
            }

            if (gamepad1.y){
                cs.setPower(0.5);
            } else if (gamepad1.x){
                cs.setPower(-0.35);
            } else {
                cs.setPower(0.0);
            }
            if (gamepad2.x) {
                bs.setPosition(1.0);
            }else if (gamepad2.y){
                bs.setPosition(0.0);
            }

            if (gamepad2.right_bumper) {
                ds.setPower(0.6);
            } else if (gamepad2.left_bumper) {
                ds.setPower(-0.6);
            } else {
                ds.setPower(0.0);
            }

            if (gamepad1.right_bumper) {
                vm.setPower(0.8);
            } else if (gamepad1.left_bumper) {
                vm.setPower(-0.8);
            } else {
                vm.setPower(0.0);
            }











        }
            }

                }
