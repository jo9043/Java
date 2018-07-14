package section1;

public class Computer {
	private String manufacturer;
	private String processor;
	private int ramSize;
	private int diskSize;
	private double processorSpeed;
	
	// Computer 생성자가 없는 경우 자동으로 생성되는 생성자
	/*
	public Computer(){
		
	}
	*/

	public Computer(String man, String proc, int ram, int disk, double speed){
		manufacturer = man;
		processor = proc;
		ramSize = ram;
		diskSize = disk;
		processorSpeed = speed;
	}
	
	public double computerPower(){
		return ramSize * processorSpeed;
	}
	
	public String getManufacturer(){
		return manufacturer;
	}
	
	public double getRamSize(){
		return ramSize;
	}
	
	public double getProcessorSpeed(){
		return processorSpeed;
	}
	
	public int getDiskSize(){
		return diskSize;
	}
	
	public String toString(){
		String result = "Manufacturer: " + manufacturer +
						"\nCPU: " + processor +
						"\nRAM: " + ramSize + " megabytes" +
						"\nDisk: " + diskSize + " gigabytes" +
						"\nProcessor speed: " + processorSpeed + " gigahertz";
		
		return result;
	}

	

}
