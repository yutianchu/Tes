package com.mysql.jdbc;

import java.util.Scanner;

public class Sjgl {
	private static Scanner scanner;

	public static void main(String[]args) {
		scanner = new Scanner(System.in);
		System.out.println("===========================================================================");
		System.out.println("------------------------------书籍管理系统----------------------------------");
		System.out.println("1.添加书籍     2.修改书籍    3.删除书籍     4.查询所有书籍     5.选择查询      6.退出系统");
		System.out.println("请输入你的选择");
		while(true) {
		int change=scanner.nextInt();
		while(change<1 || change>6) {
			System.out.println("输入错误，再次选择");
			change=scanner.nextInt();
		}
		switch(change) {
		case 1:
		System.out.println("添加书籍请输入id，书籍名，出版社");
		break;
		case 2:
			System.out.println("请输入你要修改的书籍名,y");
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
			System.out.println("退出系统");
			System.exit(-1);
		break;
		}
			
		}
	}
}
