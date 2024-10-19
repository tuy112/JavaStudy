package example.example03;

import java.time.DateTimeException;
import java.time.LocalDate;

public class MyDate {
	private int day;
	private int month;
	private int year;
	
	public int getDay() {
		return day;
	}
	public int getMonth() {
		return month;
	}
	public int getYear() {
		return year;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	// myDate 생성자
	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	// 날짜 유효성 검사
	public boolean isValid() {
		try {
			LocalDate date = LocalDate.of(day, month, year);
			System.out.println("유효한 날짜입니다.");
            return true;
		} catch (DateTimeException e) {
			System.out.println("유효하지 않은 날짜입니다.");
			return false;
		}
	}
}
