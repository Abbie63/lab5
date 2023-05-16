package CityData;

import Exceptions.IncorrectValueException;

public class Coordinates {

    private double x;
    private Integer y; //Значение поля должно быть больше -270, Поле не может быть null

    public Coordinates() {

    }
    public Coordinates(double x, Integer y) {
        this.x=x;
        this.y=y;
    }

    //X

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    //Y

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) throws IncorrectValueException {
        if(y == null){
            throw new IncorrectValueException("Y не может быть null");
        } else if (y <= -270) {
            throw new IncorrectValueException("Y должно быть больше -270");
        }
        this.y = y;
    }

    @Override
    public String toString() {
        return "Coordinates{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
