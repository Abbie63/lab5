package CityData;

import Exceptions.IncorrectIdException;
import Exceptions.IncorrectValueException;

import java.util.Date;

public class City {
    private long id; //Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; //Поле не может быть null
    private java.util.Date creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private Long area; //Значение поля должно быть больше 0, Поле не может быть null
    private Long population; //Значение поля должно быть больше 0, Поле не может быть null
    private double metersAboveSeaLevel;
    private long carCode; //Значение поля должно быть больше 0, Максимальное значение поля: 1000
    private Climate climate; //Поле может быть null
    private Government government; //Поле не может быть null
    private Human governor;

    @Override
    public String toString() {
        return "City{" +
                "id=" + id + "\n" +
                " name='" + name + '\'' + "\n" +
                " coordinates=" + coordinates +"\n" +
                " creationDate=" + creationDate +"\n" +
                " area=" + area +"\n" +
                " population=" + population +"\n" +
                " metersAboveSeaLevel=" + metersAboveSeaLevel +"\n" +
                " carCode=" + carCode +"\n" +
                " climate=" + climate +"\n" +
                " government=" + government +"\n" +
                " governor=" + governor + "\n" +
                '}';
    }

    public City() {}
    public City(long id, String name, Coordinates coordinates, Date creationDate, Long area, long population, double metersAboveSeaLevel, long carCode, Climate climate, Human governor, Government government) {
      this.id = id;
      this.name = name;
      this.coordinates = coordinates;
      this.creationDate = creationDate;
      this.area = area;
      this.population = population;
      this.metersAboveSeaLevel = metersAboveSeaLevel;
      this.carCode = carCode;
      this.climate = climate;
      this.governor = governor;
      this.government = government;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) throws IncorrectIdException {
        if (id <= -0) {
            throw new IncorrectIdException("Id должно быть больше 0");
        }
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws IncorrectValueException{
        if(name == null || name.isEmpty()){
            throw new IncorrectValueException("Name не может быть null или быть пустым");
        }
        this.name = name;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) throws IncorrectValueException{
        if(coordinates == null){
            throw new IncorrectValueException("coordinates не может быть null");
        }
        this.coordinates = coordinates;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) throws IncorrectValueException {
        if(creationDate == null){
            throw new IncorrectValueException("creationDate не может быть null");
        }
        this.creationDate = creationDate;
    }

    public Long getArea() {
        return area;
    }

    public void setArea(Long area) throws IncorrectValueException{
        if(area == null){
            throw new IncorrectValueException("area не может быть null");
        } else if (area <= 0) {
            throw new IncorrectValueException("area должно быть больше 0");
        }
        this.area = area;
    }

    public Long getPopulation() {
        return population;
    }

    public void setPopulation(Long population) throws IncorrectValueException{
        if(population == null){
            throw new IncorrectValueException("population не может быть null");
        } else if (population <= 0) {
            throw new IncorrectValueException("population должно быть больше 0");
        }
        this.population = population;
    }

    public double getMetersAboveSeaLevel() {
        return metersAboveSeaLevel;
    }

    public void setMetersAboveSeaLevel(double metersAboveSeaLevel) {
        this.metersAboveSeaLevel = metersAboveSeaLevel;
    }

    public long getCarCode() {
        return carCode;
    }

    public void setCarCode(long carCode) throws IncorrectValueException{
        if(carCode > 1000){
            throw new IncorrectValueException("carCode не может быть больше 1000");
        } else if (carCode <= 0) {
            throw new IncorrectValueException("carCode должно быть больше 0");
        }
        this.carCode = carCode;
    }

    public Climate getClimate() {
        return climate;
    }

    public void setClimate(Climate climate) throws IncorrectValueException{
        if(climate == null){
            throw new IncorrectValueException("climate не может быть null");
        }
        this.climate = climate;
    }

    public Government getGovernment() {
        return government;
    }

    public void setGovernment(Government government) throws IncorrectValueException{
        if(government == null){
            throw new IncorrectValueException("government не может быть null");
        }
        this.government = government;
    }

    public Human getGovernor() {
        return governor;
    }

    public void setGovernor(Human governor) {
        this.governor = governor;
    }

    //Поле не может быть null
}
