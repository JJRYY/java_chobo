package java_chobo.ch08;

import java.io.File;
import java.io.IOException;

import javax.swing.JOptionPane;

public class ExceptionEx15 {


	public static void main(String[] args) {
		String res = JOptionPane.showInputDialog("파일 명을 입력하세요");
		File f;
		String msg;
		
		try {
			f = createFile(res);
			msg = String.format(f.getName() + " 파일이 생성되었습니다.");
		} catch (Exception e) {
			msg = String.format(e.getMessage() + "다시 입력해 주세요.");
		}
		JOptionPane.showMessageDialog(null, msg);
	}

	private static File createFile(String fileName) throws Exception {
		
		if (fileName == null || fileName.equals("")) {
			throw new Exception("파일 이름이 유효하지 않습니다.");
		}

		File f = new File(fileName);
		f.createNewFile();

		return f;
	
		
	}

	
}
