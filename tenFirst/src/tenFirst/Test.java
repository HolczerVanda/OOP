package tenFirst;

import java.util.ArrayList;
import java.util.Collections;

import tenFirst.UniversityEmployee.Position;
import tenFirst.UniversityEmployee.PositionSorter;

public class Test {

	public static void main(String[] args) {
		
		ArrayList<UniversityEmployee> universityEmployees=new ArrayList<UniversityEmployee>();
		
		universityEmployees.add(new UniversityEmployee("Geza", 56, "Informatikai-epulet", Position.ADMIN));
		universityEmployees.add(new UniversityEmployee("Adam", 23, "Matematikai-intezet", Position.TUTOR));
		universityEmployees.add(new UniversityEmployee("Ildiko", 45, "Matematikai-intezet", Position.PROF));
		universityEmployees.add(new UniversityEmployee("Akos", 30, "Informatikai-epulet", Position.PROF));
		universityEmployees.add(new UniversityEmployee("Petra", 21, "Informatikai-epulet", Position.TUTOR));
		
		for (int i = 0; i < universityEmployees.size(); i++) {
			Collections.sort(universityEmployees, new PositionSorter());
		}
		
		for (int i = 0; i < universityEmployees.size(); i++) {
			System.out.println(universityEmployees.get(i).toString());;
		}
		
		postStatistics(universityEmployees);
	}
	
	public static void postStatistics(ArrayList<UniversityEmployee> arrayList)
	{
		int profCnt=0;
		int tutorCnt=0;
		int adminCnt=0;
		
		for (int i = 0; i < arrayList.size(); i++)
		{
				switch(arrayList.get(i).getPost())
				{
				case PROF : profCnt++;
							break;
				case TUTOR :tutorCnt++;
							break;
				case ADMIN : adminCnt++;
							 break;
			}
		}
		
		if(profCnt!=0)
		{
			System.out.println("Number of professors: "+profCnt);
		}
		if(tutorCnt!=0)
		{
			System.out.println("Number of tutors: "+tutorCnt);
		}
		if(adminCnt!=0)
		{
			System.out.println("Number of admins: "+adminCnt);
		}
	}
}
