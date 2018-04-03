package manage;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import com.thoughtworks.xstream.converters.extended.ToAttributedValueConverter;

@XStreamAlias("entry")
@XStreamConverter(value = ToAttributedValueConverter.class, strings = { "text" })
class Entry {
	private String key;
	private String text;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String toString() {
		return "Entry [key=" + key + ", text=" + text + "]";
	}

}
