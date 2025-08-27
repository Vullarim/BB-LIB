package org.firstinspires.ftc.teamcode.Controllers.Feedback;

import com.qualcomm.robotcore.util.ElapsedTime;
/** Feedback controller with position based proportional, integral and derivative terms. */
public class PID {
    // Gains
    double _kp; // Gain for proportional term
    double _ki; // Gain for integral term
    double _kd; // Gain for derivative term

    // Vars for calc
    ElapsedTime timer; // Timer used for calculating derivative and integral
    double integral; // Stores the current integral
    double lastError; // Stores the position error from the previous loop

    /** Constructs a {@link PID}.
     * @param kp Gain for the proportional term.
     * @param ki Gain for the integral term.
     * @param kd Gain for the derivative term.
     * */
    public PID(double kp, double ki, double kd) {
        _kp = kp;
        _ki = ki;
        _kd = kd;
        timer = new ElapsedTime();
    }

    /** Runs the {@link PID} calculation on the arguments and returns the result.
     * @param position Current motor position.
     * @param reference Desired motor position.
     * @return Motor power.
     * */
    public double Calc(double position, double reference) {
        double error = reference - position;
        integral += error * timer.seconds();
        double derivative = (error - lastError) / timer.seconds();
        timer.reset();
        return (error * _kp) + (integral * _ki) + (derivative * _kd);
    }

    /** Resets the integral and timer. */
    public void Reset() {
        integral = 0;
        timer.reset();
    }
}
