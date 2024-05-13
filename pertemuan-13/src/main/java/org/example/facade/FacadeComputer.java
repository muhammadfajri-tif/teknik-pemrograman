package org.example.facade;

public class FacadeComputer {
  public static void main(String[] args) {
    Computer ibm = new Computer();
    ibm.startBooting();
    System.out.println("Computer is running");
    
    ibm.stopBooting();
  }
}
