package com.ranaji;

public class Book {

	String writerName;
	String bookName;
	String publicationName;

	public String getWriterName() {
		return writerName;
	}

	public void setWriterName(String writerName) {
		this.writerName = writerName;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getPublicationName() {
		return publicationName;
	}

	public void setPublicationName(String publicationName) {
		this.publicationName = publicationName;
	}

	@Override
	public String toString() {
		return "Book{" +
				"writerName='" + writerName + '\'' +
				", bookName='" + bookName + '\'' +
				", publicationName='" + publicationName + '\'' +
				'}';
	}
}
