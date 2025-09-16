//gfg link - https://www.geeksforgeeks.org/problems/union-of-two-sorted-arrays-1587115621/1

import java.util.ArrayList;

class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        ArrayList<Integer> l = new ArrayList<>();
        int i = 0, j = 0;
        int n = a.length;
        int m = b.length;
        
        while (i < n && j < m) {
            // case 1: a[i] smaller
            if (a[i] < b[j]) {
                if (l.isEmpty() || l.get(l.size() - 1) != a[i]) {
                    l.add(a[i]);
                }
                i++;
            }
            // case 2: b[j] smaller
            else if (b[j] < a[i]) {
                if (l.isEmpty() || l.get(l.size() - 1) != b[j]) {
                    l.add(b[j]);
                }
                j++;
            }
            // case 3: equal values
            else {
                if (l.isEmpty() || l.get(l.size() - 1) != a[i]) {
                    l.add(a[i]);
                }
                i++;
                j++;
            }
        }

        // add remaining from a[]
        while (i < n) {
            if (l.isEmpty() || l.get(l.size() - 1) != a[i]) {
                l.add(a[i]);
            }
            i++;
        }

        // add remaining from b[]
        while (j < m) {
            if (l.isEmpty() || l.get(l.size() - 1) != b[j]) {
                l.add(b[j]);
            }
            j++;
        }

        return l;
    }
}
