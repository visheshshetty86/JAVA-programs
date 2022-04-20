class Zoo
{
static String animal1="faiz";
static String animal2="shreyas";
String animal3="vaibhav";
String animal4="swasthik";
String animal5="varshith";
static void visit()
{
	System.out.println("zoo is full");
}
static void list()
{
	System.out.println("admissions next time");
}
public static void main(String args[])
{
	Zoo Z=new Zoo();
	Z.visit();
	Z.list();
	System.out.println(Z.animal1+" "+ Z.animal2+" " + Z.animal3+" " + Z.animal4+" " + Z.animal5);
}
}
