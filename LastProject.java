package Arrays;

import java.util.Arrays;
//Minkyung Oh and Seojin Moon
public class LastProject {

public static void main(String[] args) {

    int day = 0;

    boolean city0 = false;
    boolean city1 = false;
    boolean city2 = false;
    boolean city3 = false;
    boolean city4 = false;
    boolean city5 = false;
    boolean city6 = false;
    boolean city7 = false;

    int[] inhabitant = {0, 2, 1, 4, 0, 2, 7, 1};

    while ((((!city0 || !city1) || (!city2 || !city3)) || (!city4 || !city5)) || (!city6 || !city7)){

        if (city0) {
            inhabitant[1] = inhabitant[1] / 2;
        }
        if (city1) {
        	inhabitant[0] = inhabitant[0] / 2;
        	inhabitant[2] = inhabitant[2] / 2;
        }
        if (city2) {
        	inhabitant[1] = inhabitant[1] / 2;
        	inhabitant[3] = inhabitant[3] / 2;
        }
        if (city3) {
        	inhabitant[2] = inhabitant[2] / 2;
        	inhabitant[4] = inhabitant[4] / 2;
        }
        if (city4) {
        	inhabitant[3] = inhabitant[3] / 2;
        	inhabitant[5] = inhabitant[5] / 2;
        }
        if (city5) {
        	inhabitant[4] = inhabitant[4] / 2;
        	inhabitant[6] = inhabitant[6] / 2;
        }
        if (city6) {
        	inhabitant[5] = inhabitant[5] / 2;
        	inhabitant[7] = inhabitant[7] / 2;
        }
        if (city7) {
        	inhabitant[6] = inhabitant[6] / 2;
        }

        System.out.println("Day " + day  + " " + Arrays.toString(inhabitant));
        day++;
        
        if (inhabitant[0] == 0) {
        	city0 = true;
        }
        if (inhabitant[1] == 0) {
        	city1 = true;
        }
        if (inhabitant[2] == 0) {
        	city2 = true;
        }
        if (inhabitant[3] == 0) {
        	city3 = true;
        }
        if (inhabitant[4] == 0) {
        	city4 = true;
        }
        if (inhabitant[5] == 0) {
        	city5 = true;
        }
        if (inhabitant[6] == 0) {
        	city6 = true;
        }
        if (inhabitant[7] == 0) {
        	city7 = true;
        }

    }System.out.println("---- EXTINCT ----");

}
}
