package org.example.facade;

import org.example.modules.CPU;
import org.example.modules.Memory;
import org.example.modules.Storage;

public class Computer {
  private final CPU cpu;
  private final Memory memory;
  private final Storage storage;
  
  public Computer(){
    this.cpu = new CPU(4, 8, 3.5F);
    this.memory = new Memory("ddr4", 2133,8);
    this.storage = new Storage("ssd", 512,1500,1350);
  }
  
  public Computer(CPU cpu, Memory memory, Storage storage) {
    this.cpu = cpu;
    this.memory = memory;
    this.storage = storage;
  }
  
  public void startBooting(){
    System.out.println("[INFO] Booting Computer...");
    cpu.startProcessing();
    memory.startLoadMemory();
    storage.startReadingData();
    System.out.println("[INFO] Booting Computer finished.");
  }
  
  public void stopBooting(){
    System.out.println("[INFO] Turning off Computer...");
    cpu.stopProcessing();
    memory.stopLoadMemory();
    storage.stopReadingData();
    System.out.println("Bye.");
  }
}
