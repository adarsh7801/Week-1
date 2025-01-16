public class VolumeOfEarth{
	public static void main(String[] args){
		int radius = 6378;
		
		//Finding the volume in kilometers
		double volume_in_kilometer = (4.0/3.0)*(22.0/7.0)*radius*radius*radius;
		
		
		//Changing the volume in kilometer to volume in miles
		//one kilometer = 0.621371mile
		double volume_in_miles = volume_in_kilometer*0.621371* 0.621371 * 0.621371;
		
		//Printing the volume in kilometer and volume in miles
		System.out.println("The volume of earth in cubic kilometers is "+volume_in_kilometer+" and cubic miles is "+volume_in_miles);
		
	}
}