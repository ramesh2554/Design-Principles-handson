
public class MercedesFactory extends Factory{

	@Override
	public Headlight makeHeadLight() {
		// TODO Auto-generated method stub
		return new MercedesHeadlight();
	}

	@Override
	public Tire makeTire() {
		// TODO Auto-generated method stub
		return new MercedesTire();
	}

	@Override
	public String toString() {
		return "MercedesFactory [makeHeadLight()=" + makeHeadLight() + ", makeTire()=" + makeTire() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
