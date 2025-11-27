package assignments;

public class Ass8InheritanceTotalSalary extends  Ass8InheritanceCalculateSalary{

   double tsalary;	
	public void totalsalary()
	{
		calcuatehra();
		GetInfoSalary();
		tsalary=bpay+hra-pf-deduct+bonus;
	}
	public void salaryslip()
	{
		System.out.println("\n----SALARYSLIP------");
		System.out.println("basic pay is:"+bpay);
		System.out.println("deduction  :"+deduct);
		System.out.println("hra  :"+hra);
		System.out.println("pf :"+pf);
		System.out.println("bonus  :"+bonus);
		System.out.println("total Salary "+tsalary);
	}
	
	public static void main(String[] args) {
		
		
		Ass8InheritanceTotalSalary h=new Ass8InheritanceTotalSalary();
		h.totalsalary();
		h.salaryslip();
	}

}

//find the total salary by hand 
//class1 get basic pay,deduction an dbonus from console-Ass8InheritanceGetInfoSalary
//class2 calculate hra and pf --Ass8InheritanceCalculateSalary
//class 3 find the total salary (basicpay+hra-pf-deduction+bonus) and get the salary slip--Ass8InheritanceTotalSalary
//salary slip should contain : basic pay ,deduction ,hra,pf ,bonus and total salary by hand
// output 0
