package im.alz.chapter9.Music4;//: interfaces/music4/im.alz.chapter9.Music4.Music4.java
// Abstract classes and methods.
//package interfaces.music4;
//import Sandwich.music.im.alz.chapter9.Music4.Note;

abstract class Instrument {
    private int i; // Storage allocated for each
    public abstract void play(Note n);
    public String what() { return "im.alz.chapter9.Music4.Instrument"; }
    public abstract void adjust();
}

class Wind extends Instrument {
    public void play(Note n) {
        System.out.println("im.alz.chapter9.Music4.Wind.play() " + n);
    }
    public String what() { return "im.alz.chapter9.Music4.Wind"; }
    public void adjust() {}
}

class Percussion extends Instrument {
    public void play(Note n) {
        System.out.println("im.alz.chapter9.Music4.Percussion.play() " + n);
    }
    public String what() { return "im.alz.chapter9.Music4.Percussion"; }
    public void adjust() {}
}

class Stringed extends Instrument {
    public void play(Note n) {
        System.out.println("im.alz.chapter9.Music4.Stringed.play() " + n);
    }
    public String what() { return "im.alz.chapter9.Music4.Stringed"; }
    public void adjust() {}
}

class Brass extends Wind {
    public void play(Note n) {
        System.out.println("im.alz.chapter9.Music4.Brass.play() " + n);
    }
    public void adjust() { System.out.println("im.alz.chapter9.Music4.Brass.adjust()"); }
}

class Woodwind extends Wind {
    public void play(Note n) {
        System.out.println("im.alz.chapter9.Music4.Woodwind.play() " + n);
    }
    public String what() { return "im.alz.chapter9.Music4.Woodwind"; }
}

public class Music4 {
    // Doesn't care about type, so new types
    // added to the system still work right:
    static void tune(Instrument i) {
        // ...
        i.play(Note.MIDDLE_C);
    }
    static void tuneAll(Instrument[] e) {
        for(Instrument i : e)
            tune(i);
    }
    public static void main(String[] args) {
        // Upcasting during addition to the array:
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };
        tuneAll(orchestra);
    }
} /* Output:
im.alz.chapter9.Music4.Wind.play() MIDDLE_C
im.alz.chapter9.Music4.Percussion.play() MIDDLE_C
im.alz.chapter9.Music4.Stringed.play() MIDDLE_C
im.alz.chapter9.Music4.Brass.play() MIDDLE_C
im.alz.chapter9.Music4.Woodwind.play() MIDDLE_C
*///:~
