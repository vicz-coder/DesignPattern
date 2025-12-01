package org.self.learn.structural.flyweight;

public class ChessComponent implements ChessPiece{

    private String name;
    private String color;
    private String icon;

    public ChessComponent(String name, String color, String icon) {
        this.name = name;
        this.color = color;
        this.icon = icon;
    }

    @Override
    public void position(int x, int y) {
        System.out.println(this.name+" with color "+this.color+"("+this.icon+") Is At ["+x+","+y+"]" );
    }
}
