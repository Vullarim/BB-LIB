package org.firstinspires.ftc.teamcode.Controllers.Feedback;

/** Feedback controller with proportional position, velocity, and acceleration terms. */
public class PVA {
    // Gains
    double _kp; // Gain for the position term
    double _kv; // Gain for the velocity term
    double _ka; // Gain for the acceleration term

    /** Constructs a {@link PVA}.
     * @param kp Gain for the position term.
     * @param kv Gain for the velocity term.
     * @param ka Gain for the acceleration term.
     * */
    public PVA(double kp, double kv, double ka) {
        _kp = kp;
        _kv = kv;
        _ka = ka;
    }

    /** Runs the {@link PVA} calculation on the arguments and returns the result.
     * @param pos Current motor position.
     * @param refPos Desired motor position.
     * @param vel Current motor velocity.
     * @param refVel Desired motor velocity.
     * @param accel Current motor acceleration.
     * @param refAccel Desired motor acceleration.
     * @return Motor power.
     * */
    public double Calc(double pos, double refPos, double vel, double refVel, double accel, double refAccel) {
        double posError = refPos - pos;
        double velError = refVel - vel;
        double accelError = refAccel - accel;
        return (_kp * posError) + (_kv * velError) + (_ka * accelError); // Applies gains and adds the terms together
    }
}
