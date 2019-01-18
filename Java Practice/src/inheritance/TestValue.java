package inheritance;


class TestValue {
 public static void changeIt(int old) {
  old += 2;
 }
 public static void main(String[] args) {
   int old = 4;
   changeIt(old);
  System.out.println(old);
 }
}

