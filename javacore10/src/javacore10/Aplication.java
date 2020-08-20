package javacore10;

import java.util.Scanner;

public class Aplication {

	static void menu() {

		System.out.println("Натисніть 1 щоб ввести слово");
		System.out.println("Натисніть 2 щоб Забрати голосні букви з введеного слова");
		System.out.println("Натисніть 3 щоб порахувати кількість слів");

	}

	public static void main(String[] args) throws Exseption {

		Scanner sc = new Scanner(System.in);

		while (true) {
			menu();
			switch (sc.next()) {
			case "1": {
				System.out.println("Введіть слово");
				sc = new Scanner(System.in);
				String word = sc.next();

				if (word.length() < 5) {
					throw new Exseption("Слово не може містити менше 5 символів");
				} else {
					System.out.println("Ваше слово складається з " + word.length() + " символів");
				}
				break;
			}
			case "2": {
				System.out.println("Введіть довільну строку слів, щоб замінити всі голосні букви");
				sc = new Scanner(System.in);
				String word = sc.nextLine();

				word = word.toLowerCase().replace('а', '_');
				word = word.toLowerCase().replace('е', '_');
				word = word.toLowerCase().replace('и', '_');
				word = word.toLowerCase().replace('і', '_');
				word = word.toLowerCase().replace('о', '_');
				word = word.toLowerCase().replace('у', '_');

				System.out.println(word);

				break;
			}
			case "3": {
				System.out.println("Введіть строку");
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
