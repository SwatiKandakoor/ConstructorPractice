
class TempleRunner{
	public static void main(String[] args){
		String[] locations={"Rajaji Nagara","Kukke SubharaManya","Darmsthala"};
		String[] templeNames={"Annajinya Temple","Ganesha","Sahibaba"};
		String[] howToGo={"Bus","Bike","Car"};
		String[] archanaItems={"Kayi","Udinabatti","Oil","Cotton"};
		String[] prasadaItems={"Rice","Sambar","Payasa","Kosmbari"};
		String[] abisheka={"kubha abisheka","kanaka abisheka","pala abisheka"};
		
		Temple temple=new Temple(20,10,"Kurthi OR Sarii",true,locations,
		templeNames,howToGo,archanaItems,prasadaItems,abisheka);
		temple.display();
	}
	
}