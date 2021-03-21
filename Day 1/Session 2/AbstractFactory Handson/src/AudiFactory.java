
public class AudiFactory extends Factory{

	@Override
	public Headlight makeHeadLight() {
		// TODO Auto-generated method stub
		return new AudiHeadlight();
	}

	@Override
	public Tire makeTire() {
		// TODO Auto-generated method stub
		return new AudiTire();
	}

	@Override
	public String toString() {
		return "AudiFactory [makeHeadLight()=" + makeHeadLight() + ", makeTire()=" + makeTire() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
