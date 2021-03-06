# Colesico-Framework 3.7 vs Micronaut 2.0 vs Quarkus 1.5 vs Spring Boot 2.3  Benchmark - 2020 

Performance, memory consumption and jar size comparison between:

- Colesico-Framework 3.7
- Micronaut 2.0 
- Quarkus 1.5 
- Spring Boot 2.3

Benchmark tests performed on:
- JDK 14 on Ubuntu 20.04 Mate 1.24
- 15 Gb RAM
- Intel® Core™ i7-10510U CPU @ 1.80GHz × 8 
- SSD

This tests based on code form tests by Graeme Rocher, author of Micronaut framework: 
https://github.com/graemerocher/framework-comparison-2020

### Description

Test projects of each framework were built with standard maven 3.6.3.

The number of requests per second was measured with 'ab' and 'wrk' tool:

```
ab -k -c 20 -n 1000000 http://localhost:8080/hello/John
wrk -t12 -c400 -d30s --latency http://localhost:8080/hello/John

``` 

Memory measured with VisualVM GUI.

### Results

![Colesico vs Micronaut vs Quarkus vs Spring Boot Benchmark Results](https://raw.githubusercontent.com/colesico/java-frameworks-comparison/master/Results.png)

