### Reproduction

- Open sbt shell
- Run `dependencyTree` or `A / dependencyBrowseTree`

```
// dependencyTree
java.lang.OutOfMemoryError: Java heap space: failed reallocation of scalar replaced objects
[error] [launcher] error during sbt launcher: java.lang.OutOfMemoryError: Java heap space: failed reallocation of scalar replaced objects

// A / dependencyBrowseTree
[warn] In the last 10 seconds, 5.189 (53.8%) were spent in GC. [Heap: 0.00GB free of 1.50GB, max 1.50GB] Consider increasing the JVM heap using `-Xmx` or try a different collector, e.g. `-XX:+UseG1GC`, for better performance.
Exception in thread "classloader-cache-cleanup-0" java.lang.OutOfMemoryError: Java heap space
        at java.base/java.lang.invoke.DirectMethodHandle.allocateInstance(DirectMethodHandle.java:501)
        at java.base/java.lang.invoke.DirectMethodHandle$Holder.newInvokeSpecial(DirectMethodHandle$Holder)
```
