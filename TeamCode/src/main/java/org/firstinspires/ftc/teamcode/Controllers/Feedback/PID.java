package org.firstinspires.ftc.teamcode.Controllers.Feedback;

import com.qualcomm.robotcore.util.ElapsedTime;

public class PID {
    //Gain Vars
    double _kp;
    double _ki;
    double _kd;

    //vars for calc
    ElapsedTime timer;
    double integral;
    double lastError;

    //Constructor
    public PID(double kp, double ki, double kd) {
        _kp = kp;
        _ki = ki;
        _kd = kd;
        timer = new ElapsedTime();
    }
    //runs PID calc
    public double Calc(double position, double reference) {
        double error = reference - position;
        integral += error * timer.seconds();
        double derivative = (error - lastError) / timer.seconds();
        timer.reset();
        return (error * _kp) + (integral * _ki) + (derivative * _kd);
    }
    //resets PID
    public void Reset() {
        integral = 0;
        timer.reset();
    }
}
