package models;

import java.util.ArrayList;

public class Snake {

    private ArrayList<PartSnake> aLBodySnake;

    public Snake() {
        aLBodySnake = new ArrayList<>();
        initPositionSnake();
    }

    private void initPositionSnake() {
        aLBodySnake.add(new PartSnake((short) 20, (short) 20));
    }

    public void followTheNextPart() {
        for (int i = aLBodySnake.size() - 1; i > 0; i--) {
            aLBodySnake.get(i).setMoves(aLBodySnake.get(i - 1).getMoves());
        }
    }

    public void moveSnake(Moves moves) {
        aLBodySnake.get(0).setMoves(moves);
        aLBodySnake.get(0).movePart();
    }

    public void addPartOfSnake() {
        PartSnake partSnakeLast = aLBodySnake.get(aLBodySnake.size() - 1);
        PartSnake partSnakeNewLast = new PartSnake(partSnakeLast.getPositionX(), partSnakeLast.getPositionY());
        switch (aLBodySnake.get(aLBodySnake.size() - 1).getMoves()) {
            case UP:
                partSnakeNewLast.setPositionY((short) (partSnakeLast.getPositionY() + ModelsConstants.LENGTH_PART_SNAKE));
                break;
            case DOWN:
                partSnakeNewLast.setPositionY((short) (partSnakeLast.getPositionY() - ModelsConstants.LENGTH_PART_SNAKE));
                break;
            case RIGHT:
                partSnakeNewLast.setPositionX((short) (partSnakeLast.getPositionX() - ModelsConstants.LENGTH_PART_SNAKE));
                break;
            case LEFT:
                partSnakeNewLast.setPositionX((short) (partSnakeLast.getPositionX() + ModelsConstants.LENGTH_PART_SNAKE));
                break;
        }
        aLBodySnake.add(partSnakeNewLast);
    }

    public ArrayList<PartSnake> getALBodySnake() {
        return new ArrayList<>(aLBodySnake);
    }
}
