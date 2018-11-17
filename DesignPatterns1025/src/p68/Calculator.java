package p68;

public class Calculator {
	static Operation op;
	public static Operation createOperation(String operator)
	{
		if(operator.equals("+"))
		{
			op=new AddOperation();
		}
		if(operator.equals("-"))
		{
			op=new SubOperation();
		}
		return op;
		
	}

}
