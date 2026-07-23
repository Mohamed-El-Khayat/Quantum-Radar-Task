import java.util.ArrayList;

public class Rules {
    /*
    Rules:
        Private cars speed should be less than or equal 80
        Trucks and Buses cars speed should be less than or equal 60
        seatbelt must be fastened
    */

    // Track any rule violations
    public static ArrayList<Violation> checkViolations (Vehicle v){
        ArrayList<Violation> Violations = new ArrayList<>();
        String vehicleType = v.getVehicleType();
        double speed = v.getSpeed();
        boolean seatbeltStatus = v.getSeatbeltStatus();

        if(speed > 80 && vehicleType.equals("Private")){
            Violations.add(new Violation("Speed of " + speed + " exceeded max allowed 80 : " , 300));
        }

        if(speed > 60 && (vehicleType.equals("Truck") || vehicleType.equals("Bus"))){
            Violations.add(new Violation("Speed of " + speed + " exceeded max allowed 60 : " , 300));
        }

        if (!seatbeltStatus){
            Violations.add(new Violation("Seatbelt not fastened : " , 100));
        }

        return Violations;
    }

    // Tye total fine for breaking the rules
    public static int totalFees (Vehicle v) {
        int curFees=0;
        String vehicleType = v.getVehicleType();
        double speed = v.getSpeed();
        boolean seatbeltStatus = v.getSeatbeltStatus();

        if(speed > 80 && vehicleType.equals("Private")){
            curFees+=300;
        }

        if(speed > 60 && (vehicleType.equals("Truck") || vehicleType.equals("Bus"))){
            curFees+=300;
        }

        if (!seatbeltStatus){
            curFees+=100;
        }

        return curFees;
    }
}
