class PoliceStationRunner{
	public static void main(String[] args){
		String[] positions={"DCP","IP","ACP"};
		String[] typesOfVehicle={"Car","Bike","Van","Jeep"};
		String[] jobOpenings={"ACP","IP","Constable"};
		String[] employee={"Naveen","Tarun","Barath"};
		double[] salary={20000d,25000d,35000d};
		
		PoliceStation policeStation=new PoliceStation(20,15,5,1,6,
		positions,typesOfVehicle,jobOpenings,employee,salary);
		policeStation.show();
	
	}
}