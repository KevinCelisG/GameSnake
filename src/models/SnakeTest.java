package models;

import static org.junit.jupiter.api.Assertions.*;

class SnakeTest {

    private Snake snake;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        snake = new Snake();
    }

    @org.junit.jupiter.api.Test
    void addPartOfSnake() {
        snake.addPartOfSnake();
        assertEquals(snake.getALBodySnake().get(snake.getALBodySnake().size() - 1).getPositionX(), (short) 20);
        assertEquals(snake.getALBodySnake().get(snake.getALBodySnake().size() - 1).getPositionY(), (short) 10);

        snake.followTheNextPart();
        snake.moveSnake(Moves.RIGHT);
        assertEquals(snake.getALBodySnake().get(0).getPositionX(), (short) 30);
        assertEquals(snake.getALBodySnake().get(0).getPositionY(), (short) 20);

        assertEquals(snake.getALBodySnake().get(snake.getALBodySnake().size() - 1).getPositionX(), (short) 20);
        assertEquals(snake.getALBodySnake().get(snake.getALBodySnake().size() - 1).getPositionY(), (short) 20);

        snake.followTheNextPart();
        snake.moveSnake(Moves.DOWN);
        assertEquals(snake.getALBodySnake().get(0).getPositionX(), (short) 30);
        assertEquals(snake.getALBodySnake().get(0).getPositionY(), (short) 30);

        assertEquals(snake.getALBodySnake().get(snake.getALBodySnake().size() - 1).getPositionX(), (short) 30);
        assertEquals(snake.getALBodySnake().get(snake.getALBodySnake().size() - 1).getPositionY(), (short) 20);

        snake.followTheNextPart();
        snake.moveSnake(Moves.LEFT);
        assertEquals(snake.getALBodySnake().get(0).getPositionX(), (short) 20);
        assertEquals(snake.getALBodySnake().get(0).getPositionY(), (short) 30);

        assertEquals(snake.getALBodySnake().get(snake.getALBodySnake().size() - 1).getPositionX(), (short) 30);
        assertEquals(snake.getALBodySnake().get(snake.getALBodySnake().size() - 1).getPositionY(), (short) 30);

        snake.followTheNextPart();
        snake.moveSnake(Moves.UP);
        assertEquals(snake.getALBodySnake().get(0).getPositionX(), (short) 20);
        assertEquals(snake.getALBodySnake().get(0).getPositionY(), (short) 20);

        assertEquals(snake.getALBodySnake().get(snake.getALBodySnake().size() - 1).getPositionX(), (short) 20);
        assertEquals(snake.getALBodySnake().get(snake.getALBodySnake().size() - 1).getPositionY(), (short) 30);
    }
}