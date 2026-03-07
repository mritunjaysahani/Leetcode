class Solution {
    public void nearlySorted(int[] arr, int k) {
        // code here
        int ind=0;
        PriorityQueue<Integer>minHeap=new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            minHeap.offer(arr[i]);
            if(minHeap.size()>k){
                arr[ind++]=minHeap.poll();
            }
        }

        while(!minHeap.isEmpty()){
            arr[ind++]=minHeap.poll();
        }
    }
}
