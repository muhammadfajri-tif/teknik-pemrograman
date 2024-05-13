package org.example.modules;

public class CPU {
  private final int cores;
  private final int threads;
  private final float frequency;
  
  public CPU(int cores, int threads, float frequency) {
    this.cores = cores;
    this.threads = threads;
    this.frequency = frequency;
  }
  
  public int getCores() {
    return cores;
  }
  
  public int getThreads() {
    return threads;
  }
  
  public float getFrequency() {
    return frequency;
  }
  
  public void startProcessing(){
    System.out.println("[INFO] Starting CPU...");
    System.out.println("Setting-up control unit.");
    System.out.println("Verify registers.");
    System.out.println("Verify instruction pointer.");
    System.out.println("Setting-up ALU.");
    System.out.println("[INFO] CPU started.\n");
  }
  
  public void stopProcessing(){
    System.out.println("[INFO] Stopping CPU...");
    System.out.println("Interrupt all instructions.");
    System.out.println("Flush data on registers.");
    System.out.println("[INFO] CPU stopped.\n");
  }
  
}
