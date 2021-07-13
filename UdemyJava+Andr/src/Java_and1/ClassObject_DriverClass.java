/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_and1;

/**
 *
 * @author HP
 */
public class ClassObject_DriverClass {
    public static void main(String[] args) {
        ClassObject_House house=new ClassObject_House(10,2,"Tiles","Brick");
        house.setNrOfDoors(3);
        house.setTypeOfWall("Plaster");
        System.out.println("House: ");
        System.out.println("Nr of windows: "+house.getNrOfWindows());
        System.out.println("Nr of doors: "+house.getNrOfDoors());
        System.out.println("Tyoe of wall: "+house.getTypeOfWall());
        System.out.println("Type of roof: "+house.getTypeOfRoof());
    }
}
