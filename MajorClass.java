package pm_package;

public class MajorClass {

	public static void main(String[] args)
	{
		Mainclass mc = new Mainclass();
		mc.say1();
		mc.say2();
		mc.say3();
		mc =new Derivedclass();
		mc.say3();
	}

}
