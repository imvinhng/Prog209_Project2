/*
*  CS211, Spring 2020
*  Jae Choi, Alex Larsen, Sean Michael, Vinh Nguyen
*  5/18/2020
*  Team Project 2
*  This abstract class contains methods which
*  work for both array lists and linked lists.
*/

import java.util.*;

public abstract class AbstractList<E> {
   
   private int size;        // current number of elements in the list

   public static final int DEFAULT_CAPACITY = 100;

   // post: returns the current number of elements in the list
   public int size() {
      return size;
   }
   
   // pre : 0 <= index < size() (throws IndexOutOfBoundsException if not)
   // post: returns the value at the given index in the list
   // INCOMPLETE
   public abstract E get(int index);

   // post: creates a comma-separated, bracketed version of the list
   // INCOMPLETE
   public abstract String toString();

   // post : returns the position of the first occurrence of the given
   //        value (-1 if not found)
   // INCOMPLETE
   public abstract int indexOf(E value);
   
   // post: returns true if list is empty, false otherwise
   public boolean isEmpty() {
      return size == 0;
   }

   // post: returns true if the given value is contained in the list,
   //       false otherwise
   public boolean contains(E value) {
      return indexOf(value) >= 0;
   }

   // post: appends the given value to the end of the list
   // INCOMPLETE
   public abstract void add(E value);

   // pre : 0 <= index <= size() (throws IndexOutOfBoundsException if not)
   // post: inserts the given value at the given index, shifting subsequent
   //       values right
   // INCOMPLETE
   public abstract void add(int index, E value);

   // pre : 0 <= index < size() (throws IndexOutOfBoundsException if not)
   // post: removes value at the given index, shifting subsequent values left
   // INCOMPLETE
   public abstract void remove(int index);

   // pre : 0 <= index < size() (throws IndexOutOfBoundsException if not)
   // post: replaces the value at the given index with the given value
   // INCOMPLETE
   public abstract void set(int index, E value);

   // post: list is empty
   // INCOMPLETE
   public abstract void clear();

   // post: appends all values in the given list to the end of this list
   public void addAll(List<E> other) {
      for (E value: other) {
         add(value);
      }
   }

   // post: returns an iterator for this list
   // INCOMPLETE
   public abstract Iterator<E> iterator();
   
}