package structural.adapter.boat.row;

import structural.adapter.boat.fish.FishingBoat;

public class BoatAdapter implements Rowing {

	FishingBoat fishingBoat = new FishingBoat();
	  
	@Override
	public void row(String s) {
		fishingBoat.sail(s);
	}

}
