 public static void main(String[] args) {
  double fuelTankLiters = 13.0;
  double reserveLimit = 2.0;
  int totalKilometers = 0;
  
  while(fuelTankLiters>reserveLimit) {
    totalKilometers += 28;
    fuelTankLiters--;
  }
  
  System.out.println("Total kilometers driven : " + totalKilometers);
  System.out.println("Reserve hit! Refuel immediately");

} 
