package CityData;

public class Human {
    public Human () {

    }
    public Human (Long age, Double height) {
      this.age =age;
      this.height=height;
    }
    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    private Long age; //Значение поля должно быть больше 0
    private Double height; //Значение поля должно быть больше 0

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", height=" + height +
                '}';
    }
}
