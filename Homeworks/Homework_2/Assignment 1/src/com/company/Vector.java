package com.company;
import java.text.DecimalFormat;
import java.util.Objects;

public class Vector
{
    private double x;
    private double y;
    private double z;

    private DecimalFormat df = new DecimalFormat("#.#######");

    public static Vector Empty = new Vector(0, 0,0);

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public Vector(double X, double Y, double Z)
    {
        this.x = X;
        this.y = Y;
        this.z = Z;
    }

    @Override
    public String toString()
    {
        return String.format("(%1$s, %2$s, %3$s)", df.format(getX()), df.format(getY()), df.format(getZ()));
    }

    @Override
    public int hashCode()
    {
        int prime = 10001;
        int res = 1;
        long x = Double.doubleToLongBits(this.x);
        long y = Double.doubleToLongBits(this.y);
        long z = Double.doubleToLongBits(this.z);
        res = prime * res + (int)(((x >>> 16) ^ x) >>> 1) + (int)(((y >>> 32) ^ y) >>> 4) + (int)(((z >>> 24) ^ z) >>> 8);
        return res;
    }

    public boolean equals(Object obj)
    {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        Vector v = (Vector) obj;
        return ((this.x == v.getX() && this.y == v.getY() && this.z == v.getZ()) ? true : false);
    }

    // Длина вектора. Корень из суммы квадратов
    public double length()
    {
        return Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
    }

    // метод, вычисляющий скалярное произведение
    public static double scalarProduct(Vector u, Vector v)
    {
        return v.getX() * u.getX() + v.getY() * u.getY() + v.getZ() * u.getZ();
    }

    // метод, вычисляющий векторное произведение
    public void crossProduct(Vector v)
    {
        double X = this.y * v.getZ() - this.z * v.getY(), Y = this.z * v.getX() - this.x * v.getZ(), Z = this.x * v.getY() - this.y * v.getX();
        this.x = X; this.y = Y; this.z = Z;
    }

    public static Vector crossProduct(Vector u, Vector v)
    {
        return new Vector(u.getY() * v.getZ() - u.getZ() * v.getY(), u.getZ() * v.getX() - u.getX() * v.getZ(), u.getX() * v.getY() - u.getY() * v.getX());
    }

    // Косинус между двумя векторами
    public static double cos(Vector u, Vector v)
    {
        return (Vector.scalarProduct(u, v)) / (u.length() * v.length());
    }

    // Сумма двух векторов
    public static Vector sum(Vector u, Vector v)
    {
        Vector res = new Vector(u.getX() + v.getX(), u.getY() + v.getY(), u.getZ() + v.getZ());
        return res;
    }

    public void Add(Vector v)
    {
        this.x += v.getX();
        this.y += v.getY();
        this.z += v.getZ();
    }

    // Разность двух веторов
    public static Vector subtraction(Vector u, Vector v)
    {
        return Vector.sum(u, new Vector(v.getX() * (-1), (-1) * v.getY(), (-1) * v.getZ() ));
    }

    public void subtract(Vector v)
    {
        this.x -= v.getX();
        this.y -= v.getY();
        this.z -= v.getZ();
    }




}
