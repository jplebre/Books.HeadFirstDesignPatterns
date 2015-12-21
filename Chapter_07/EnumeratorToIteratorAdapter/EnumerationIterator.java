import java.util.*;

public class EnumerationIterator implements Iterator {
	Enumeration adaptedEnum;

	public EnumerationIterator(Enumeration adaptedEnum) {
		this.adaptedEnum = adaptedEnum;
	}

	public boolean hasNext() {
		return adaptedEnum.hasMoreElements();
	}

	public Object next() {
		return adaptedEnum.nextElement();
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}
}