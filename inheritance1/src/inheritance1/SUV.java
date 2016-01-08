package inheritance1;

public class SUV extends Car {

	private boolean _isFourWheelDrive;

	SUV(int year,boolean isFourWheelDrive) {
		super(year);
		set_isFourWheelDrive(isFourWheelDrive);
	}

	public boolean is_isFourWheelDrive() {
		return _isFourWheelDrive;
	}

	public void set_isFourWheelDrive(boolean _isFourWheelDrive) {
		this._isFourWheelDrive = _isFourWheelDrive;
	}

}
