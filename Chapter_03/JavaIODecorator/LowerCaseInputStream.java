import java.io.*;

public class LowerCaseInputStream extends FilterInputStream{
	public LowerCaseInputStream(InputStream in){
		super(in);
	}

	public int read() throws IOException {
		int c = super.read();
		if (c == -1) return c;
		else return Character.toLowerCase( (char)c );

	}
}
