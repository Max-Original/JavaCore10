package javacore10;

import java.util.Scanner;

public class Aplication {

	static void menu() {

		System.out.println("�������� 1 ��� ������ �����");
		System.out.println("�������� 2 ��� ������� ������ ����� � ��������� �����");
		System.out.println("�������� 3 ��� ���������� ������� ���");

	}

	public static void main(String[] args) throws Exseption {

		Scanner sc = new Scanner(System.in);

		while (true) {
			menu();
			switch (sc.next()) {
			case "1": {
				System.out.println("������ �����");
				sc = new Scanner(System.in);
				String word = sc.next();

				if (word.length() < 5) {
					throw new Exseption("����� �� ���� ������ ����� 5 �������");
				} else {
					System.out.println("���� ����� ���������� � " + word.length() + " �������");
				}
				break;
			}
			case "2": {
				System.out.println("������ ������� ������ ���, ��� ������� �� ������ �����");
				sc = new Scanner(System.in);
				String word = sc.nextLine();

				word = word.toLowerCase().replace('�', '_');
				word = word.toLowerCase().replace('�', '_');
				word = word.toLowerCase().replace('�', '_');
				word = word.toLowerCase().replace('�', '_');
				word = word.toLowerCase().replace('�', '_');
				word = word.toLowerCase().replace('�', '_');

				System.out.println(word);

				break;
			}
			case "3": {
				System.out.println("������ ������");
				sc = new Scanner(System.in);
				String stroka = sc.nextLine();

				String[] strings = stroka.split(" ");
				for (int i = 0; i < strings.length; i++) {
				}

				int wordsCount = strings.length;

				System.out.println(wordsCount);
			}
				break;

			}
		}
	}
}
