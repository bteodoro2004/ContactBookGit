package contactBook;

import contactBook.Contact;

public interface ContactInterface {

    String getName();

    int getPhone();

    String getEmail();

    void setPhone(int phone);

    void setEmail(String email);

    boolean equals(Contact otherContact);
}
