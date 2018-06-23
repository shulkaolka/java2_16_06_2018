package ua.univer.cvehicle;

public class CShip extends CVehicle {
	private int numberPass;
	private String destPort;

	public int getNumberPass() {
		return numberPass;
	}

	public void setNumberPass(int numberPass) {
		this.numberPass = numberPass;
	}

	public String getDestPort() {
		return destPort;
	}

	public void setDestPort(String destPort) {
		this.destPort = destPort;
	}

	public CShip(int x, int y, double price, double speed, double yearBirth, int numberPass, String destPort) {
		super(x, y, price, speed, yearBirth);
		setNumberPass(numberPass);
		setDestPort(destPort);
	}

	@Override
	public String toString() {
		return "CShip" + super.toString() + " numberPass=" + numberPass + ", destPort=" + destPort;
	}

}
