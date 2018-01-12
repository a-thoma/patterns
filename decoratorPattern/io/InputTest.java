import java.io.*;

public class InputTest {

	public static void main(String[] args) {

		int c;

		try {

			/* create a new InputStream wrapped as follows */
			InputStream in =
				new LowerCaseInputStream( /* forced lowercase */
					new BufferedInputStream (
						new FileInputStream("test.txt")));

				while((c = in.read()) >= 0) {

					System.out.print((char)c);
				}
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}