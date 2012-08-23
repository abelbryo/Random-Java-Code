import java.lang.reflect.*;


	/**
	 *  Shows the methods on a class in detail with params, return type and exceptions
	 */

public class Method1 {
	private int f1(Object p, int x) throws NullPointerException {
		if(p == null)
			throw new NullPointerException();
		return x;
	}
	
	public static void main(String []args){
		try{
			Class cls = Class.forName("Method1");
			Method [] mlist = cls.getDeclaredMethods();
			for (Method i : mlist){
				System.out.println("decl class = " + i.getDeclaringClass());
				
				Class pvec[] = i.getParameterTypes();
				for(Class j : pvec){
					System.out.println("param " + j);
				}
				
				Class evec[] = i.getExceptionTypes(); 
				for(Class j : evec){
					System.out.println("excep " + j);
				}
				
				System.out.println("Return type" + i.getReturnType());
				System.out.println("===================================");
			} 
			
		}
		catch(Throwable e){
			System.err.println(e);
		}
		
	}
}
