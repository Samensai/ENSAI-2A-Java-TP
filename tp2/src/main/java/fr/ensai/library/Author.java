package fr.ensai.library;

import java.util.Objects;

/**
 * Represents an Author.
 */
public class Author extends Student{

    // Attributes
    private String nationality;

    /**
     * Constructs a new Book object.
     */
    public Author(String name, int age, String nationality) {
        super(age, nationality)
        this.nationality = nationality;
    }

    public String getName() {
        return this.name;
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     * Two authors are considered equal if their names are equal.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        Author author = (Author) obj;
        return Objects.equals(name, author.name);
    }

    @Override
    public String toString() {
        return "Author " + name;
    }

}
