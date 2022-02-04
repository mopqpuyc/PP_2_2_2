package web.model;

import org.springframework.stereotype.Component;

@Component
public class Car {

    private String model;

    private int series;

    private long mileage;

    public Car() {}

    public Car(String model, int series, long mileage) {
        this.model = model;
        this.series = series;
        this.mileage = mileage;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public long getMileage() {
        return mileage;
    }

    public void setMileage(long mileage) {
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series=" + series +
                ", mileage=" + mileage +
                '}';
    }
}
