package section2;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Code21 { // 2차원 배열 연속된 숫자 소수 출력
	static int n;
	static int [][] grid;

	public static void main(String[] args){

		try{
			Scanner inFile = new Scanner(new File("data.txt"));
			n = inFile.nextInt();
			grid = new int [n][n];
			for(int i=0; i<n; i++)
				for(int j=0; j<n; j++)
					grid[i][j] = inFile.nextInt();

			inFile.close();
		} catch (FileNotFoundException e) { // 파일이 없을 때의 예외 처리를 해줘야 함
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(0);
		} 

		//모든 가능한 수열
		for(int x=0; x<n; x++){ // 출발점: (x,y)
			for(int y=0; y<n; y++)
				for(int dir=0; dir<8; dir++){ // 출발점에서 뻗어 나갈 수 있는 방향
					for(int length=1; length<=n; length++){ // 수열의 길이 1~n
						int value = computeValue(x,y,dir,length); 
						if(value != -1 && isPrime(value)) // computeValue가 유효한 수가 아닌 경우 -1을 return (배열을 벗어나는 값)
							System.out.println(value);
					}
				}
		}
	}

	//수열을 정수로 환산하기

	public static int computeValue(int x, int y, int dir, int len){
		int value =0;
		for(int i=0; i<len; i ++){
			int digit = getDigit(x,y,dir,i);
			if(digit==-1)
				return -1;
			value = value*10 + digit;
		}
		return value;
	}


	public static int getDigit(int x, int y, int dir, int k){
		int newX = x, newY = y;
		/*
		switch (dir) // 방향에 따라 x,y좌표가 증가, 감소
		{
			case 0: newY -=k; break;
			case 1: newX += k; newY -= k; break;
			case 2: newX += k; break;
			case 3: newX += k; newY += k; break;
			case 4: newY += k; break;
			case 5: newX -= k; newY += k; break;
			case 6: newX -= k; break;
			case 7: newX -= k; newY -= k; break;
		}
		 */

		int offsetX[] = {0,1,1,1,0,-1,-1,-1};
		int offsetY[] = {-1,-1,0,1,1,1,0,-1};

		newX= x + k*offsetX[dir];
		newY= y + k*offsetY[dir];

		if(newX <0 || newX >= n || newY <0 || newY >=n)
			return -1;
		else
			return grid[newX][newY];
	}

	public static boolean isPrime(int val){
		boolean result =true;
		
		for(int k=2; k*k<val; k++){
			if (val % k ==0){
				result = false;
				break;
			}
		}
		return result;
	}
}




