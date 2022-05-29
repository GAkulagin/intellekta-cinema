package cinema;

import java.util.ArrayList;

public class CinemaApplicationRun {
	public static void main(String[] args) {
		ArrayList<Viewer> viewers = new ArrayList<Viewer>();
		
		viewers.add(new Viewer("vlad2004", 18));
		viewers.add(new Viewer("thomasshelby", 23));
		viewers.add(new Viewer("egor_egor", 27));
		viewers.add(new Viewer("MaRiNaSuPeR", 33));
		viewers.add(new Viewer("alex_geroj_voin_sniper_zashitnik_boec", 49));
		
		System.out.println(ViewerStatistics.averageAge(viewers));
	}
}
