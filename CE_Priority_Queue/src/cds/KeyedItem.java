// Assignement CE_Priority_Queue
// Program KeyedItem
// Author Christian Makoma
// Created Feb 27, 2020


package cds;

public abstract class KeyedItem
{
  private String search_key;
  
  public KeyedItem(String key) 
  {
    search_key = key;
  }  

  public String getKey() 
  {
    return search_key;
  }
}
