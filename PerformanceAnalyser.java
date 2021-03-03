import java.util.ArrayList;
import java.util.Random;

public class PerformanceAnalyser {
    public static void main(String args[]) {
        int MAX_CAPACITY = 64;
        ArrayList<Bucket> bucketList = new ArrayList<Bucket>(MAX_CAPACITY);
        Bucket bucket;


        int startTime, endTime;
        double cpuUsage, memoryUsage;
        for(int i = 0 ; i < MAX_CAPACITY; i++) {
            startTime = i;
            endTime =  i + 100;
            cpuUsage = getRandomNumber(0, 100);
            memoryUsage = getRandomNumber(0, 100);
            bucket = new Bucket(startTime, endTime, cpuUsage, memoryUsage);
            bucketList.add(bucket);
        }

        Aggregation obj = new Aggregation();
        obj.mergeBuckets(bucketList, MAX_CAPACITY, 0);

        // we can again repeatedly generate the data and can call the mergeBuckets function whenever we reaches the threshold

    }

    static double getRandomNumber(int startRange, int endRange) {
        double random = new Random().nextDouble();
        double result = startRange + (random * (endRange - startRange));
        return  result;
    }
}
