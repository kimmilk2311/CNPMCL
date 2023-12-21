package Dao;

import java.util.ArrayList;

public interface DaoInterface<T> {
  public boolean insert(T t);
  public boolean delete(T t);
  public boolean update(T t);
  public ArrayList<T> selectAll();
  public T selectByid(String t);
  public boolean deleleAll();
  
  public ArrayList<T> find(String name);
}
