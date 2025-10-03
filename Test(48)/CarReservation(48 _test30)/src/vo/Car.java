// 이름, 차번호, 전화번호, 예약 위치
package vo;

import java.util.Objects;

public class Car {
	private String name;
	private String carNo;
	private String phoneNo;
	private String loca;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Car(String name, String carNo, String phoneNo, String loca) {
		super();
		this.name = name;
		this.carNo = carNo;
		this.phoneNo = phoneNo;
		this.loca = loca;
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCarNo() {
		return carNo;
	}
	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getLoca() {
		return loca;
	}
	public void setLoca(String loca) {
		this.loca = loca;
	}


	// Set에 넣을 때 값 중복 방지
	@Override
	public int hashCode() {
		return Objects.hash(carNo, loca, name, phoneNo);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Objects.equals(carNo, other.carNo) && Objects.equals(loca, other.loca)
				&& Objects.equals(name, other.name) && Objects.equals(phoneNo, other.phoneNo);
	}



	@Override
	public String toString() {
		return "Car [name=" + name + ", carNo=" + carNo + ", phoneNo=" + phoneNo + ", loca=" + loca + "]";
	}
	
	
	
	
}
