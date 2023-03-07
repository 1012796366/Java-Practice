public class Vehicle {
    double speed;
    int power;
    Vehicle()
    {
        speed = 0;
        power = 0;
    }
    Vehicle(double s, int p)
    {
        speed = s;
        power = p;
    }
    void speedUp(int s)
    {
        speed += s;
        if (speed > 200.0)
        {
            speed = 200.0;
        }
    }
    void speedDown(int d)
    {
        speed -= d;
        if (speed < 0.0)
        {
            speed = 0.0;
        }
    }
    void brake()
    {
        speed = 0.0;
    }
    void setPower(int p)
    {
        power = p;
    }
    int getPower()
    {
        return power;
    }
    double getSpeed()
    {
        return speed;
    }
}
