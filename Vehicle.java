/*
 * This program is a stub for the vehicle class.
 *
 * @author  Donggeun Lim
 * @version 1.0
 * @since   2022-12-11
 */

/** The class of a Vehicle. */
public class Vehicle {
    /** The vehicle's license plate. */
    private String licensePlate;
    /** The vehicle's colour. */
    private String colour;
    /** The vehicle's number of doors. */
    private final int numOfDoors;
    /** The vehicle's max speed. */
    private final int maxSpeed;
    /** The vehicle's speed. */
    private int speed;

    /**
     * Instantiates a Vehicle.
     *
     * @param newLicensePlate sets the license plate
     * @param newColour sets the colour
     * @param newNumOfDoors sets the number of doors
     * @param newMaxSpeed sets the max speed
     * */
    public Vehicle(final String newLicensePlate, final String newColour,
        final int newNumOfDoors, final int newMaxSpeed) {

        this.licensePlate = newLicensePlate;
        this.colour = newColour;
        this.numOfDoors = newNumOfDoors;
        this.maxSpeed = newMaxSpeed;
        this.speed = 0;
    }

    /**
     * Gets the license plate.
     *
     * @return the license plate
     * */
    public String getLicensePlate() {
        return this.licensePlate;
    }

    /**
     * Sets the license plate.
     *
     * @param newLicensePlate the new license plate
     * */
    public void setLicensePlate(final String newLicensePlate) {
        this.licensePlate = newLicensePlate;
    }

    /**
     * Gets the car colour.
     *
     * @return the car colour
     * */
    public String getColour() {
        return this.colour;
    }

    /**
     * Sets the car colour.
     *
     * @param newColour the new car colour
     * */
    public void setColour(final String newColour) {
        this.colour = newColour;
    }

    /**
     * Gets the number of doors.
     *
     * @return the number of doors
     * */
    public int getNumOfDoors() {
        return this.numOfDoors;
    }

    /**
     * Gets the max speed.
     *
     * @return the max speed
     * */
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    /**
     * Gets the speed.
     *
     * @return the speed
     * */
    public int getSpeed() {
        return this.speed;
    }

    /**
     * Increases the speed.
     *
     * @param accelerateBy increase the speed by this amount
     * */
    public void accelerate(final int accelerateBy) {
        this.speed += accelerateBy;
    }

    /**
     * Decreases the speed.
     *
     * @param brakeBy decrease the speed by this amount
     * */
    public void brake(final int brakeBy) {
        this.speed -= brakeBy;
    }
}

