
public class AereoMotore extends Aeromobile {

	public final double potenza;
	
	public AereoMotore(String siglaAeromobile, double potenza) {
		super(siglaAeromobile);
		this.potenza = potenza;
	}

	@Override
	public boolean superiore(CMP x) {
		if(x instanceof AereoMotore) {
			if(((AereoMotore)x).potenza < this.potenza) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "AereoMotore [siglaAeromobile=" + siglaAeromobile + ", potenza=" + potenza + "]";
	}	

}
