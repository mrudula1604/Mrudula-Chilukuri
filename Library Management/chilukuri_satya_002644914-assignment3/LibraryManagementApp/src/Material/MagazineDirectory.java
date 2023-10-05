/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Material;

import java.util.ArrayList;

/**
 *
 * @author chilukuri
 */
public class MagazineDirectory {
    private ArrayList<Magazine> magazinesList;
    
    public MagazineDirectory()
    {
        this.magazinesList = new ArrayList<Magazine>();
    }

    public ArrayList<Magazine> getMagazinesList() {
        return magazinesList;
    }

    public void setMagazinesList(ArrayList<Magazine> magazinesList) {
        this.magazinesList = magazinesList;
    }
    
    public Magazine addMagazine(Magazine magazine) {
        this.magazinesList.add(magazine);
        return magazine;
    }
    
    public boolean checkIfMagazineExists(String serialNumber)
    {
        for(Magazine b: this.magazinesList) {
            if(b.getSerialNumber().equals(serialNumber)) {
                return true;
            }
        }
        return false;
    }
    
    public Magazine findMagazine(String serialNumber){
        for(Magazine b: this.magazinesList) {
            if(b.getSerialNumber().equals(serialNumber)) {
                return b;
            }
        }
        return null;
    }
    
}
