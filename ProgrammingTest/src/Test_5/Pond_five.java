package Test_5;

public class Pond_five {

	private static int ROW = 10;
	private static int COL = 10;
	private int pondArr[][] = new int[ROW][COL];
	private int pondArr2[][] = new int[ROW][COL];

	public static void main(String[] args) {

		Pond_five pond = new Pond_five();
		pond.setPond();
		pond.updatePond();
		pond.printPond();
		pond.depthSum();
	}

	// 초기값
	private void setPond() {

		for (int i = 0; i <= 9; i++) {

			switch (i) {
			case 0:
				for (int j = 4; j <= 4; j++) {
					pondArr[i][j] = 1;
				}
				break;

			case 1:
				for (int j = 3; j <= 5; j++) {
					pondArr[i][j] = 1;
				}
				break;
			case 2:
				for (int j = 2; j <= 6; j++) {
					pondArr[i][j] = 1;
				}
				break;
			case 3:
				for (int j = 1; j <= 7; j++) {
					pondArr[i][j] = 1;
				}
				break;

			case 4:
				for (int j = 0; j <= 8; j++) {
					pondArr[i][j] = 1;
				}
				break;
			case 5:
				for (int j = 1; j <= 7; j++) {
					pondArr[i][j] = 1;
				}
				break;

			case 6:
				for (int j = 2; j <= 6; j++) {
					pondArr[i][j] = 1;
				}
				break;

			case 7:
				for (int j = 3; j <= 5; j++) {
					pondArr[i][j] = 1;
				}
				break;
			case 8:
				for (int j = 4; j <= 4; j++) {
					pondArr[i][j] = 1;
				}
				break;
			case 9:
		
				break;
			}

		}

		// 초기값
		for (int i = 0; i < ROW; i++) {
			for (int j = 0; j < COL; j++) {
				pondArr2[i][j] = pondArr[i][j];
			}
		}

	}

	// *************** 수정 시작 ***************

	// 숫자 존재 여부 판단
	private boolean exist1(int row, int col, int t) {
		// ArrayIndexOutOfBoundsException 예방
		if (row < 0 || row >= ROW || col < 0 || col >= COL) {
			return false;
		}
		if (pondArr[row][col] == t) {
			return true;
		}
		return false;
	}

	private boolean exist2(int row, int col, int t) {
		if (row < 0 || row >= ROW || col < 0 || col >= COL) {
			return false;
		}
		if (pondArr[row][col] == t + 1) {
			return true;
		}

		return false;
	}

	// 해당 배열 기준 자기 자신을 제외한 상,하,좌,우 깊이를 비교하여 카운팅한다.
	private int getNumber(int row, int col, int t) {
		int mineCnt = 0;

		if (exist1(row - 1, col, t))
			mineCnt++;
		if (exist1(row, col - 1, t))
			mineCnt++;
		if (exist1(row, col + 1, t))
			mineCnt++;
		if (exist1(row + 1, col, t))
			mineCnt++;

		if (exist2(row - 1, col, t))
			mineCnt++;
		if (exist2(row, col - 1, t))
			mineCnt++;
		if (exist2(row + 1, col, t))
			mineCnt++;
		if (exist2(row, col + 1, t))
			mineCnt++;

		int cnt = 0;
		// 좌,우,상,하 모두 자신보다 깊이가 같거나 크면 현재 셀의 깊이 1 증가
		if (mineCnt == 4) {
			cnt = t + 1;
		}
		return cnt;
	}

	// 숫자 주입
	private void setNumber(int row, int col, int t) {
		if (pondArr[row][col] == t && getNumber(row, col, t) != 0) {
			pondArr[row][col] = getNumber(row, col, t);
		}
	}

	// 배열 값 업데이트
	private void updatePond() {
		for (int t = 1; t <= ROW / 2; t++) {
			for (int i = 0; i < ROW; i++) {
				for (int j = 0; j < COL; j++) {
					setNumber(i, j, t);
				}
			}
		}

	}

	// 연못 배열 출력
	private void printPond() {
		System.out.println("초기값");
		for (int i = 0; i < ROW; i++) {
			for (int j = 0; j < COL; j++) {
				System.out.print(pondArr2[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("출력값");

		for (int i = 0; i < ROW; i++) {
			for (int j = 0; j < COL; j++) {
				System.out.print(pondArr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();

	}

	// 연못의 깊이 총합
	private void depthSum() {
		int number[] = new int[5];

		for (int i = 0; i < ROW; i++) {
			for (int j = 0; j < COL; j++) {
				for (int c = 1; c <= ROW / 2; c++) {
					if (pondArr[i][j] == c) {
						number[c - 1]++;
					}
				}
			}
		}

		System.out.println(
				"one: " + number[0] + ", two: " + number[1] + ", three: " + number[2] + ", four: " + number[3] + ", five : "+ number[4]);

		System.out.println();
		int result = 0;

		for (int i = 1; i <= ROW / 2; i++) {
			result += number[i - 1] * (i);
		}
		System.out.println("연못 깊이의 총합 : " + result);
	}

// *************** 수정 끝 ***************
}
