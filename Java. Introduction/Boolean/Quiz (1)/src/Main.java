// you can experiment here, it won't be checked

class Task {
  public static void main(String[] args) {
    boolean b1 = true;
    boolean b2 = false;
    boolean b3 = false;
    boolean b4 = b1 ^ b3 & b2;
    boolean b5 = b1 ^ !b3 && b2;
  System.out.println(b4 + " " + b5);
  }
}

