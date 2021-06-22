package bridgelabz.distance;
import java.awt.geom.Line2D;

public class check {

	public static boolean equals (final Line2D ln1, final Line2D ln2) {
		if(ln1 == null) {
			return (ln2 == null);
		}
		if(ln2 == null) {
			return false;
		}
		if (!ln1.getP1().equals(ln2.getP1())) {
			return false;
		}
		if (!ln1.getP2().equals(ln2.getP2())) {
			return false;
		}
		return true;
	}

}
