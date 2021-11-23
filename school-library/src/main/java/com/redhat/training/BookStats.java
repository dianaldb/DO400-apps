package com.redhat.training;

import com.redhat.training.books.Book;

public class BookStats {

    public static int countWords(Book book) {
        if (book.text.isEmpty()) {
            return 0;
        }
	else
	{
        return book.text.split("\\s+").length;
}
    }
}
