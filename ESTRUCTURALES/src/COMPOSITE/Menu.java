/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package COMPOSITE;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hector
 */
public class Menu {
    
    private final List<Menu> menus;

    public Menu() {
        menus = new ArrayList<>();
    }
    
    public void add(Menu menu){
        this.menus.add(menu);
    }
    
    public Menu getMenu(int puntero){
        return this.menus.get(puntero);
    }
    
    public void cantidadMenus(){
        System.out.println(this.menus.size());
    }
    
}
