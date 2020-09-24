package creational.abstractt.factory.television;

import java.util.Arrays;
import java.util.List;

public class LGTelevisionPartsFactory implements TelevisionPartsFactory {
	
	LGTelevisionPartsFactory(){
		System.out.println("Inside LGTelevisionPartsFactory");
	}

	@Override
	public int createBoard() {
		// TODO Auto-generated method stub
		return 5;
	}

	@Override
	public int createButton() {
		// TODO Auto-generated method stub
		return 6;
	}

	@Override
	public List<String> createSpecialFeatures() {
		// TODO Auto-generated method stub
		return Arrays.asList("String1", "String2");
	}

}
