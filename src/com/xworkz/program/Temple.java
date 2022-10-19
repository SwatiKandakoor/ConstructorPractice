class Temple{
 int archanaFees;
 int area;
 String wearingDress;
 boolean famous;
 String[] locations;
 String[] templeNames;
 String[] howToGo;
 String[] archanaItems;
 String[] prasadaItems;
 String[] abisheka;
 
 public Temple(int archanaFees,int area,String wearingDress,boolean famous,String[] locations,String[] templeNames,
 String[] howToGo,String[] archanaItems,String[] prasadaItems,String[] abisheka){
	 this.archanaFees=archanaFees;
	 this.area=area;
	 this.wearingDress=wearingDress;
	 this.famous=famous;
	 this.locations=locations;
	 this.templeNames=templeNames;
	 this.howToGo=howToGo;
	 this.archanaItems=archanaItems;
	 this.prasadaItems=prasadaItems;
	 this.abisheka=abisheka;
	 
 
 }
 public void display(){
	System.out.println("========instance variables=========");
 System.out.println(archanaFees);
 System.out.println(area);
 System.out.println(wearingDress);
 System.out.println(famous);
 System.out.println("========locations=========");
 for(int i=0;i<locations.length;i++){
	 String ref=locations[i];
	 System.out.println("locations :"+ref);
 }
 System.out.println("========templeNames=========");
for(int i=0;i<templeNames.length;i++){
	 String temple=templeNames[i];
	System.out.println("templeNames :"+temple);
}
System.out.println("========howToGo=========");
for(int i=0;i<howToGo.length;i++){
	 String ref=howToGo[i];
 System.out.println("howToGo :"+ref);
}
System.out.println("========archanaItems=========");
 for(int i=0;i<archanaItems.length;i++){
	 String ref=archanaItems[i];
    System.out.println("archanaItems :"+ref);
 }
 System.out.println("========prasadaItems=========");
 for(int i=0;i<prasadaItems.length;i++){
	 String ref=prasadaItems[i];
 System.out.println("prasadaItems :"+ref);
 }
 System.out.println("========abisheka=========");
 for(int i=0;i<abisheka.length;i++){
	 String ref=abisheka[i];
 System.out.println("abisheka :"+ref);
 }
 }

}