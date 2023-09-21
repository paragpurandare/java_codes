class Student
{
	int roll;
	String name;
	static String coll_name = "VIT PUNE";

	Student(int r, String n)
	{
		roll = r;
		name = n;
	}
	 void Show()
	{
		System.out.println("Roll = " + roll + "Name = " + name + " College_Name = " + coll_name);
	}

	public static void main(String[] args)
	{
	Student S1 = new Student(31,"Manish");
	Student S2 = new Student(30,"Kundan");
	Student S3 = new Student(27,"Parag");
	Student S4 = new Student(32,"Ram");
	Student S5 = new Student(39,"Vinayak");
      
  S1.Show();
	
	System.out.println(S1);
	System.out.println(S2);
	System.out.println(S3);
	System.out.println(S4);
	System.out.println(S5);
	}
}

