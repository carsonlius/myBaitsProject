package com.carsonlius;

import java.util.Date;
import java.util.Objects;

public class Letter {
    char c;

    static Date date = new Date();

    static {
        System.out.println("letter static function");
    }

    public Letter() {
        System.out.println("letter 无参数构造函数");
    }

    public Letter(char c) {
        this.c = c;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Letter letter = (Letter) o;
        return c == letter.c;
    }

    @Override
    public int hashCode() {
        return Objects.hash(c);
    }
}
