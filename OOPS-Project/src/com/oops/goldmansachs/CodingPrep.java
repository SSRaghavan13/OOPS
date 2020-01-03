package com.oops.goldmansachs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CodingPrep {
	public static long analyzeInvestments(String s) {

		long ans = 0;

		for (int begin = 0; begin < s.length() - 2; begin++) {
			Map<Character, Integer> map = new HashMap<>();

			int end = begin;

			while (end < s.length()) {
				Character end_char = s.charAt(end);

				if (end_char == 'A' || end_char == 'B' || end_char == 'C') {
					map.put(end_char, map.getOrDefault(end_char, 0) + 1);
				}

				// once you have at least one share from all the three given
				// companies, you can add any character/share towards the end,
				// and it would still satisfy the criteria.
				if (map.size() == 3) {
					ans += (s.length() - end);
					break;
				}

				end++;
			}
		}

		return ans;
	}
	
	private static int findMaxCommonality(String str) {
        int[] count = new int[26];
        for(char ch : str.toCharArray()) {
            count[ch-'a']++;
        }
        int res = 0;
        int cur = 0;
        for(int i=0; i<str.length(); ++i) {
            if(count[str.charAt(i)-'a'] > 1) {
                ++cur;
                count[str.charAt(i)-'a'] -= 2;
            } else if (count[str.charAt(i)-'a'] == 0) {
                --cur;
            } else {
                --count[str.charAt(i)-'a'];
            }
            res = Math.max(cur, res);
        }
        return res;
    }
	
	public static int[][] gridGame(int grid[][],int k,String[] rules){
        int corners [][] = new int[][]{{0,1},{0,-1},{1,0},{-1,0},{1,1},{-1,-1},{1,-1},{-1,1}};
        int lc[][] = new int[grid.length][grid[0].length];
        for(int l=0;l<k;l++){
            for(int i=0;i<grid.length;i++){
                for(int j=0;j<grid[0].length;j++){
                    int count =0;
                    for(int f=0;f<8;f++){
                        int r = i,c = j;
                        r = r + corners[f][0];
                        c = c + corners[f][1];
                        if(r>=0 && r<grid.length && c>=0 && c<grid[0].length){
                            if(grid[r][c] == 1) {
                                count++;
                            }
                        }
                    }
                    lc[i][j] = count;
                }
            }
            for(int i=0;i<grid.length;i++){
                for(int j=0;j<grid[0].length;j++){
                    if(rules[lc[i][j]].equals("alive")){
                        grid[i][j] = 1;
                    } else {
                        grid[i][j] = 0;
                    }
                }
            }

        }
        return grid;
    }
	
	public static int findRank(int[][] matrix, int rank) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < matrix.length; i++) {
			int marks = 0;
			for(int j = 0; j < matrix[i].length; j++) {
				marks += matrix[i][j];
			}
			map.put(i, marks);
		}
		System.out.println(map);
		Map<Integer, Integer> result = map.entrySet()
				  .stream()
				  .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				  .collect(Collectors.toMap(
				    Map.Entry::getKey, 
				    Map.Entry::getValue, 
				    (oldValue, newValue) -> oldValue, LinkedHashMap::new));
		System.out.println(result);
		List<Integer> keys = new ArrayList<>(result.keySet());
		return (int) keys.get(rank - 1);
	}
	
	// Function to check if all of the digits  
	// in a number and it's product with q  
	// are unequal or not  
	static boolean checkIfUnequal(int n, int q)  
	{  
	    // convert first number into string  
	    String s1 = Integer.toString(n);  
	    int a[] = new int[26]; 
	  
	    // Insert elements from 1st number  
	    // to hash  
	    for (int i = 0; i < s1.length(); i++)  
	        a[s1.charAt(i) - '0']++;  
	  
	    // Calculate corresponding product  
	    int prod = n * q;  
	  
	    // Convert the product to string  
	    String s2 = Integer.toString(prod);  
	  
	    // Using the hash check if any digit of  
	    // product matches with the digits of  
	    // input number  
	    for (int i = 0; i < s2.length(); i++)  
	        if (a[s2.charAt(i) - '0'] == 1) // if yes, return false  
	            return false;  
	  
	    // else, return true  
	    return true;  
	}  
	  
	// Function to count numbers in the range [l, r]  
	// such that all of the digits of the number and  
	// it's product with q are unequal  
	static int countInRange(int l, int r, int q)  
	{  
	    int count = 0;  
	  
	    for (int i = l; i <= r; i++) {  
	        // check for every number between l and r  
	        if (checkIfUnequal(i, q))  
	            count++;  
	    }  
	  
	    return count;  
	} 
	
	public static void main(String args[]) {
		System.out.println(CodingPrep.analyzeInvestments("ABCCBA"));
		System.out.println(CodingPrep.findMaxCommonality("abcdecdefg"));
		int[][] grid = {{0,1,0,0},{0,0,0,0}};
		int k = 1;
		String[] rules = {"dead", "alive", "dead", "dead", "dead", "dead", "dead", "dead", "dead", "dead"};
		System.out.println("Grid game:");
		int[][] gridOutput = CodingPrep.gridGame(grid, k, rules);
		for(int[] arr:gridOutput) {
			for(int a:arr)
				System.out.print(a);
			System.out.println();
		}
		int matrix[][] = {{79,89,15},{71,96,88},{85,89,92},{71,96,88},{71,96,99}, {71,96,88}};
		System.out.println(CodingPrep.findRank(matrix, 2));
		System.out.println(countInRange(5, 15, 2));
	}
}
