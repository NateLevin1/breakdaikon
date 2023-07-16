# Break Daikon

Running:

```bash
# build
mvn package
# run DynComp
java -cp "./target/dependency/*:./target/classes:./target/test-classes:$DAIKONDIR/daikon.jar" daikon.DynComp com.example.breakdaikon.BreakDaikon
```

Results in the following error:

```java
Unexpected Error: java.lang.Error: Unexpected error processing com.example.breakdaikon.BreakDaikon$1.test
java.lang.Error: Unexpected error processing com.example.breakdaikon.BreakDaikon$1.test
        at daikon.dcomp.DCInstrument.instrument(DCInstrument.java:742)
        at daikon.dcomp.Instrument.transform(Instrument.java:189)
        at sun.instrument.TransformerManager.transform(TransformerManager.java:188)
        at sun.instrument.InstrumentationImpl.transform(InstrumentationImpl.java:428)
        at com.example.breakdaikon.BreakDaikon.lambda$0(BreakDaikon.java:8)
        at com.example.breakdaikon.org.junit.DynCompHackJUnitCommandLineParseResult.parse(DynCompHackJUnitCommandLineParseResult.java:12)
        at com.example.breakdaikon.BreakDaikon.main(BreakDaikon.java:7)
Caused by: java.lang.ArrayIndexOutOfBoundsException: 0
        at daikon.plumelib.bcelutil.StackMapUtils.fixLocalVariableTable(StackMapUtils.java:1058)
        at daikon.dcomp.DCInstrument.instrument(DCInstrument.java:614)
        ... 6 more
```
