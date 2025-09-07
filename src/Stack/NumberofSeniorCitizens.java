package Stack;

public class NumberofSeniorCitizens {

    public int countSeniors(String[] details) {
        int count = 0;
        for (String detail : details) {
            // Age is always at index 11 and 12 → substring(11, 13)
            int age = Integer.parseInt(detail.substring(11, 13));
            if (age > 60) {
                count++;
            }
        }
        return count;
    }

    // Main method to test
    public static void main(String[] args) {
        NumberofSeniorCitizens solution = new NumberofSeniorCitizens();

        String[] details1 = {"7868190130M7522","5303914400F9211","9273338290F4010"};
        System.out.println("Senior citizens count = " + solution.countSeniors(details1));
        // Expected: 2

        String[] details2 = {"1313579440F2036","2921522980M5644"};
        System.out.println("Senior citizens count = " + solution.countSeniors(details2));
        // Expected: 0
    }
}
