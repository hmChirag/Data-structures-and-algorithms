/*
 * giveen n friends and each one can remain single or can be paired up with some other friend. 
 * each friend can be paired only once.find out the no of ways in which friends can remian single or paired up
 */

public class pairingFriends {
    public static int pairedFriends(int n) {
        // base case
        if (n == 1 || n == 2) {
            return n;
        }

        // if the persom is single then f(n-1) pairs possible
        int fnm1 = pairedFriends(n - 1);

        // if the person is not single then 2 members are already paired so n-2
        int fnm2 = pairedFriends(n - 2);

        // a person who wants to get paired is also having the choice to get paired with
        // (n-1) number of people os we do f(n-1)*f(n-2) here
        int totalPairs = fnm1 + (fnm1 * fnm2);
        return totalPairs;


        //same thuing can be written as 
        // ---------
        //return pairedFriends(n-1) + (n-1) * pairedFriends(n-2)
    }

    public static void main(String[] args) {
        System.out.println(pairedFriends(3));
    }
}
