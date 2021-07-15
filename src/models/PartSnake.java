package models;

public class PartSnake {

    private short positionX;
    private short positionY;
    private Moves moves;

    public PartSnake(short positionX, short positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
        moves = Moves.DOWN;
    }

    public Moves getMoves() {
        return moves;
    }

    public void setMoves(Moves moves) {
        this.moves = moves;
    }

    public void movePart() {
        switch (moves) {
            case UP:
                setPositionY((short) (getPositionY() - ModelsConstants.LENGTH_PART_SNAKE));
                break;
            case DOWN:
                setPositionY((short) (getPositionY() + ModelsConstants.LENGTH_PART_SNAKE));
                break;
            case RIGHT:
                setPositionX((short) (getPositionX() + ModelsConstants.LENGTH_PART_SNAKE));
                break;
            case LEFT:
                setPositionX((short) (getPositionX() - ModelsConstants.LENGTH_PART_SNAKE));
                break;
        }
    }

    public short getPositionX() {
        return positionX;
    }

    public void setPositionX(short positionX) {
        this.positionX = positionX;
    }

    public short getPositionY() {
        return positionY;
    }

    public void setPositionY(short positionY) {
        this.positionY = positionY;
    }
}
