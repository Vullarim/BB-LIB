package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotorEx;

public class Motor {
    //config
    DcMotorEx hardwareMap;

    //properties
    double pos;
    double vel;
    boolean atTarget;

    //property geters
    public double getPos() {
        return pos;
    }
    public double getVel() {
        return vel;
    }
    public boolean isAtTarget() {
        return  atTarget;
    }


    //functions
}
