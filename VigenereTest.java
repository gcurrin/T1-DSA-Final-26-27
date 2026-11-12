import static org.junit.jupiter.api.Assertions.*;

class VigenereTest {

    @org.junit.jupiter.api.Test
    void encipher() {
        Vigenere a = new Vigenere("x-----x 1 a"); // testing non alphabet characters

        assertEquals("y-----x 1 b", a.encipher("ba"));
        assertEquals("x-----x 1 a", a.encipher("aaaaa"));

        Vigenere b = new Vigenere(""); // testing empty word(empty key doesn't work
        assertEquals("", b.encipher("acasvc"));
        assertEquals("", b.encipher(""));

        Vigenere c = new Vigenere("HelloWorld"); // normal test ig
        assertEquals("sixzbhsdzq", c.encipher("lemon"));


    }
    @org.junit.jupiter.api.Test
    void decipher() {
        Vigenere a = new Vigenere("Hello World");
        assertEquals("", a.decipher("", "")); // empty test
        assertEquals("z-----z", a.decipher("a-----a", "b")); // non alphabet characters test
        assertEquals("hello world", a.decipher("sixzb hsdzq", "lemon")); // normal test
        assertEquals("hello - a - world", a.decipher("sixzb - l - aafyo", "lemon")); // mix of the above test


    }

}