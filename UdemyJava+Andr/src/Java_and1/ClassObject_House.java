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
public class ClassObject_House {
    private int nrOfWindows;
    private int nrOfDoors;
    private String typeOfRoof;
    private String typeOfWall;
    
    public ClassObject_House(){
        nrOfDoors=0;
        nrOfWindows=0;
        typeOfWall=null;
        typeOfRoof=null;  
    }
    public ClassObject_House(int nrOfWindows,int nrOfDoors,String typeOfRoof,String typeOfWall){
        this.nrOfWindows=nrOfWindows;
        this.nrOfDoors=nrOfDoors;
        this.typeOfRoof=typeOfRoof;
        this.typeOfWall=typeOfWall;
    }

    public int getNrOfWindows() {
        return nrOfWindows;
    }

    public void setNrOfWindows(int nrOfWindows) {
        this.nrOfWindows = nrOfWindows;
    }

    public int getNrOfDoors() {
        return nrOfDoors;
    }

    public void setNrOfDoors(int nrOfDoors) {
        this.nrOfDoors = nrOfDoors;
    }

    public String getTypeOfRoof() {
        return typeOfRoof;
    }

    public void setTypeOfRoof(String typeOfRoof) {
        this.typeOfRoof = typeOfRoof;
    }

    public String getTypeOfWall() {
        return typeOfWall;
    }

    public void setTypeOfWall(String typeOfWall) {
        this.typeOfWall = typeOfWall;
    }
    
}
