package java_chobo.ch08;

import java.io.File;
import java.io.IOException;

import javax.swing.JOptionPane;

public class ExceptionEx14 {


	public static void main(String[] args) {
		String res = JOptionPane.showInputDialog("파일 명을 입력하세요");
		System.out.println("res : " + res);
		File f = createFile(res);
		System.out.println(f.getName() + " 파일이 생성되었습니다.");

	}

	private static File createFile(String fileName) {
		System.out.println("fileName : " + fileName);
		File f;
		try {
			if (fileName == null || fileName.equals("")) {
				throw new Exception("파일 이름이 유효하지 않습니다.");
			}
		} catch (Exception e) {
				fileName = "제목없음.txt";
		} finally {
			f = new File(fileName);
			createNewFile(f);
		}

		return f;
	
		
	}

	private static void createNewFile(File f) {
		try {
			f.createNewFile();
		} catch (IOException e) {
		}
		
	}

}
