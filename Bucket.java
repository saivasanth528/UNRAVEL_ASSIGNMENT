public class Bucket {
    int startTime, endTime;
    double cpuUsage, memoryUsage;

    Bucket() {
    // for empty bucket
    }

    Bucket(int startTime, int endTime, double cpuUsage, double memoryUsage) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.cpuUsage = cpuUsage;
        this.memoryUsage  = memoryUsage;
    }

    // setters

    void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    void setCpuUsage(double cpuUsage) {
        this.cpuUsage = cpuUsage;
    }

    void setMemoryUsage(double memoryUsage) {
        this.memoryUsage = memoryUsage;
    }

    // getters

    int getStartTime() {
        return this.startTime;
    }

    int getEndTime() {
        return  this.endTime;
    }

    double getCPUUsage() {
        return this.cpuUsage;
    }

    double getMemoryUsage() {
        return this.memoryUsage;
    }

    void printBucket() {
        System.out.print(this.startTime + " " + this.endTime + " " + this.cpuUsage + " " + this.memoryUsage + "\n");
    }


}
