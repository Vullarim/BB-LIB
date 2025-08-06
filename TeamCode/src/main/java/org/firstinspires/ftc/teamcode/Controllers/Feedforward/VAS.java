package org.firstinspires.ftc.teamcode.Controllers.Feedforward;

//velocity acceleration feedforward controller with ks to account for static friction
public class VAS {
    //Gain vars
    double _kv;
    double _ka;
    double _ks;

    //Constructor
    public VAS(double kv, double ka, double ks) {
        _kv = kv;
        _ka = ka;
        _ks = ks;
    }

    //runs feedforward calc
    public double Calc(double referenceVelocity, double referenceAcceleration) {
        return (referenceVelocity * _kv) + (referenceAcceleration * _ka);
    }
}
