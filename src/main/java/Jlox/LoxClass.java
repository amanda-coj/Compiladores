package Jlox;

import java.util.List;
import java.util.Map;

class LoxClass implements LoxCallable {

  final String name;

  LoxClass(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return name;
  }
}
