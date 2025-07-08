class invrigangtri{
  public static void inverted_right_angled_tri(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
  public static void main(String[] args) {
        int n = 5;
    System.out.println("Inverted right angled triangle");
        inverted_right_angled_tri(n);
  }
}
