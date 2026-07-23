public class Vehicle {
    private String plateNumber;
    private String date;
    private String vehicleType;
    private double speed;
    private boolean seatbeltStatus;

    public Vehicle(String plateNumber, String date, String vehicleType, double speed, boolean seatbeltStatus) {
        this.plateNumber = plateNumber;
        this.date = date;
        this.vehicleType = vehicleType;
        this.speed = speed;
        this.seatbeltStatus = seatbeltStatus;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public String getDate() {
        return date;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public double getSpeed() {
        return speed;
    }

    public boolean getSeatbeltStatus() {
        return seatbeltStatus;
    }
}
