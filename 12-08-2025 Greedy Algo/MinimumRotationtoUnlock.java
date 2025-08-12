//geeks for geeks
//Minimum rotations to unlock a circular lock
class Solution {
    static int rotationCount(long R, long D) {
        String rStr = String.valueOf(R);
        String dStr = String.valueOf(D);

        int n = rStr.length();
        int totalRotations = 0;

        for (int i = 0; i < n; i++) {
            int digitR = rStr.charAt(i) - '0';
            int digitD = dStr.charAt(i) - '0';

            int forward = (digitD - digitR + 10) % 10;
            int backward = (digitR - digitD + 10) % 10;

            totalRotations += Math.min(forward, backward);
        }

        return totalRotations;
    }
}

