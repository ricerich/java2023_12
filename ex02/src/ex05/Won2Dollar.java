package ex05;

public class Won2Dollar extends Converter {

	public Won2Dollar(int ratio) {
		super.ratio = ratio;
	}

	@Override
	protected double convert(double won) {
		double dollar = won/ratio;
		return dollar;
	}

	@Override
	protected String srcString() {
		return "원";
	}

	@Override
	protected String destString() {
		return "달러";
	}

}
