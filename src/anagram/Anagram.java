package anagram;

import java.util.*;

public class Anagram {
	public static void main(String[] args){
		Scanner w = new Scanner (System.in);
		int y;
		System.out.println("How many words you after?");
		try
		{
			y = w.nextInt();
		}

		catch (java.util.InputMismatchException e)
		{
			System.out.println("Invalid Input. Please insert the integer.");
			
			return;
		}
		//int y= w.nextInt();
		
		Scanner m = new Scanner(System.in);
		String[] words = new String[y];

		System.out.println("Please enter the " +y +" words to sort");

		for (int i = 0; i < words.length; i++) {
			words[i] = m.nextLine().replaceAll("\\s+", "");


		}
		
		String[] sort = sorting(words);
		HashMap<String, String> wordpool = new HashMap<>();
		int i=0;
		for(String s : sort){
			
			if(wordpool.containsKey(s)){
				wordpool.put(s,wordpool.get(s)+","+words[i++]);

			}
			else{
				wordpool.put(s,words[i++]);
			}
		}
		wordpool.keySet().stream().forEach((s) -> {
			
			
			String x= wordpool.get(s);
			String[] items = x.split(",");
			int itemCount = items.length;
			System.out.println(x+"=>"+itemCount);
		});
		
	}
	public static String[] sorting(String[] str){
		String[] sorted = new String[str.length];
		int i=0;
		for (String s : str){
			sorted[i++] = s;
		}
		
		i=0;
		for (String s : sorted){
			char[] a = s.toCharArray();
			Arrays.sort(a);
			s = new String(a);
			sorted[i++] = s;
		}
		return sorted;
	}

}