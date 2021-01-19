
package com.coderme.service;

import java.util.List;

/**
 *
 * @author Safayet Zahid
 */
  public interface CommonService<T> {
  
  
     void createTable();

    void save(T t);

    void update(T t);

    void delete(int id);

    T get(int id);

    T getByName(String name);

    List<T> getList();

    List<T> getListByFlight(int id);

    T getFlightBySourceAndDepartur(String source, String departur);
    
    List<T> getListBySourceAndDepartur(String source, String departure);
   
   // T getByProductId(int id);

    //T getCategoryByCatId(int id);

    //T getUserByUsernameAndPassword(String username, String password);
}
