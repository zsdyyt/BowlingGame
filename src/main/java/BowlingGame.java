package main.java;

import java.util.Scanner;

public class BowlingGame {
	public static void main(String[] args){
		System.out.print("INPUT: ");
		Scanner scan = new Scanner(System.in);
		String str333 = scan.nextLine();
		int sum = getBowlingScore(str333);
		System.out.print("INPUT: " + sum);
	}

    public static int getBowlingScore(String str2) {
    	int Score=0;
		for(int i=0;i<str2.length();i++){		
		if(str2.charAt(i)=='X' ){
			if(i<str2.length()-2){
				if (str2.charAt(i+2)=='X'){
					if (str2.charAt(i+4)=='X'){
						Score = 30 + Score;
					}else if(str2.charAt(i+4)=='-'){
						Score = 20 + Score;
					}else if(str2.charAt(i+3)=='|' && str2.charAt(i+4)=='|'){
						if (str2.charAt(i+5)=='X'){
							Score = 30 + Score;
						}else if(str2.charAt(i+5)=='-'){
							Score = 20 + Score;
						}else{
							Score = 20 + Character.getNumericValue(str2.charAt(i+5)) + Score;
						}
					}
					else{
						Score = 20 + Character.getNumericValue(str2.charAt(i+4)) + Score;
					}
			
				}
			

				else if(i<str2.length()-3 && str2.charAt(i+2)=='-'){
					if (str2.charAt(i+3)=='X'){
						Score = 20 + Score;
					}else if(str2.charAt(i+3)=='-'){
						Score = 10 + Score;
					}else{
						Score = 10 + Character.getNumericValue(str2.charAt(i+3)) + Score;
					}
				
				}
			

				else if(str2.charAt(i+2)=='|'){
					if (i<str2.length()-4){
							if (str2.charAt(i+3)=='X'){
								if (str2.charAt(i+4)=='X'){
									Score = 30 + Score;
								}else if(str2.charAt(i+4)=='-'){
									Score = 20 + Score;
								}else{
									Score = 20 + Character.getNumericValue(str2.charAt(i+4)) + Score;
								}
							}else if (str2.charAt(i+3)=='-'){
								if (str2.charAt(i+4)=='X'){
									Score = 20 + Score;
								}else if(str2.charAt(i+4)=='-'){
									Score = 10 + Score;
								}else{
									Score = 10 + Character.getNumericValue(str2.charAt(i+4)) + Score;
								}

							}else{
								if (str2.charAt(i+3)=='/'){
									Score = 20 + Score;
								}else if(str2.charAt(i+4)=='-'){
									Score = 10 + Character.getNumericValue(str2.charAt(i+3)) + Score;
								}
								else{
									Score = 10 + Character.getNumericValue(str2.charAt(i+3)) + Character.getNumericValue(str2.charAt(i+4)) + Score;
								}
							}
						}
				}
			

				else{
					if (i<str2.length()-3 && str2.charAt(i+3)=='/'){
						Score = 20 + Score;
					}else if(i<str2.length()-3 && str2.charAt(i+3)=='-'){
						Score = 10 + Character.getNumericValue(str2.charAt(i+2)) + Score;
					}else{
						Score = 10 + Character.getNumericValue(str2.charAt(i+2)) + Character.getNumericValue(str2.charAt(i+3)) + Score;
					}
				}

			}
			else{
				Score = 0 + Score;
			}

			
			
		}

		

		else if(str2.charAt(i)=='/'){
			if (i<str2.length()-2 && str2.charAt(i+2)=='X'){
					Score = 10 - Character.getNumericValue(str2.charAt(i-1)) + 10 + Score;
				}else if(i<str2.length()-2 && str2.charAt(i+2)=='-'){
					Score = 10 - Character.getNumericValue(str2.charAt(i-1)) + Score;
				}else if(i<str2.length()-2 && str2.charAt(i+2)=='|'){
					if (str2.charAt(i+3)=='-'){
						Score = 10 - Character.getNumericValue(str2.charAt(i-1))+ Score;
					}else if(str2.charAt(i+3)=='X'){
						Score = 10 - Character.getNumericValue(str2.charAt(i-1))+ 10 + Score;
					}else{
						Score = 10 - Character.getNumericValue(str2.charAt(i-1)) +Character.getNumericValue(str2.charAt(i+3))+ Score;
					}
					
				}else{
					Score = 10 - Character.getNumericValue(str2.charAt(i-1)) +Character.getNumericValue(str2.charAt(i+2))+ Score;
				}
			
		}
		

		else if(str2.charAt(i)=='-'){
			Score = 0 + Score;
		}
		

		else if(str2.charAt(i)=='|'){
			Score = 0 + Score;
		}
		

		else{
			if(i>2 && str2.charAt(i-1)=='|' && str2.charAt(i-2)=='|'){
				Score =0 + Score;
			}else if(i>2 && str2.charAt(i-2)=='|' && str2.charAt(i-3)=='|'){
				Score =0 + Score;
			}
			else{
				Score =Character.getNumericValue(str2.charAt(i)) + Score;
			}
		}
		}
		return Score;
	}
}
