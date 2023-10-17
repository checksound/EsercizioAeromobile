
public abstract class Aeromobile implements CMP {
	
	public final String siglaAeromobile;
	
	public Aeromobile(String siglaAeromobile) {
		if (siglaAeromobile == null)
			throw new IllegalArgumentException("Error: siglaAeromobile is NULL");
		this.siglaAeromobile = siglaAeromobile;
	}

}
