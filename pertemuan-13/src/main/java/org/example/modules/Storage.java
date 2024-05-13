package org.example.modules;

public class Storage {
  private final String type;
  private final int size;
  private final int readSpeed;
  private final int writeSpeed;
  
  public Storage(String type, int size, int readSpeed, int writeSpeed) {
    this.type = type;
    this.size = size;
    this.readSpeed = readSpeed;
    this.writeSpeed = writeSpeed;
  }
  
  public String getType() {
    return type;
  }
  
  public int getSize() {
    return size;
  }
  
  public int getReadSpeed() {
    return readSpeed;
  }
  
  public int getWriteSpeed() {
    return writeSpeed;
  }
  
  public void startReadingData(){
    System.out.println("[INFO] Starting reading data from storage...");
  }
  
  public void stopReadingData(){
    System.out.println("[INFO] Stopping reading data from storage...");
  }
}
