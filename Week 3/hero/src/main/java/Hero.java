import com.googlecode.lanterna.*;
import com.googlecode.lanterna.graphics.TextGraphics;
import java.io.IOException;

public class Hero {
    private Position position;
    public Hero(int x, int y) {
        this.position = new Position(x, y);
    }

    public Position moveUp() {
        //y--;
        return new Position(position.getX(), position.getY() - 1);
    }

    public Position moveDown() {
        //y++;
        return new Position(position.getX(), position.getY() + 1);
    }

    public Position moveRight() {
        //x++;
        return new Position(position.getX() + 1, position.getY());
    }

    public Position moveLeft() {
        //x--;
        return new Position(position.getX() - 1, position.getY());
    }

    public void draw(TextGraphics graphics) {
        graphics.setForegroundColor(TextColor.Factory.fromString("#FFFF33"));
        graphics.enableModifiers(SGR.BOLD);
        graphics.putString(new TerminalPosition(position.getX(), position.getY()), "X");
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
