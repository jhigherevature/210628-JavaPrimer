package filestreams;

/*
 * Most common streams that are used in Java come
 * from the Java.io (input-output) package 
 */
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class FileStreamSimulator {
	/*
	 * Here are two definitions of Streams in Java:
	 * 
	 * **General** : An entity which reads information from a
	 * source and can provide information to a target location
	 * based on the source input.
	 * 
	 * 'Exact' [Stream API] : A sequence of objects which support
	 * various methods that can be pipelined to produce a specific result.
	 * These methods will either be intermediate or terminal operations.
	 * Intermediate operations perform some action and produce a new
	 * Stream. While Terminal operations will result in a final output.
	 * 
	 * Note: Operations performed on a Stream will NOT effect the 
	 * original source data.
	 */
	
	private static FileOutputStream fos = null;
	private static FileInputStream fis = null;
	
	public static void main(String[] args) {
		System.out.println("::: Start of Application :::");
		
		try {
//			fosExample();
			fisExample();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("::: End of Application :::");
	}
	
	/*
	 * File Output streams allow you to write to a file
	 * location that is specified. We can put the path
	 * to the file (as it relates to the current project structure)
	 * in the constructor for the FileOutputStream Object
	 */
	private static void fosExample() throws IOException {
		fos = new FileOutputStream("files/myfile.txt");
		
		for (int i = 0; i < 5; i++) {
			for (char letter = 'A'; letter <= 'Z'; letter++) {
				fos.write(letter);
				
				if (letter == 'Z')
					fos.write('\n');
			}
		}
		
		/*
		 * Streams are resource intensive processes. And as such
		 * we should close the stream when we no longer require it
		 * in our program to save on those resources used
		 */
		if (fos != null)
			fos.close();
	}
	
	/*
	 * FileInputStreams allow you to read from a source location (file)
	 * and read the data, one byte at a time.
	 */
	private static void fisExample() throws IOException {
		fis = new FileInputStream("files/myfile.txt");
		byte in;
		
		while ((in = (byte)(fis.read())) != -1) {
			System.out.print((char)in);
		}
		
		/*
		 * Streams are resource intensive processes. And as such
		 * we should close the stream when we no longer require it
		 * in our program to save on those resources used
		 */
		if (fis != null)
			fis.close();
	}
}
