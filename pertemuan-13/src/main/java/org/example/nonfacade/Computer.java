package org.example.nonfacade;

import org.example.modules.CPU;
import org.example.modules.Memory;
import org.example.modules.Storage;

public class Computer {
  public static void main(String[] args) {
    // initialize object
    CPU intel = new CPU(4,8, 3.5F);
    Storage wd = new Storage("ssd", 512,1500,1350);
    Memory ram = new Memory("ddr4", 2133,8);
    
    // call method
    intel.startProcessing();
    ram.startLoadMemory();
    wd.startReadingData();
  }
}
