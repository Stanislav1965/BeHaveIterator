

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected int min;
    protected int max;
    protected Random random;

    public Randoms(int min, int max) {
        this.max = max;
        this.min = min;
        random = new Random();
    }

    @NotNull
    @Override
    public Iterator<Integer> iterator() {
        return new IntegerIterator();
    }

    private class IntegerIterator implements Iterator<Integer> {

        @Override
        public boolean hasNext() {
            return true;
        }

        @Override
        public Integer next() {
            return random.nextInt(max - min + 1) + min;
        }
    }
}