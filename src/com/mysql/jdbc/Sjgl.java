package com.mysql.jdbc;

import java.util.Scanner;

public class Sjgl {
	private static Scanner scanner;

	public static void main(String[]args) {
		scanner = new Scanner(System.in);
		System.out.println("===========================================================================");
		System.out.println("------------------------------�鼮����ϵͳ----------------------------------");
		System.out.println("1.����鼮     2.�޸��鼮    3.ɾ���鼮     4.��ѯ�����鼮     5.ѡ���ѯ      6.�˳�ϵͳ");
		System.out.println("���������ѡ��");
		while(true) {
		int change=scanner.nextInt();
		while(change<1 || change>6) {
			System.out.println("��������ٴ�ѡ��");
			change=scanner.nextInt();
		}
		switch(change) {
		case 1:
		System.out.println("����鼮������id���鼮����������");
		break;
		case 2:
			System.out.println("��������Ҫ�޸ĵ��鼮��,y");
		break;
		case 3:
			System.out.println("================================");
		break;
		case 4:
			System.out.println("================================");
		break;
		case 5:
			System.out.println("=================================");
		break;
		case 6:
			System.out.println("�˳�ϵͳ");
			System.exit(-1);
		break;
		}
			
		}
	}
}
