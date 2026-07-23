void main() {
   Scanner input = new Scanner(System.in);
   System.out.println("Plate Number: ");
   String plateNumber = input.nextLine();

   System.out.println("Date: ");
   String date = input.nextLine();

   System.out.println("Vehicle Type: ");
   String vehicleType = input.nextLine();

   System.out.println("Speed: ");
   double speed = input.nextDouble();

   System.out.println("Seatbelt Fastened: ");
   boolean seatbelt = input.nextBoolean();

   Vehicle v = new Vehicle(plateNumber, date, vehicleType, speed, seatbelt);
   Radar.trafficFine(v);
}