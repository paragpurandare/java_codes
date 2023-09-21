// "static void main" must be defined in a public class.

class Participant
{
	static int counter;
      Long contact;
      String name;
      String RegistrationId;
      String branch;

	static 
	{
		counter = 1001;

	}
	public Participant(String name,long contact,String branch)
	{
		this.name = name;
		this.contact = contact;
		this.branch = branch;
		this.RegistrationId = "D" + counter;
		counter++;
        
 	}
	//public void Participant()
	//{
	//	RegistrationId = "D" + counter;
	//	counter++;
	//}
		
	public static int getcounter()
	{
		return counter;
	}
	public String getname()
	{
		return name;
	}
	public String getbranch()
	{
		return branch;
	}
	public long getcontact()
	{
		return contact;
	}
	public String getRegistrationId()
	{
		return RegistrationId;
	}
	
	public void setcounter(int counter)
	{
		Participant.counter = counter;
	}
	//public void setname(String name)
	//{
	//	this.name = name;
	//}
	//public void setname(String branch)
	//{
	//	this.branch = branch;
	//}
	//public void setname(long contact)
	//{
	//	this.contact = contact;
	//}
	
   	public static void main(String[] args)
 	{
      	Participant p1 = new Participant("Parag",7972319116L,"Instru");
		Participant p2 = new Participant("Sahil",8000876543L,"AIDS");
		Participant p3 = new Participant("Nagesh",1234587231L,"Entc");
		Participant p4 = new Participant("Samyak",8999234512L,"CS");
		
		

		System.out.println("Hi " + p1.getname() + " !!! Your Registration ID is :" + p1.getRegistrationId());
		System.out.println("Hi " + p2.getname() + " !!! Your Registration ID is :" + p2.getRegistrationId());
		System.out.println("Hi " + p3.getname() + " !!! Your Registration ID is :" + p3.getRegistrationId());
		System.out.println("Hi " + p4.getname() + " !!! Your Registration ID is :" + p4.getRegistrationId());
    

	}
}