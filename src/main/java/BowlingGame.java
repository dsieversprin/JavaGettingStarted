public class BowlingGame {
    // TODO: Why must this array have a size of 21?
    // Tenth frame of bowling has the potential for a 3rd roll.
    int[] rolls = new int[21];
    private int index;

    public void roll(int pins) {
        // TODO: Replace this with description of why this postfix operator works here
        // This works because the current value of index is referenced and after the statement it is incremented.
        rolls[index++] = pins;
    }

    public int score() {
        int score = 0;
        int frameCount = 1;
        // TODO CODE: Change this to use a loop prior to implementing spare and strike calculation and then commit to git
        //            This change should not break the existing tests that pass. This is called refactoring.

        // TODO RESPONSE: Why does the subscript need to start with zero?
        // Because the array index begins with 0

        for(int i = 0;i < 19;i++) {

            if (rolls[i] == 10) {
                score += rolls[i] + rolls[i+1] + rolls[i+2];
                frameCount++;
                if (frameCount > 10)
                    i = 20;
            } else if (rolls[i] + rolls[i+1] == 10) {
                score += 10 + rolls[i+2];
                i++;
                frameCount++;
            } else {
                score += rolls[i] + rolls[i + 1];
                i++;
                frameCount++;
            }
        }
        return score;
    }

}
