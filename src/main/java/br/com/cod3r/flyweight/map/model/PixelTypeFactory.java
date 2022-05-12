package br.com.cod3r.flyweight.map.model;

public class PixelTypeFactory {

	private Character character;
	private Integer treasureReward;

	public PixelTypeFactory(Character character, Integer treasureReward) {
		this.character = character;
		this.treasureReward = treasureReward;
	}

	public Character getCharacter() {
		return character;
	}
	
	public Integer getTreasureReward() {
		return treasureReward;
	}
}
