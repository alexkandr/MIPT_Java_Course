package com.company;

/**
 * An optional-like object that contains two values;
 * @param <T1>
 * @param <T2>
 * </T1> - the type of the first value;
 * </T2> - the type of the second value;
 */
public final class Pair<T1, T2>
{
    /**
     * if non-null, the value. If null, indicates no value is present
     */
    private T1 first;

    /**
     * if non-null, the value. If null, indicates no value is present
     */
    private T2 second;

    /**
     *
     * @param first
     * @param second
     * Returns a Pair with two non-null values;
     * </T1> - type of the first value;
     * </T2> - type of the second value;
     */
    private Pair(T1 first, T2 second)
    {
        this.setFirst(first);
        this.setSecond(second);
    }

    /**
     * Returns an empty Pair instance. No value is present for this Optional;
     */
    private Pair()
    {
        this.setFirst(null);
        this.setSecond(null);
    }

    /**
     * Returns a Pair with null values;
     * @param <T1>
     * @param <T2>
     * @return a Pair with null values;
     */
    public static <T1, T2> Pair<T1, T2> of ()
    {
        return new Pair<T1, T2>();
    }

    /**
     * Returns a Pair describing the given value.
     * @param <T1>
     * @param <T2>
     * </T1> - type of the first value;
     * </T2> - type of the second value;
     * @return an Pair with a present value.
     */
    public static <T1, T2> Pair<T1, T2> of (T1 first, T2 second)
    {
        return new Pair<T1, T2>(first, second);
    }

    /**
     * Returns first element of the Pair.
     * @return first value of Pair;
     */
    public T1 getFirst()
    {
        return first;
    }

    /**
     * Returns second element of the Pair.
     * @return second value of Pair;
     */
    public T2 getSecond()
    {
        return second;
    }

    /**
     * Sets first element of the Pair.
     * @param first
     */
    public void setFirst(T1 first)
    {
        this.first = first;
    }

    /**
     * Sets second element of the Pair.
     * @param second
     */
    public void setSecond(T2 second)
    {
        this.second = second;
    }

    /**
     * Indicates whether some other object is "equal to" this Optional. The other object is considered equal if:
     * 1.it is also a Pair and;
     * 2.both instances have no value present or;
     * 3.the present values are "equal to" each other via equals().
     * @param object an object to be tested for equality
     * @return true if the other object is "equal to" this object otherwise false
     */
    @Override
    public boolean equals(Object object)
    {
        if (object == null || object.getClass() != getClass()) return false;
        else
        {
            Pair<T1, T2> pair = (Pair<T1, T2>) object;
            boolean firstEquals = (getFirst() == null) ? (pair.getFirst() == null) : (getFirst().equals(pair.getFirst()));
            boolean secondEquals = (getSecond() == null) ? (pair.getSecond() == null) : (getSecond().equals(pair.getSecond()));
            return (firstEquals && secondEquals);
        }
    }

    /**
     * Returns the hash code of the value, if present, otherwise 0 (zero) if no value is present.
     * @return hash code value of the present value or 0 if no value is present;
     */
    @Override
    public int hashCode()
    {
        Object firstElem = getFirst();
        Object secondElem = getSecond();
        if (firstElem == null && secondElem == null) return 0;
        int firstElemHash = (firstElem == null) ? Integer.MIN_VALUE : firstElem.hashCode();
        int secondElemHash = (secondElem == null) ? Integer.MIN_VALUE : secondElem.hashCode();
        return ((firstElemHash) ^ (secondElemHash) >>> 16);
    }

    /**
     * Returns a non-empty string representation of this Optional
     * @return the string representation of this instance
     */
    public String toString()
    {
        if(getFirst() == null && getSecond() == null) return String.format("(%1$s, %2$s)", null, null);
        else if (getFirst() == null && getSecond() != null) return String.format("(%1$s, %2$s)", null, getSecond().toString());
        else if (getFirst() != null && getSecond() == null) return String.format("(%1$s, %2$s)", getFirst().toString(), null);
        else return String.format("(%1$s, %2$s)", getFirst().toString(), getSecond().toString());
    }

}
