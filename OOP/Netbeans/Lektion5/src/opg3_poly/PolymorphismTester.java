package opg3_poly;

import java.util.ArrayList;

/**
 * Udleveret kode-skelet til GP eksamen 3/12 2013
 * Opgave 3
 * 
 * @author erso
 *
 */
public class PolymorphismTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Playable> playList = new ArrayList<>();
		// Her implementeres opgave 3b.
		playList.add(new Piano());
		playList.add(new Tennis());
		playList.add(new Chess());
		
		for(Playable play : playList){
			play.play();
		}
				
	}

}
