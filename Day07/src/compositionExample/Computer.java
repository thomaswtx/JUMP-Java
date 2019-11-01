package compositionExample;

public class Computer {
	private Processor processor;
	private Memory memory;
	private SoundCard soundCard;
	
	public Computer(Processor processor, Memory memory) {
		this.processor = processor;
		this.memory = memory;
		this.soundCard = null;
	}

	public Processor getProcessor() {
		return processor;
	}

	public void setProcessor(Processor processor) {
		this.processor = processor;
	}

	public Memory getMemory() {
		return memory;
	}

	public void setMemory(Memory memory) {
		this.memory = memory;
	}

	public SoundCard getSoundCard() {
		return soundCard;
	}

	public void setSoundCard(SoundCard soundCard) {
		this.soundCard = soundCard;
	}

	@Override
	public String toString() {
		return "Computer [processor=" + processor + ", memory=" + memory + ", soundCard=" + soundCard + "]";
	}
}
