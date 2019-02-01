public class ProjectEuler1 {

    public ProjectEuler1() {}

    public int getSumOfMultiples3And5Below1000 () {
        int sum = 0;
        for(int i = 0; i < 1000; i++){
            if (i % 3 == 0 || i % 5 == 0) sum += i;
        }
        return sum;
    }
}
