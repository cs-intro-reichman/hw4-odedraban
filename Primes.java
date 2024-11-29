public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean[] arr = new boolean [n + 1];
        for (int i = 2; i < arr.length; i++) arr [i] = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (arr[i] == true) {
                for (int j = i + 1; j <= n; j++) {
                    if (j % i == 0) arr[j] = false;
                }
            }
        }
        System.out.println("Prime numbers up to " + n + ":");
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] == true) System.out.println(i);
        }
        int counter = 0;
        for (int i = 2; i < arr.length; i++) if (arr[i] == true) counter++;
        if (counter != 0) System.out.println("There are " + counter + " prime between 2 and " + n + " (" + (int)(((double) counter / (n - 1)) * 100) + "% are primes)");
}
}