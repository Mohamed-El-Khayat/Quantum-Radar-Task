import java.util.ArrayList;

public class Radar {

    // printing the current radar observation
    public static void trafficFine (Vehicle v) {
        ArrayList<Violation> violations = Rules.checkViolations(v);
        int totalFees = Rules.totalFees(v);
        String vehicleName = "";
        vehicleName = v.getVehicleType().equals("Private") ? "car" : v.getVehicleType();
        System.out.println("Traffic fine for " + vehicleName + ' ' + v.getPlateNumber());
        System.out.println("Total amount: " + totalFees +" EGP");
        System.out.println("Violations: ");
        if(violations.isEmpty()){
            System.out.println("There is no any violations");
        }
        else {
            for(Violation violation : violations){
                System.out.println("- " + violation.getMessage() + violation.getFee() + " EGP");
            }
        }
    }
}
