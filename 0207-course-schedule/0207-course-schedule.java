class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }

        int[] inDegree = new int[numCourses];
        for(int[] pre : prerequisites) {
            int course = pre[0];
            int preq = pre[1];
            adj.get(preq).add(course);
            inDegree[course]++;
        }

        Queue<Integer> q = new ArrayDeque<>();
        for(int i = 0; i < numCourses; i++) {
            if(inDegree[i] == 0) {
                q.offer(i);
            }
        }

        int completed = 0;
        while(!q.isEmpty()) {
            int curr = q.poll();
            completed++;

            for(int neighbour : adj.get(curr)) {
                inDegree[neighbour]--;
                if(inDegree[neighbour] == 0) {
                    q.offer(neighbour);
                }
            }
        }

        return completed == numCourses;
    }
}