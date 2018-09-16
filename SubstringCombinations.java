/*
Задача 126: Строковые комбинации
Задача: вы работаете со строками, у вас есть след.символы: '1', '2', '3'. 
Необходимо определить кол-во всевозможных строк длины N, ктр состоят только из этих символов, но при этом не содержат подстроку "12".
Входные данные: N - длина строки от 1 до 30.
Вывод: кол-во всевозможных комбинаций строк
Пример: N = 3
Answer = 21
*/
public class SubstringCombinations 
{
	public static long getCombinationsCount(int n) {
		return getCombinationsCount(n, 0);	
	}
	
	public static long getCombinationsCount(int n, int last_symbol) {
		if (n == 1) {
			if (last_symbol == 2)
				return 2;
			else 
				return 3;
		} else {
			if (last_symbol == 2)
				return getCombinationsCount(n - 1, 2) + getCombinationsCount(n - 1, 3);
			else 
				return 2 * getCombinationsCount(n - 1, 1) + getCombinationsCount(n - 1, 2);
		}	
	}
	
    public static void main( String[] args ) {
    	int n = 3;
    	long combinationsCount = getCombinationsCount(n);
        System.out.println( "Combinations count: " + combinationsCount);
    }
}