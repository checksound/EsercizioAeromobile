
public class Aliante extends Aeromobile {

	public final int efficienza;
	
	public Aliante(String siglaAeromobile, int efficienza) {
		super(siglaAeromobile);
		this.efficienza = efficienza;
	}

	@Override
	public boolean superiore(CMP x) {
		if(x instanceof Aliante) {
			if(((Aliante)x).efficienza < this.efficienza) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "Aliante [siglaAeromobile=" + siglaAeromobile + ", efficienza=" + efficienza + "]";
	}
	
}
