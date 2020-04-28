package org.mitre.jfastbpe;

import org.mitre.jfastbpe.analyzer.FastBPEAnalyzer;

import java.io.File;
import java.io.IOException;

public class FastBPE {
    final private FastBPEAnalyzer analyzer;

    public FastBPE(final File f) throws IOException {
        analyzer = new FastBPEAnalyzer(f);
    }

    public String applyBPE(final String sent) throws InterruptedException {
        return analyzer.applyBpe(sent);
    }

}
