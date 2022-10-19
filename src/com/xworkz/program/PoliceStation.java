class PoliceStation{
int noOfKambis;
int staffs;
int constables;
int sp;
int cerminals;
String[] positions;
String[] typesOfVehicle;
String[] jobOpenings;
String[] employee;
double[] salary;

public PoliceStation(int noOfKambis , int staffs, int constables,int sp,int cerminals,
 String[] positions,String[] typesOfVehicle,String[] jobOpenings,String[] employee,
 double[]  salary) {
	 this.noOfKambis=noOfKambis;
	 this.staffs=staffs;
	 this.constables=constables;
	 this.sp=sp;
	 this.cerminals=cerminals;
	 this.positions=positions;
	 this.typesOfVehicle=typesOfVehicle;
	 this.jobOpenings=jobOpenings;
	 this.employee=employee;
	 this.salary=salary;

}
public void show(){
	System.out.println("========instance veriable=========");
	System.out.println("noOfKambis :"+ noOfKambis);
	System.out.println("staffs :"+ staffs);
	System.out.println("constables :"+ constables);
	System.out.println("sp :"+ sp);
	System.out.println("cerminals :"+cerminals);
	System.out.println("========positions=========");
	for(int i=0;i<positions.length;i++){
	 String ref=positions[i];
	System.out.println("positions :"+ref);
	}
	System.out.println("========typesOfVehicle=========");
	for(int i=0;i<typesOfVehicle.length;i++){
	 String ref=typesOfVehicle[i];
	System.out.println("typesOfVehicle :"+ref);
	}
	
	System.out.println("========jobOpenings=========");
	for(int i=0;i<jobOpenings.length;i++){
	 String ref=jobOpenings[i];
	System.out.println("jobOpenings :"+ref);
	}
	System.out.println("========employee=========");
	for(int i=0;i<employee.length;i++){
	 String ref=employee[i];
	System.out.println("employee :"+ref);
	}
	System.out.println("========salary=========");
	for(int i=0;i<salary.length;i++){
	 double ref=salary[i];
	System.out.println("salary :"+ref);
	}
}
	
}