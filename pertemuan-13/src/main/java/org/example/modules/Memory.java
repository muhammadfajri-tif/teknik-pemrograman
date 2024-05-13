package org.example.modules;

public class Memory {
  private final String type;
  private final int speed;
  private final int size;
  private final float bandwidth;
  
  public Memory(String type, int speed, int size) {
    this.type = type;
    this.speed = speed;
    this.size = size;
    this.bandwidth = (float) size / (float) speed;
  }
  
  public String getType() {
    return type;
  }
  
  public int getSpeed() {
    return speed;
  }
  
  public int getSize() {
    return size;
  }
  
  public float getBandwidth() {
    return bandwidth;
  }
  
  public void startLoadMemory() {
    System.out.println("[INFO] Starting load memory...");
    System.out.println("setting-up stack memory.");
    System.out.println("setting-up heap memory.");
    System.out.println("[INFO] memory ready.");
  }
  
  public void stopLoadMemory() {
    System.out.println("[INFO] Stopping load memory...");
    System.out.println("purge stack memory.");
    System.out.println("releases data in heap memory.");
    System.out.println("[INFO] memory stopped.");
  }
}
