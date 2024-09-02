import java.util.*;

public class Activity_selection {

    public static void main(String[] args) {
        int start[] = { 1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9 };

        // If end id not in ascending order, sorting is done:)

        int activities[][] = new int[start.length][3];
        for (int i = 0; i < end.length; i++) {
            activities[i][0] = i; // INDEX
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        // Lambda function -> shortform (sorting of end array)
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        

        // end time basis sorted
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        // 1st activity
        maxAct = 1;
        ans.add(activities[0][0]);
        int lastend = activities[0][2];

        for (int i = 1; i < end.length; i++) {
            if (activities[i][1] >= lastend) {
                maxAct++;
                ans.add(activities[i][0]);
                lastend = activities[i][2];
            }
        }
        System.out.println("MAX ACTIVITY : " + maxAct);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A" + ans.get(i) + " ");
        }
        System.out.println();
    }
}
