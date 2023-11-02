class Exp7 {
    int rno;

    void getRno() {
        rno = 10;
    }

    void putRno() {
        System.out.println("Roll no: " + rno);
    }
}

class Test extends Exp7 {
    int m1, m2;

    void getMarks() {
        m1 = 70;
        m2 = 80;
    }

    void putMarks() {
        System.out.println("Marks 1: " + m1);
        System.out.println("Marks 2: " + m2);
    }
}

interface Sports {
    int score = 90;

    public void putScore();
}

class Result extends Test implements Sports {
    int total;

    void display() {
        total = m1 + m2 + score;
        putRno();
        putMarks();
        System.out.println("Total is: " + total);
        putScore();
    }

    public void putScore() {
        System.out.println("Score is: " + score);
    }
}

public class inheritance {
    public static void main(String args[]) {
        Result r1 = new Result();
        r1.getRno();
        r1.getMarks();
        r1.display();
    }
}
