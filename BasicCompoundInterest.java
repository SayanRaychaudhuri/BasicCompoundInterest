
class BasicCompoundInterest{
	
	public enum Compound{
		ANNUALLY,
		QUARTERLY,
		MONTHLY,
		CONTINUOUSLY
	}
	
	public static void main(String args[]) {
		System.out.println(Compound(1000,5,Compound.CONTINUOUSLY,10));
	}
	
	public static double Compound(double principal, double rate, Compound compound, double years) {
		double base;
		rate/=100;
		switch (compound) {
		case ANNUALLY:
			base = 1+rate;
		case QUARTERLY:
			base = 1+rate/4;
		case MONTHLY:
			base = 1+rate/12;
		case CONTINUOUSLY:
			base = Math.E;
		default: 
			base = 1+rate;
		}
		return principal*Math.pow(base, rate*years);
	}
}
