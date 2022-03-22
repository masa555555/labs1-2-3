package labs.lab3;

public abstract class Piece {
    // Field
    private int value;
    protected boolean isWhite;

    // constracter
    public Piece(int value, boolean isWhite) {
        this.value = value;
        this.isWhite = isWhite;
    }
    // methods
    public final int getValue(){
        return value;
    }

    public final void setValue(int value) {
        this.value = value;
    }

    public abstract void move();

    @Override
    public boolean equals(Object o) {
       if (this == o) return true;
       if (o == null || getClass () != o.getClass()) return false;
       Piece piece = (Piece) o;
       return value == piece.value &&
               isWhite == piece.isWhite;
    }
}


