package uzdaviniai;

import java.util.Scanner;

public class LyginisNelyginis {

    private int _a;

    public int get_a() {
        return _a;
    }

    public void set_a(int _a) { this._a = _a;}

    public void skaiciuok() {
        if (_a % 2 == 0) {
            System.out.println("Skaicius yra lyginis");
        } else {
            System.out.println("Skaicius nera lyginis");
        }
    }
}
