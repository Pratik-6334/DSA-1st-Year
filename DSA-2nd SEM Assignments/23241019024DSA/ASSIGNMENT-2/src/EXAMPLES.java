class student
{
	public int getRegdno() {
		return regdno;
	}
	public String getName() {
		return name;
	}
	public double getCgpa() {
		return cgpa;
	}
	public String getSec() {
		return sec;
	}
	public void setRegdno(int regdno) {
		this.regdno = regdno;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
	public void setSec(String sec) {
		this.sec = sec;
	}
	int regdno;
	String name;
	double cgpa;
	String sec;
	
}
public class EXAMPLES 
{

	public static void main(String[] args) 
	{
		student s1=new student();
		s1.setName("aaa");
		s1.setRegdno(123);
		s1.setCgpa(9.8);
		s1.setSec("2i1");
        System.out.println(s1.getName());
        System.out.println(s1.getRegdno());
        System.out.println(s1.getCgpa());
        System.out.println(s1.getSec());
	}

}
