package br.com.cod3r.flyweight.map.model;

public class Pixel {
	private PixelTypeFactory type;
	private boolean oppened;
	
	public Pixel(PixelTypeFactory type, boolean oppened) {
		this.type = type;
		this.oppened = oppened;
	}

	public PixelTypeFactory getType() {
		return type;
	}

	public void setType(PixelTypeFactory type) {
		this.type = type;
	}

	public boolean isOppened() {
		return oppened;
	}

	public void setOppened(boolean oppened) {
		this.oppened = oppened;
	}
}
