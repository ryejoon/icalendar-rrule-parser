package com.ryejoon.irparser;

/**
 * from : inclusive
 * until : exclusive
 * Created by user on 2017-05-25.
 */
public class Range {
    private long from;
    private long until;

    public Range(long from, long until) {
        if (from > until) {
            throw new IllegalArgumentException(String.format("Invalid range : %s ~ %s", from, until));
        }
        this.from = from;
        this.until = until;
    }

    public long getFrom() {
        return from;
    }

    public long getUntil() {
        return until;
    }

    @Override
    public String toString() {
        return "Range{" +
                "from=" + from +
                ", until=" + until +
                '}';
    }
}
