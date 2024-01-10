package ex05;

public class Km2Mile extends Converter {

	public Km2Mile(double ratio) {
		super.ratio = ratio;
	}

	@Override
	protected double convert(double km) {
		double mile = km/ratio;
		return mile;
	}

	@Override
	protected String srcString() {		
		return "Km";
	}

	@Override
	protected String destString() {
		return "Mile";
	}

}
