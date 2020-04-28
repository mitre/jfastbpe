# jFastBPE

jFastBPE is a port of Guillaume Lample's [fastBPE](https://github.com/glample/fastBPE). 

## Features

Currently jFastBPE supports:

- #### Applying pretrained fastBPE models to a single input `java.lang.String`.

```java
import org.mitre.jfastbpe.FastBPE;

FastBPE bpe = new FastBPE(codesFile);

String line = "The quick brown fox jumps over the lazy dog.";

String bpeLine = bpe.applyBPE(line);
```

## Build

To build, execute `./gradlew build`.

To build a jar, execute `./gradlew build jar`

## Test

To test, execute `./gradlew test`.

## Authors

- [Elijah Rippeth](mailto:erippeth@mitre.org)
