package prob06;

public abstract class Operation {
	protected int a;
	protected int b;
	
	public void setValue(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	
	public static Operation getOperation(String[] tokens)
	{
		Operation operation = null;
		if(tokens == null || tokens.length != 3) {
			return null;
		}	
		
		String operator = tokens[1];
		switch(operator)
		{
			case "+" : operation = new Add(); break;
			case "-" : operation = new Sub(); break;
			case "*" : operation = new Mul(); break;
			case "/" : operation = new Div(); break;
			default : return null;
		}
		
		int a = Integer.parseInt(tokens[0]);
		int b = Integer.parseInt(tokens[2]);
		operation.setValue(a, b);
		
		return operation;
	}
	
	public abstract int calculate(); 
}
