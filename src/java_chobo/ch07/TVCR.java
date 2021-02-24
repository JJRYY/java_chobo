package java_chobo.ch07;

public class TVCR extends Tv {
	VCR vcr;
	int counter;
	
	public TVCR() {
		vcr = new VCR();
		counter = vcr.counter;
	}

	/**
	 *  adapter pattern, 대행자(proxy)
	 */
	void play() {
		vcr.play();
	}
	
	void stop() {
		vcr.stop();
	}
	
	void rew() {
		vcr.rew();
	}
	
	void ff() {
		vcr.ff();
	}
}
