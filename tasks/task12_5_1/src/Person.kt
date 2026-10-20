// Task 12.5.1: investigating the nature of properties

import kotlinx.datetime.LocalDate

class Person(var name: String, val birth: LocalDate) {
    var isMarried = false
}
 
 """
 Compiled from "Person.kt"
 public final class Person {
  private java.lang.String name;
  private final kotlinx.datetime.LocalDate birth;
  private boolean isMarried;
  public Person(java.lang.String, kotlinx.datetime.LocalDate);
  public final java.lang.String getName();
  public final void setName(java.lang.String);
  public final kotlinx.datetime.LocalDate getBirth();
  public final boolean isMarried();
  public final void setMarried(boolean);
}
 """