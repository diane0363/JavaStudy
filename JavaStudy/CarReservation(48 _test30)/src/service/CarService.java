// 최대 1000개의 데이터 이용 가능한 객체 배열 생성
// 추가, 조회, 검색, 삭제 기능 등 

package service;

import java.util.Scanner;

import vo.Car;

public class CarService {
	private Scanner sc = new Scanner(System.in);
	private final Car[] resData = new Car[1000];
	private int size = 0;
	
	
	public void addReservation(Car car) {
		// TODO Auto-generated method stub
		if (size >= resData.length) {
			throw new IllegalStateException("저장 공간이 가득 찼습니다.");
		}
		resData[size++] = car;
	}
	
	public Car findByCarNo(String phoneNo) {
		for (int i = 0; i < size; i++) {
			if (resData[i].getPhoneNo().equals(phoneNo)) return resData[i];
		}
		
		return null;
	}
	
	public Car[] findAll() {
	    Car[] result = new Car[size];      
	    for (int i = 0; i < size; i++) {
	        result[i] = resData[i];        
	    }
	    
	    // 얕은 복사? 깊은 복사 ? 
		sc.close();

	    return result;

	}	

}
