# UNRAVEL_ASSIGNMENT

Problem Statement

Problem:
	Collect CPU and memory usage of the JVM process of your application
	at an interval of 5 secs (configurable using command line). 
	Keep these in a data structure of window size of 32 entries 
	(max entries 64). 

bucket1
bucket2
bucket3
bucket4
...
bucket64


As soon as the window size reaches 64 aggregate the
 2 adjacent buckets as below.

Each bucket has the following data (You can have any 
other fields also for your own purpose):
startTime;
endTime;
cpuUsage;
memoryUsage;

When the aggregation happens (when all 64 buckets have entries) 
bucket1 and bucket2 will be merged and becomes bucket1; bucket3
 and bucket4 merges and becomes bucket2 and so on.

Aggregation logic:

bucket1 {st1, et1, cpu1, memory1};    and   bucket2 {st2, et2, cpu2, memory2};

                                                  Merges to form new bucket1

Bucket1 {min(st1, st2), max(et1, et2), avg(cpu1, cpu2),
 avg(memory1, memory2)}





Merging of buckets

1) Generated the random data , maintaing the array list data structure for storing buckets 
2) Written the code for aggregation logic, using only buffer bucket instance for compaction, not creating new bucket every time.
3) Attached the screenshot for sample output
4) Output contains columns of start time, end time, CPU, Memory fields
5) Before aggregation showing n buckets, after aggregation displaying n/2 buckets, since they are compacted
6) The code can be extended to compaction of n buckets, but to keep the things simple, i have just considered two buckets
