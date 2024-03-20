package JavaSyntax.l139;

public class Monstr {
    int eye;
    int hand;
    int leg;

    public Monstr() {
    }

    public Monstr(int eye) {
        this.eye = eye;
    }

    public Monstr(int eye, int hand) {
        this.eye = eye;
        this.hand = hand;
    }

    public Monstr(int eye, int hand, int leg) {
        this.eye = eye;
        this.hand = hand;
        this.leg = leg;
    }

    void voice() {
        System.out.println("RRRrrrRR!");
    }

    void voice(int i) {
        for (int j = 0; j < i; j++) {
            System.out.println("RRRrrrRR!");
        }
    }

    void voice(int i, String word) {
        for (int j = 0; j < i; j++) {
            System.out.println(word);
        }


    }
}

