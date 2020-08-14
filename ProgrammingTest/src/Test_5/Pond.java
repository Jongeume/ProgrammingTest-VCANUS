package Test_5;

public class Pond {

	private static  int ROW = 10;
	private static  int COL = 10;
	private static  String ONE = " 1 ";
	private static  String TWO = " 2 ";
	private static  String THREE = " 3 ";
	private static  String FOUR = " 4 ";
	private String pondArr[][] = null;

	public static void main(String[] args) {

		Pond pond = new Pond();
		pond.setInit();
		pond.printPond();
	}

	// 생성자
	public Pond() {
		pondArr = new String[ROW][COL];
	}
	
	// 초기값
	private void setInit() {
		for (int i = 0; i < ROW; i++) {
			for (int j = 0; j < COL; j++) {
				pondArr[i][j] = " 0 ";
			}
		}
		for (int i = 1; i <= 9; i++) {

			switch (i) {
			case 1:
				pondArr[i][4] = ONE;
				break;
			case 2:
				for (int j = 3; j <= 5; j++) {
					pondArr[i][j] = ONE;
				}
				break;
			case 3:
				for (int j = 1; j <= 6; j++) {
					pondArr[i][j] = ONE;
				}
				break;

			case 4:
				for (int j = 1; j <= 8; j++) {
					pondArr[i][j] = ONE;
				}
				break;
			case 5:
				for (int j = 1; j <= 8; j++) {
					pondArr[i][j] = ONE;
				}
				break;

			case 6:
				for (int j = 2; j <= 7; j++) {
					pondArr[i][j] = ONE;
				}
				break;

			case 7:
				for (int j = 3; j <= 6; j++) {
					pondArr[i][j] = ONE;
				}
				break;
			case 8:
				pondArr[i][4] = ONE;
				break;

			}

		}
	}

	// 숫자 존재 여부 판단
	private boolean exist1(int row, int col) {
		// ArrayIndexOutOfBoundsException 예방
		if (row < 0 || row >= ROW || col < 0 || col >= COL) {
			return false;
		}
		return pondArr[row][col].equals(ONE);
	}

	private boolean exist2(int row, int col) {
		if (row < 0 || row >= ROW || col < 0 || col >= COL) {
			return false;
		}
		return pondArr[row][col].equals(TWO);
	}

	private boolean exist3(int row, int col) {
		if (row < 0 || row >= ROW || col < 0 || col >= COL) {
			return false;
		}
		return pondArr[row][col].equals(THREE);
	}

	private boolean exist4(int row, int col) {
		if (row < 0 || row >= ROW || col < 0 || col >= COL) {
			return false;
		}
		return pondArr[row][col].equals(FOUR);
	}

	
	// 해당 배열 기준 자기 자신을 제외한 상,하,좌,우 깊이를 비교하여 카운팅한다.
	private int getNumber(int row, int col) {
		int mineCnt = 0;
		if (exist1(row - 1, col))
			mineCnt++;
		if (exist1(row, col - 1))
			mineCnt++;
		if (exist1(row, col + 1))
			mineCnt++;
		if (exist1(row + 1, col))
			mineCnt++;

		if (exist2(row - 1, col))
			mineCnt++;
		if (exist2(row, col - 1))
			mineCnt++;
		if (exist2(row + 1, col))
			mineCnt++;
		if (exist2(row, col + 1))
			mineCnt++;

		int cnt = 0;
		//좌,우,상,하 모두 자신보다 깊이가 같거나 크면 현재 셀의 깊이 1 증가
		if (mineCnt == 4) {
			cnt = 2;
		}
		return cnt;
	}

	private int getNumber2(int row, int col) {
		int mineCnt = 0;
		if (exist2(row - 1, col))
			mineCnt++;
		if (exist2(row, col - 1))
			mineCnt++;
		if (exist2(row, col + 1))
			mineCnt++;
		if (exist2(row + 1, col))
			mineCnt++;

		if (exist3(row - 1, col))
			mineCnt++;
		if (exist3(row, col - 1))
			mineCnt++;
		if (exist3(row + 1, col))
			mineCnt++;
		if (exist3(row, col + 1))
			mineCnt++;

		int cnt = 0;

		if (mineCnt == 4) {
			cnt = 3;
		}
		return cnt;
	}

	private int getNumber3(int row, int col) {
		int mineCnt = 0;
		if (exist3(row - 1, col))
			mineCnt++;
		if (exist3(row, col - 1))
			mineCnt++;
		if (exist3(row, col + 1))
			mineCnt++;
		if (exist3(row + 1, col))
			mineCnt++;

		if (exist4(row - 1, col))
			mineCnt++;
		if (exist4(row, col - 1))
			mineCnt++;
		if (exist4(row + 1, col))
			mineCnt++;
		if (exist4(row, col + 1))
			mineCnt++;

		int cnt = 0;

		if (mineCnt == 4) {
			cnt = 4;
		}
		return cnt;
	}

	// 숫자 주입
	private void setNumber(int row, int col) {
		if (pondArr[row][col].equals(ONE) && getNumber(row, col) != 0) {
			pondArr[row][col] = " " + getNumber(row, col) + " ";
		}
	}

	private void setNumber2(int row, int col) {
		if (pondArr[row][col].equals(TWO) && getNumber2(row, col) != 0) {
			pondArr[row][col] = " " + getNumber2(row, col) + " ";
		}
	}

	private void setNumber3(int row, int col) {
		if (pondArr[row][col].equals(THREE) && getNumber3(row, col) != 0) {
			pondArr[row][col] = " " + getNumber3(row, col) + " ";
		}
	}

	// 연못 배열 출력
	private void printPond() {
		System.out.println("초기값");
		for (int i = 0; i < ROW; i++) {
			for (int j = 0; j < COL; j++) {
				System.out.print(pondArr[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < ROW; i++) {
			for (int j = 0; j < COL; j++) {
				setNumber(i, j);
			}
		}
		for (int i = 0; i < ROW; i++) {
			for (int j = 0; j < COL; j++) {
				setNumber2(i, j);
			}
		}
		System.out.println("출력값");
		int one = 0, two = 0, three = 0, four = 0;
		for (int i = 0; i < ROW; i++) {
			for (int j = 0; j < COL; j++) {
				setNumber3(i, j);
				if (pondArr[i][j].equals(ONE)) {
					one++;
				} else if (pondArr[i][j].equals(TWO)) {
					two++;
				} else if (pondArr[i][j].equals(THREE)) {
					three++;
				} else if (pondArr[i][j].equals(FOUR)) {
					four++;
				}
				System.out.print(pondArr[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("one: "+one+", two: "+two+", three: "+three+", four: "+four);

		System.out.println();
		int result = one + two*2 + three*3 + four*4;
		System.out.println("연못 깊이의 총합 : "+result);
	}
}
