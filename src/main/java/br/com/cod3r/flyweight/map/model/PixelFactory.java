package br.com.cod3r.flyweight.map.model;

import java.util.HashMap;
import java.util.Map;

public class PixelFactory {
	private static PixelFactory instance = new PixelFactory();
	private static Map<Character, PixelTypeFactory> pixelRepository;
	
	private PixelFactory() {
		pixelRepository = new HashMap<Character, PixelTypeFactory>();
	}
	
	public static PixelFactory getInstance() {
		return instance;
	}
	
	public PixelTypeFactory getPixelType(Character character, Integer treasureReward) {
		PixelTypeFactory pt = pixelRepository.get(character);
		if(pt == null) {
			System.out.println("Creating new Flyweight for " + character);
			pt = new PixelTypeFactory(character, treasureReward);
			pixelRepository.put(character, pt);
		}
		return pt;
	}
}
