# Colesico-Framework 3.4 vs Micronaut 2.0 vs Quarkus 1.5 vs Spring Boot 2.3  Benchmark - 2020 

Performance and size comparison between:

- Colesico-Framework 3.4
- Micronaut 2.0 
- Quarkus 1.5 
- Spring Boot 2.3

Benchmark tests performed on:
- JDK 14
- 15 Gb RAM
- Intel® Core™ i7-10510U CPU @ 1.80GHz × 8 
- SSD

This tests based on code form tests by Graeme Rocher, author of Micronaut framework: 
https://github.com/graemerocher/framework-comparison-2020

### Description

Test projects of each framework were built with standard maven 3.6.3.

The number of requests per second was measured with 'ab' tool 
```
ab -k -c 20 -n 10000000 http://localhost:8080/hello/John
``` 

Memory measured with VisualVM GUI.

### Results

![results table](https://raw.githubusercontent.com/colesico/java-frameworks-comparison/master/Results.png)

