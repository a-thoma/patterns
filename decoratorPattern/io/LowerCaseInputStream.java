import java.io.*;

public class LowerCaseInputStream extends FilterInputStream {

	public LowerCaseInputStream(InputStream in) {

		/* hand off the InputStream in to the parent constructor */
		super(in);
	}

	/* reads one byte from 0 to 255 */
	public int read() throws IOException {

		int c = in.read();
		return (c == -1 ? c : Character.toLowerCase((char)c));
	}

	/* reads byte(s) at an offset of length len */
	public int read(byte[] b, int offset, int len) throws IOException {

		int result = in.read(b, offset, len);
		for (int i = offset; i < offset + result; i++) {

			b[i] = (byte)Character.toLowerCase((char)b[i]);
		}

		return result;
	}
}