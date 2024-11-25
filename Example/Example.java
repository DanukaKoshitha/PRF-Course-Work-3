
import java.util.*;
class Example{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);

	System.out.println("________________________________________________________________");
	System.out.println("|                 SALARY INFORMATION SYSTEM                    |");
	System.out.println("----------------------------------------------------------------");
	System.out.println("\n");

	System.out.println("		[1] Calculate Income Tax ");	
	System.out.println("		[2] Calculate Annual Bonus");	
	System.out.println("		[3] Calculate Loan Amount ");	
	System.out.print("Enter an option to continue > ");	
	int x=input.nextInt();
	if(x==1){
	System.out.println("\n");
	
		System.out.println("________________________________________________________________");
		System.out.println("|                    Calculate Income Tax                      |");
		System.out.println("----------------------------------------------------------------");
		System.out.println("\n");
		

		
		




		System.out.print("Input Employee name - ");
	        String name=input.next();
		System.out.print("Input Employee Salary - ");
		double salary=input.nextDouble();
		System.out.println("\n");
		

		
	   	if(salary>308333){
		System.out.println("You have to pay Income Tax per month :"+((salary-308333)*0.36+32500.32));
		}else if(salary>266667){
		System.out.println("You have to pay Income Tax per month :"+((salary-266667)*0.30+17500.20));
		}else if(salary>225000){
		System.out.println("You have to pay Income Tax per month :"+((salary-225000)*0.24+15000.12));
		}else if(salary>183333){
		System.out.println("You have to pay Income Tax per month :"+((salary-183333)*0.18+7500.06));
		}else if(salary>141667){
		System.out.println("You have to pay Income Tax per month :"+((salary-141667)*0.12+2500.02));
		}else if(salary>100000){
		System.out.println("You have to pay Income Tax per month :"+(salary-100000)*0.06);
		}else{
		System.out.println("You have to pay Income Tax per month :"+salary);
		}


}else if(x==2){







		System.out.println("________________________________________________________________");
		System.out.println("|                    Calculate Annual Bonus                    |");
		System.out.println("----------------------------------------------------------------");
		System.out.println("\n");

		System.out.print("Input Employee name - ");
	        String name2=input.next();
		System.out.print("Input Employee Salary - ");
		double salary2=input.nextDouble();
		System.out.println("\n");
		


if(salary2<100000){
	System.out.println("Annual bonus  - 5000.0");
}else if(salary2>=100000 && salary2<200000){
	System.out.println("Annual bonus  - "+(salary2*=0.10));
}else if(salary2>=200000 && salary2<300000){
	System.out.println("Annual bonus  - "+(salary2*=0.15));
}else if(salary2>=300000 && salary2<400000){
	System.out.println("Annual bonus  - "+(salary2*=0.20));
}else if(salary2>=400000){
	System.out.println("Annual bonus  - "+(salary2*=0.35));
}

}else if(x==3){



		System.out.println("________________________________________________________________");
		System.out.println("|                    Calculate Loan amount                     |");
		System.out.println("----------------------------------------------------------------");
		System.out.println("\n");

		System.out.print("Input Employee name - ");
	        String name3=input.next();
		System.out.print("Input Employee Salary - ");
		double salary3=input.nextDouble();
		System.out.print("Enter number of year : ");
	        int year=input.nextInt();
		System.out.println("\n");

double k=0.15/12;
int n=year*12;
double p=(salary3*0.6);
        

if(salary3>50000){
	double loan=p*(1-(1/Math.pow((1+k),n)))/k;
	loan=Math.round(loan/1000.0)*1000;
System.out.println();

System.out.println("You can get Loan Amount : "+ loan);
}else {
		System.out.println("You can not get loan because your salary lessthan Rs.50 000...");
}
}





}

}









