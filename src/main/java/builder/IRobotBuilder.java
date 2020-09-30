/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author Vihan De Silva
 */
public interface IRobotBuilder {
    public void setName(String name);
    public void buildArms(int length);
    public void buildLegs(int length);
    public void buildArmor(int capacity);
}
