public class PenDistribution{
	public static void main(String[] args){
		int pen = 14;
		int student = 3;
		//calculating the remaining pen which are not being distributed
		int remaining_pen = pen%student;
		//calculating number of pens distributed to every student
		int pen_per_student= (pen - remaining_pen)/student;
		//printing pen distributed to every student and the remaining pen
		System.out.println("The Pen Per Student is "+pen_per_student+" and the remaining pen not distributed is "+remaining_pen);
	}
}