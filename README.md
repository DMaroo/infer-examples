# Infer Examples

These are the examples I used for demonstrating Facebook's Infer. You can have a look at the [presentation](https://docs.google.com/presentation/d/14GiuR17YxZPl4__uHHhzhJERLTiXI1qx0mnVa9dbiVg/edit?usp=sharing) and the [report](./report.pdf).

## Requirements

  - Working installation of `infer` in your `PATH`
  - Java compiler
  - C and C++ compiler

## Running

Just go into each of the directories and run the `run.sh` script. A demo invocation would look as follows:

```
$ cd annotation-reachability/
$ ./run.sh
+ infer --annotation-reachability-only -- javac -classpath ../annotations.jar ExpensiveInheritance.java
Capturing in javac mode...
Found 1 source file to analyze in infer-examples/annotation-reachability/infer-out
1/1 [################################################################################] 100% 33.004ms

ExpensiveInheritance.java:9: error: Expensive Method Called
  Method `critical()` annotated with `@PerformanceCritical` calls `Costly.costly()` where `Costly.costly()` is annotated with `@Expensive`.
   7.           Cheap c = new Costly();
   8.           Cheap d = new Cheap();
   9. >         c.compute();
  10.           d.compute();
  11.       }


Found 1 issue
                                Issue Type(ISSUED_TYPE_ID): #
  Expensive Method Called(CHECKERS_CALLS_EXPENSIVE_METHOD): 1
```
