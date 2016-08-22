package com.klk.calendar;

public class MyCalendar {

	// 윤년, 평년 판단하는 메서드
	public static boolean isYoon(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? true : false;
	}

	// 달의 마지막 날짜를 구하는 메서드
	public static int isMonthDay(int year, int month) {
		int m[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		m[1] = isYoon(year) ? 29 : 28;
		return m[month - 1];
	}

	// 서기 1년 부터 이전달까지의 날짜의 합계를 구하는 메서드
	public static int isLastTotalDay(int year, int month, int day) {
		int sum = (year - 1) * 365 + (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400;
		for (int i = 1; i < month; i++) {
			sum += isMonthDay(year, i);
		}
		return sum + day;
	}

	// 요일을 판단하는 메서드
	public static int isWeekToday(int year, int month, int day){
        return isLastTotalDay(year, month, day) % 7;
    }
}