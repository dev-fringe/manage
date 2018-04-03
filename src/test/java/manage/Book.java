package manage;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("book")
public class Book {
	@XStreamAlias("title")
	private String title;
	
	@XStreamAlias("author")
	private String author;
	
	@XStreamAlias("pages-count")
	private int pagesCount;//this can also be Integer or any other numeric type

	private String fieldThatIsNotInTheXml = "field not in xml";

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", pagesCount="
				+ pagesCount + ", fieldThatIsNotInTheXml="
				+ fieldThatIsNotInTheXml + "]";
	}
}
