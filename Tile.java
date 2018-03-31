/**
 * Created by Daniel on 3/31/2018.
 */
public class Tile {
    private double propertyValue;
    private Household household;

    public Tile(double propertyValue, Household household) {
        this.propertyValue = propertyValue;
        this.household = household;
    }

    double getPropertyValue() {
        return this.propertyValue;
    }

    Household getHouseholds() {
        return this.household;
    }
}
