class Main {
  public static void main(String[] args) {
    System.out.println("M&M Color Counts");

    int total = 605;

    double blue = total * .24;
    System.out.println("Blue: " + blue);

    double green = total * .16;
    System.out.println("Green: " + green);

    double red = total * .13;
    System.out.println("Red: " + red);

    double yellow = total * .14;
    System.out.println("Yellow: " + yellow);

    double orange = total * .2;
    System.out.println("Orange: " + orange);

    double brown = total * .13;
    System.out.println("Brown: " + brown);

    double sum = blue + green + red + yellow + orange + brown;
    System.out.println("Sum: " + (Math.round(sum))); // Rounding 604.9999999 to 605

    if (blue > brown && red > orange) {
      System.out.println("Blue over Brown and Red over Orange");
    }

    if (brown <= green) {
      System.out.println("Brown is less than or equal to Green");
    }

    if ((Math.round(sum)) == total) // rounding 604.9999999 to 605 Numbers match
    {
      System.out.println("Numbers Match");
    }

  }

}