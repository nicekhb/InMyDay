package com.klk.calendar;

public class MyCalendar {

	// ����, ��� �Ǵ��ϴ� �޼���
	public static boolean isYoon(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? true : false;
	}

	// ���� ������ ��¥�� ���ϴ� �޼���
	public static int isMonthDay(int year, int month) {
		int m[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		m[1] = isYoon(year) ? 29 : 28;
		return m[month - 1];
	}

	// ���� 1�� ���� �����ޱ����� ��¥�� �հ踦 ���ϴ� �޼���
	public static int isLastTotalDay(int year, int month, int day) {
		int sum = (year - 1) * 365 + (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400;
		for (int i = 1; i < month; i++) {
			sum += isMonthDay(year, i);
		}
		return sum + day;
	}

	// ������ �Ǵ��ϴ� �޼���
	public static int isWeekToday(int year, int month, int day){
        return isLastTotalDay(year, month, day) % 7;
    }
}