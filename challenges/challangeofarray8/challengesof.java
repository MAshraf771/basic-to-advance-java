class challengesof {
  public static void main(String[] args) {

    int arr[] = { 10, 20, 40, 5, 6, 4, 3, 3, 3, 2, 2, 1, 1, 3, 4, 5, 3, 2, 2, 2 };
    // ? ocuerence of number;
    // int count = 0;
    // int num = 10;
    // for (int i = 0; i < arr.length; i++) {
    // if (arr[i] == num) {

    // count++;
    // }

    // }
    // System.out.println(count);
    // ? array sorted
    boolean inc = increaseingOrder(arr);
    boolean dec = decreaseingOrder(arr);
    if (inc || dec) {
      System.out.println("array is shorted");
    } else {
      System.out.println("array is not sorted");
    }

  }

  static boolean decreaseingOrder(int[] num) {

    int i = 1;
    while (i < num.length) {
      if (num[i] > num[i - 1]) {
        return false;

      }
      i++;

    }
    return true;

  }

  static boolean increaseingOrder(int[] num) {
    int i = 1;
    while (i < num.length) {
      if (num[i] < num[i - 1]) {
        return false;

      }
      i++;

    }
    return true;

  }

}