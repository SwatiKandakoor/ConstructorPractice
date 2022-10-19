class FoodRunner{
	public static void main(String[] args){
	 String[] foodTypes={"Spicy","Sweet","Bitter"}; 
	 	 String[] foodName={"Hard cash","google pay","phone pay"};
		 	 String[] ingredients={"Rice","vegetables","rice","masala"};
	Food food = new Food("Palav",true,2,foodTypes,foodName,ingredients);
	
	food.display();
	 }
	
}