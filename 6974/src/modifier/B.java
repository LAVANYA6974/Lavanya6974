package modifier;
import AccessModifier.*;    //
                            //public-->The access level of a public modifier is everywhere. It can be accessed from within 
                                      //the class, outside the class, within the package and outside the package.
public class B {

	public static void main(String[] args) {
		A obj = new A();//Compile Time Error
		 obj.msg();//Compile Time Error	
	}

}
