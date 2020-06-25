import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.IntStream;

class AsciiCharSequence implements CharSequence/* extends/implements */
, AbstractCollection
{
    byte[] content;

    public AsciiCharSequence(byte[] content) {
        this.content = content.clone();
    }

    @Override
    public int length() {
        return content.length;
    }

    @Override
    public char charAt(int i) {
        return (char) (content[i]);
    }

    @Override
    public CharSequence subSequence(int i, int i1) {
        return new AsciiCharSequence(Arrays.copyOfRange(content.clone(), i, i1));
    }

    @Override
    public String toString() {
        StringBuilder temp = new StringBuilder();

        for (byte element : content) {
            temp.append((char) element);
        }
        return temp.toString();
    }

    @Override
    public IntStream chars() {
        return null;
    }

    @Override
    public IntStream codePoints() {
        return null;
    }
    // implementation
}
