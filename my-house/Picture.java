/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kolling and David J. Barnes
 * @version 2011.07.31
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Square campo;
    private Circle moveSun;
    private Person persona;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        wall = new Square();
        wall.moveHorizontal(-140);
        wall.moveVertical(20);
        wall.changeSize(120);
        wall.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(-120);
        window.moveVertical(40);
        window.changeSize(40);
        window.makeVisible();
        
        campo = new Square();
        campo.changeColor("green");
        campo.moveHorizontal(-350);
        campo.moveVertical(140);
        campo.changeSize(4000);
        campo.makeVisible();

        roof = new Triangle();  
        roof.changeSize(60, 180);
        roof.moveHorizontal(20);
        roof.moveVertical(-60);
        roof.makeVisible();

        moveSun = new Circle();
        moveSun.changeColor("yellow");
        moveSun.moveHorizontal(100);
        moveSun.moveVertical(-40);
        moveSun.changeSize(80);
        moveSun.makeVisible();
        moveSun.slowMoveVertical(90);
        moveSun.slowMoveVertical(-90);
        moveSun.slowMoveVertical(90);
        moveSun.slowMoveVertical(-90);
        moveSun.slowMoveVertical(90);
        moveSun.slowMoveVertical(-90);
        
        persona = new Person();
        persona.makeVisible();
        persona.moveHorizontal(-300);
        persona.moveVertical(30);
        persona.slowMoveHorizontal(200);
        
        
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            moveSun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            moveSun.changeColor("yellow");
        }
    }
}
