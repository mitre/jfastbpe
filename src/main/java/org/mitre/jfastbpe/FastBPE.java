package org.mitre.jfastbpe;

import org.mitre.jfastbpe.analyzer.FastBPEAnalyzer;

import java.io.File;
import java.io.IOException;

public class FastBPE {
    final private FastBPEAnalyzer analyzer;

    public FastBPE(final File codesFile) throws IOException {
        analyzer = new FastBPEAnalyzer(codesFile);
    }

    public FastBPE(final File codesFile, final File vocabFile) throws IOException {
        analyzer = new FastBPEAnalyzer(codesFile, vocabFile, 4);
    }

    public FastBPE(final File codesFile, final File vocabFile, int numThreads) throws IOException {
        analyzer = new FastBPEAnalyzer(codesFile, vocabFile, numThreads);
    }

    public String applyBPE(final String sent) throws InterruptedException {
        return analyzer.applyBpe(sent);
    }

}
