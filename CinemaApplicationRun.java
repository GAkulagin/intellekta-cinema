package cinema;

import java.util.ArrayList;

public class CinemaApplicationRun {
	public static void main(String[] args) {
		ArrayList<Viewer> viewers = new ArrayList<Viewer>();
		
		viewers.add(new Viewer("vlad2004", 18, 5));
		viewers.add(new Viewer("thomasshelby", 23, 9));
		viewers.add(new Viewer("egor_egor", 27, 10));
		viewers.add(new Viewer("MaRiNaSuPeR", 33, 0));
		viewers.add(new Viewer("alex_geroj_voin_sniper_zashitnik_boec", 49, 12));
		
		System.out.println(ViewerStatistics.averageAge(viewers));
	}
}
