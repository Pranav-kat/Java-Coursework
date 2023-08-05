package package2;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class filehandling{
	public static void main(String[] args) {
		File file = new File("text.txt");
		File file2 = new File("abc,txt");
		
		
//		BufferedInputStream bis = new BufferedInputStream(file);      ----- Buffered input stream
//		BufferedOutputStream bos = new BufferedOutputStream(file2);
		
		
//		FileReader fr = new FileReader(file);        ---- File reader
//		FileWriter fw = new FileWriter(file2);
		
		
		FileInputStream fis = new FileInputStream(file);    //----- File input stream
		FileOutputStream fos = new FileOutputStream(file);
		
		try {int temp;
		//FileInputStream fis;
		while((temp= fis.read())!=-1) {
			fos.write((char)temp);
		}
		
		fis.close();
		fos.close();
	}finally {
		
	}
	

	}
