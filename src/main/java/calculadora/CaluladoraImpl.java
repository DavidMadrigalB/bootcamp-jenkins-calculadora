package calculadora;

public class CaluladoraImpl implements Calculadora {
	
	@Override
	public int calcular(int i1, char op, int i2) {
		switch(op) {
			case '+':
				return i1 + i2;
				break;
			case '-':
				return i1 - i2;
				break;
			case '*':
				return i1 * i2;
				break;
			case '/':
				return i1 / i2;
				break;
			default:
				return -1;
				break;
		}
		/*
		if (op == '+')
			return i1 + i2;
		else if (op == '-')
			return i1 + i2;
		else if (op == '*')
			return i1 * i2;
		else if (op == '/')
			return i1 / i2;
		return -1;
		*/
	}

}
