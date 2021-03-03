import java.util.ArrayList;

public class Aggregation {
    /*
        @Param1 : ArrayList of buckets
        @Param2: maxSize - max entries of bucket instances
        @Param3: mergedIndex  - from which index this function need to start merging
     */
    void mergeBuckets(ArrayList<Bucket> buckets,  int maxSize, int mergedIndex) {

        Bucket bufferBucket = new Bucket(); // to maintain the calculatedValues, will be created only once

        for(int i = 0; i < maxSize - 1; i+=2) {
            // using setters and getters, since we should not access the attributes directly
            bufferBucket.setStartTime(getMinStartTime(buckets.get(i).getStartTime(), buckets.get(i+1).getStartTime()));

            bufferBucket.setEndTime(getMaxEndTime(buckets.get(i).getEndTime(), buckets.get(i+1).getEndTime()));

            bufferBucket.setCpuUsage(getAverageCPU(buckets.get(i).getCPUUsage(), buckets.get(i+1).getCPUUsage()));

            bufferBucket.setMemoryUsage(getAverageMemory(buckets.get(i).getMemoryUsage(),  buckets.get(i+1).getMemoryUsage()));

            buckets.set(mergedIndex, bufferBucket); // replacing the bucket
            mergedIndex++;
        }
    }



    int getMinStartTime(int bucketOneStartTime, int bucketTwoStartTIme) {
        return  Math.min(bucketOneStartTime, bucketTwoStartTIme);
    }

    int getMaxEndTime(int bucketOneEndTime, int bucketTwoEndTime) {
        return Math.max(bucketOneEndTime, bucketTwoEndTime);
    }

    double getAverageCPU(double bucketOneAvgCPU, double bucketTwoAvgCPU) {
        return (bucketOneAvgCPU + bucketTwoAvgCPU) / 2;
    }

    double getAverageMemory(double bucketOneMemory, double bucketTwoMemory) {
        return  (bucketOneMemory + bucketTwoMemory) / 2;
    }




}
