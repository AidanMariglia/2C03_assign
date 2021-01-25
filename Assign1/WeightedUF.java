public class WeightedUF {

    private int[] sets = new int[10];
    private int[] heights = new int[10];

    public WeightedUF(){
        for (int i = 0; i < sets.length; i++){
            sets[i] = i;
            heights[i] = 1;
        }
    }

    public int find(int member){
        int index = member;
        while(sets[index] != index){
            index = sets[index];
        }
        return index;
    }

    public void union(int member1, int member2){
        int head1 = find(member1);
        int head2 = find(member2);

        if (head1 == head2){
            return;
        }

        if (heights[head1] > heights[head2]){
            sets[head2] = head1;
        }
        else if (heights[head1] < heights[head2]){
            sets[head1] = head2;
        }

        else {
            sets[head2] = head1;
            heights[head1]++;
        }
    }

    public int height(int member){
        return heights[member];
    }    
}
