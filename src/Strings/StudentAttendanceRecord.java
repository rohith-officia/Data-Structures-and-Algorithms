package Strings;

public class StudentAttendanceRecord {

    public boolean checkRecord(String s) {
        int A = 0;

        // Count 'A's
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') A++;
            if (A > 1) return false;   // condition 1
        }

        // Check for "LLL"
        return !s.contains("LLL");     // condition 2
    }

    public static void main(String[] args) {
        StudentAttendanceRecord record = new StudentAttendanceRecord();

        System.out.println(record.checkRecord("PPALLP")); // true
        System.out.println(record.checkRecord("PPALLL")); // false
    }
}
