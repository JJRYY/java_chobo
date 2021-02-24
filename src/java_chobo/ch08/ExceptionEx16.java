package java_chobo.ch08;

public class ExceptionEx16 {

	public static void main(String[] args) {
		try {
			startInstall();
			copyFiles();
			System.out.println("프로그램 설치 완료");
		} catch (SpaceException e) {
			System.out.println("에러 메시지 : " + e.getMessage());
			e.printStackTrace();
			System.out.println("공간을 확보한 후에 다시 설치하시기 바랍니다.");
		} catch (MemoryException e) {
			System.out.println("에러 메시지 : " + e.getMessage());
			e.printStackTrace();
			System.gc();
			System.out.println("다시 설치를 시도하세요.");
		} finally {
			deleteTempFile();
		}

	}

	private static void startInstall() throws SpaceException, MemoryException {
		// 하드디스크 공간이 충분한지 체크
		if (!isEnoughSpace()) {
			throw new SpaceException("설치할 공간이 부족합니다.");
		}
		// 메모리 공간이 충분한지 체크
		if (!isEnoughMemory()) {
			throw new MemoryException("메모리가 부족합니다.");
		}
	}
	
	private static boolean isEnoughMemory() {
		// 메모리 공간이 충분하지 체크
		return true;
	}

	private static boolean isEnoughSpace() {
		// false 하드디스크 용량이 충분하지 않음
		return true;
	}

	private static void copyFiles() {
		System.out.println("파일을 copy합니다.");
	}
	
	private static void deleteTempFile() {
		System.out.println("임시 파일을 삭제합니다.");
	}


}
