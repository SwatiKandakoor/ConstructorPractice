public class CompanyRunner {

	public static void main(String[] args) {
		String[] branches= {"Pune","Mumbai","Bangalore"};
		String[] department= {"Tech","Admin","Suport","HR"};
		String[] jobOpenings= {"Backend Devloper","Fullstack ","Data Eng"};
		String[] positions= {"CEO","Marketing Manger","Production Manger","Accontant"};
		String[] employee= {"Swati","Sahana","Naveen"};
		double[] salary= {25000d,30000d,50000d};
		
		
		Company company=new Company("Merceds Benz",10000,"Dieter Zetche","Germany",1926,
		"Benz is a German luxury and commercial vehicle automative brand",branches,department,jobOpenings,positions,employee,salary);
		company.display();

	}

}