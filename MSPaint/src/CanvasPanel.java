/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author John
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import javax.swing.JPanel;

public class CanvasPanel extends JPanel implements MouseMotionListener
{
    int currentX;
    int currentY;
    int oldX;
    int oldY;
    Color color;
    int size;
    String shape;
    ArrayList<paintArray> paintArray;
    
    public CanvasPanel(ToolbarPanel t)
    {
        super();
        setDefaults();
    }
    
    public void setDefaults()
    {
        setBackground(color.WHITE);
        color = Color.BLACK;
        size = 1;
        shape = "circle";
        paintArray = new ArrayList();
    }
    
    public void paint (Graphics graphics) {
        super.paint(graphics);
        repaint();
        for (int i = 0; i < getPaint().size(); i++) {
            if (shape.equals("oval"))
            {
                graphics.fillOval(getPaint().get(i).getX(), getPaint().get(i).getY(), getPaint().get(i).getSize(), getPaint().get(i).getSize());
            }
            else if (shape.equals("rectangle"))
            {
                graphics.fillRect(getPaint().get(i).getX(), getPaint().get(i).getY(), getPaint().get(i).getSize(), getPaint().get(i).getSize());
            }
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {
       setCurrentX(e.getX());
       setCurrentY(e.getY());
       getPaint().add(new paintArray(getCurrentX(), getCurrentY(), getColor(), getSizes(), getShape()));
    }

    @Override
    public void mouseMoved(MouseEvent e) {
       setOldX(e.getX());
       setOldY(e.getY());
    }
    
    public ArrayList<paintArray> getPaint() {
        return paintArray;
    }
    
    public void setPaintArray(ArrayList<paintArray> paintArray){
        this.paintArray = paintArray;
    }
    
    public String getShape() {
        return shape;
    }
    
    public void setShape(String shape){
        this.shape = shape;
    }
    
    public Color getColor() {
        return color;
    }
    
    public void setColor(Color color){
        this.color = color;
    }
    
    public int getSizes() {
        return size;
    }
    
    public void setSizes(int size){
        this.size = size;
    }

    public int getOldX() {
        return oldX;
    }
    
    public void setOldX(int oldX) {
        this.oldX = oldX;
    }
    
    public int getOldY() {
        return oldX;
    }
    
    public void setOldY(int oldY) {
        this.oldY = oldY;
    }
    
    public int getCurrentX() {
        return currentX;
    }
    
    public void setCurrentX(int currentX) {
        this.currentX = currentX;
    }
     public int getCurrentY() {
        return currentY;
    }
    
    public void setCurrentY(int currentY) {
        this.currentY = currentY;
    }
    
    public void marker()
    {
        setShape("oval");
        getPaint().add(new paintArray(getCurrentX(), getCurrentY(), getColor(), getSizes(), getShape()));
    }
    public void pencil()
    {
        setShape("rectangle");
        getPaint().add(new paintArray(getCurrentX(), getCurrentY(), getColor(), getSizes(), getShape()));
    }
}
