public class Company {
	public String companyName;
	public int companySize;
	public String ceoName;
	public String headQuaters;
	public int founded;
	public String about;

	public String[] branches;
	public String[] departments;
	public String[] jobOpenings;
	public String[] positions;
	public String[] employee;
	public double[] salary;
	
	public Company(String companyName,int companySize,String ceoName,String headQuaters,int founded,String about,String[] branches,
			String[] departments,String[] jobOpenings,String[] positions ,String[]  employee,double[]  salary) {
		this.companyName=companyName;
		this.companySize=companySize;
		this.ceoName=ceoName;
		this.headQuaters=headQuaters;
		this.founded=founded;
		this.about=about;
		this.branches=branches;
		this.departments=departments;
		this.jobOpenings=jobOpenings;
		this.positions=positions;
		this.employee=employee;
		this.salary=salary;
	}
	
	
	
	
	public void display() {
		System.out.println("========instance variables=========");
		System.out.println(companyName);
		System.out.println(headQuaters);
		System.out.println(about);
		System.out.println(ceoName);
		System.out.println(companySize);
		System.out.println(founded);
		System.out.println("========branches=========");
		for(int i=0;i<branches.length;i++){
	 String ref=branches[i];
	 System.out.println("branches :"+ref);
		}
		System.out.println("========departments=========");
	 for(int i=0;i<departments.length;i++){
	 String ref=departments[i];
		System.out.println("departments :"+ref);
	 }
	 System.out.println("========employee=========");
		for(int i=0;i<employee.length;i++){
	 String ref=employee[i];
		System.out.println("employee :"+ref);
		}
		System.out.println("========jobOpenings=========");
		for(int i=0;i<jobOpenings.length;i++){
	 String ref=jobOpenings[i];
		System.out.println("jobOpenings :"+ref);
		}
		System.out.println("========positions=========");
		for(int i=0;i<positions.length;i++){
	 String ref=positions[i];
		System.out.println("positions :"+ref);
		}
		
		
	}
	

}