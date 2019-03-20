package ch07;

class Break {
    public static void main(String[] args) {
        int i = 0;                // This is Java
        boolean foundIt = false;
        while (i < args.length) {
          if (args[i].startsWith("-")) {
            i = i + 1;
            continue;
          }
          if (args[i].endsWith(".scala")) {
            foundIt = true;
            break;
          }
          i = i + 1;
        }

        System.out.println("foundIt = " + foundIt);
        System.out.println("i = " + i);
    }
}
