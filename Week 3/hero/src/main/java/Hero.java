import com.googlecode.lanterna.TextCharacter;
import com.googlecode.lanterna.screen.Screen;


import java.io.IOException;

public class Hero {
    private int x;
    private int y;

    public Hero(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void moveUp() {
        y--;
    }

    public void moveDown() {
        y++;
    }

    public void moveRight() {
        x++;
    }

    public void moveLeft() {
        x--;
    }

    public void draw(Screen screen) throws IOException {
        screen.clear();
        screen.setCharacter(x, y, TextCharacter.fromCharacter('X') [0]);
        screen.refresh();
    }
}
