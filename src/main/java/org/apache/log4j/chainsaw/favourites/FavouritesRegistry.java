/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.log4j.chainsaw.favourites;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *  A singleton class that is used as a Registry of instances of JavaBeans 
 * that are in a state that a user prefers.
 * 
 * @author Paul Smith <psmith@apache.org>
 *
 */
public class FavouritesRegistry{
  
  private final List favourites = new ArrayList();
  
  /**
   * Returns a Collection of Favourite instances whose getPrototype() method
   * returns an object whose class is assignable from clazz, or more formally, such that
   * clazz.isAssignableFrom(favourite.getPrototype().getClass())
   * @param clazz
   * @return favourites
   */
  public synchronized Collection getFavouritesByClass(Class clazz) {
    throw new UnsupportedOperationException("Work In Progress");
  }
  
  /**
   * Adds a favourite to this Registry
   * @param favourite
   */
  
  public synchronized void addFavourite(Favourite favourite) {
    throw new UnsupportedOperationException("Work In Progress");
  }
  
  /**
   * Returns an unmodifiable List of all the known Favourite instances
   * @return favourites
   */
  public List getFavourites() {
    return Collections.unmodifiableList(favourites);
  }
  
  /**
   * Creates a new Favourite instance after running throught some
   * suitability checks to make sure the object class is ok to be used
   * as a prototype.
   * 
   * @param name The name to use for the favourite
   * @param prototype The object to register
   * @throws IllegalArgumentException if the prototype does not conform
   * to the necessary rules to be used as a prototype (see the package documentation).
   * 
   */
  public void addFavourite(String name, Object prototype) {
    favourites.add(createFavourite(name, prototype));
  }
  
  private Favourite createFavourite(String name, Object prototype) {
    checkSuitability(prototype);
    return new Favourite(name, prototype);
  }
  
  /**
   * Checks the suitability of an object to make sure it conforms to all the rules
   * for being a prototype,
   * @param prototype
   * @throws IllegalArgumentException if the prototype is not suitable
   */
  private void checkSuitability(Object prototype)  throws IllegalArgumentException{
    // TODO Auto-generated method stub
   throw new UnsupportedOperationException("Work in Progress"); 
  }

  private FavouritesRegistry() {
    
  }
}
