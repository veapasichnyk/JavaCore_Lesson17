public class Collection {
   private Number array[];

    Collection ( Number[] array ) {
        this.array = array;
    }

    public void setArray ( Number[] array ) {
        this.array = array;
    }

    public Number[] getArray ( ) {
        return array;
    }

    public class FromTheFirstToLast implements Iterator {
        int i = 0;
        @Override
        public boolean hasNext ( ) {
            return i < array.length;
        }

        @Override
        public Number next ( ) {
            Integer toInt = array[i].intValue();
            if (toInt % 2 == 1) {
                array[i] = 0;
            }
            return array[i++];
        }
        }

    public FromTheFirstToLast outputValueOfArray() {
        return new FromTheFirstToLast();
    }

    public class BackwardThroughOneDigit implements Iterator {

        int i = array.length - 1;
        @Override
        public boolean hasNext ( ) {
            return i >= 0;
        }

        @Override
        public Number next ( ) {
            i = i - 2;
            return array[i+2];
        }
    }

    public BackwardThroughOneDigit outputArray() {
        return new BackwardThroughOneDigit();
    }


}
