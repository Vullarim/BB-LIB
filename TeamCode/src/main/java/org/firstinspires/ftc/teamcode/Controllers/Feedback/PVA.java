package org.firstinspires.ftc.teamcode.Controllers.Feedback;

public class PVA {
    //Gain Vars
    double _kp;
    double _kv;
    double _ka;

    //Constructor
    public PVA(double kp, double kv, double ka) {
        _kp = kp;
        _kv = kv;
        _ka = ka;
    }
    //runs feedback calc
    public double Calc(double motorPosition, double referencePosition, double motorVelocity, double referenceVelocity, double motorAcceleration, double referenceAcceleration) {
        double positionError = referencePosition - motorPosition;
        double velocityError = referenceVelocity - motorVelocity;
        double accelerationError = referenceAcceleration -motorAcceleration;
        return (positionError * _kp) + (velocityError * _kv) + (accelerationError * _ka);
    }

}
