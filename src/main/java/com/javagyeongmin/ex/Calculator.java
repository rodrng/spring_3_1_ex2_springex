package com.javagyeongmin.ex;

public class Calculator {
	
	public void addition(int firstNum, int secondNum) {
		System.out.println("���� ��� ���:");
		int result = firstNum + secondNum;
		System.out.println(firstNum + "+" + secondNum + "=" + result);
	}
	
	public void subtraction(int firstNum, int secondNum) {
		System.out.println("���� ��� ���:");
		int result = firstNum - secondNum;
		System.out.println(firstNum + "-" + secondNum + "=" + result);
	}
	
	public void multiplication(int firstNum, int secondNum) {
		System.out.println("���� ��� ���:");
		int result = firstNum * secondNum;
		System.out.println(firstNum + "*" + secondNum + "=" + result);
	}
	
	public void division(int firstNum, int secondNum) {
		System.out.println("������ ��� ���:");
		int result = firstNum / secondNum;
		System.out.println(firstNum + "/" + secondNum + "=" + result);
	}
}