import java.util.ArrayList;

public class subscriptions {
	Visitor v1;
	MultiTimeTecket Ty;
	Guide TG;
	int countofsubs;

	public subscriptions() {

	}

	public Guide getTG() {
		return TG;
	}

	public void setTG(Guide tG) {
		TG = tG;
	}

	public int getCountofsubs() {
		return countofsubs;
	}

	public void setCountofsubs(int countofsubs) {
		this.countofsubs = countofsubs;
	}

	public Visitor getV1() {
		return v1;
	}

	public void setV1(Visitor v1) {
		this.v1 = v1;
	}

	public MultiTimeTecket getTy() {
		return Ty;
	}

	public void setTy(MultiTimeTecket ty) {
		Ty = ty;
	}

	@Override
	public String toString() {
		return "subscriptions [v1=" + v1 + ", Ty=" + Ty + "]";
	}

}
