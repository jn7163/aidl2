package net.sf.aidl2;

import com.google.testing.compile.JavaFileObjects;

import net.sf.aidl2.internal.AidlProcessor;
import net.sf.aidl2.internal.Config;
import net.sf.aidl2.tests.LogFileRule;

import org.junit.Rule;
import org.junit.Test;

import javax.tools.JavaFileObject;

import static com.google.common.truth.Truth.assertAbout;
import static com.google.testing.compile.JavaSourceSubjectFactory.javaSource;

public class SerializableTests {
    @Rule
    public LogFileRule logFile = new LogFileRule();

    @Test
    public void theSerializableReturn() throws Exception {
        JavaFileObject testSource = JavaFileObjects.forResource(ParcelableTests.class.getResource("TheSerializableReturn.java"));

        JavaFileObject generatedStub = JavaFileObjects.forResource(ParcelableTests.class.getResource("TheSerializableReturn$$AidlServerImpl.java"));
        JavaFileObject generatedProxy = JavaFileObjects.forResource(ParcelableTests.class.getResource("TheSerializableReturn$$AidlClientImpl.java"));

        assertAbout(javaSource()).that(testSource)
                .withCompilerOptions("-A" + Config.OPT_LOGFILE + "=" + logFile.getFile())
                .processedWith(new AidlProcessor())
                .compilesWithoutWarnings()
                .and()
                .generatesSources(generatedStub, generatedProxy);
    }

    @Test
    public void theSerializableParameter() throws Exception {
        JavaFileObject testSource = JavaFileObjects.forResource(ParcelableTests.class.getResource("TheSerializableParam.java"));

        JavaFileObject generatedStub = JavaFileObjects.forResource(ParcelableTests.class.getResource("TheSerializableParam$$AidlServerImpl.java"));
        JavaFileObject generatedProxy = JavaFileObjects.forResource(ParcelableTests.class.getResource("TheSerializableParam$$AidlClientImpl.java"));

        assertAbout(javaSource()).that(testSource)
                .withCompilerOptions("-A" + Config.OPT_LOGFILE + "=" + logFile.getFile())
                .processedWith(new AidlProcessor())
                .compilesWithoutWarnings()
                .and()
                .generatesSources(generatedStub, generatedProxy);
    }

    @Test
    public void someSerializableReturn() throws Exception {
        JavaFileObject testSource = JavaFileObjects.forResource(ParcelableTests.class.getResource("SomeSerializableReturn.java"));

        JavaFileObject generatedStub = JavaFileObjects.forResource(ParcelableTests.class.getResource("SomeSerializableReturn$$AidlServerImpl.java"));
        JavaFileObject generatedProxy = JavaFileObjects.forResource(ParcelableTests.class.getResource("SomeSerializableReturn$$AidlClientImpl.java"));

        assertAbout(javaSource()).that(testSource)
                .withCompilerOptions("-A" + Config.OPT_LOGFILE + "=" + logFile.getFile())
                .processedWith(new AidlProcessor())
                .compilesWithoutWarnings()
                .and()
                .generatesSources(generatedStub, generatedProxy);
    }

    @Test
    public void someSerializableParameter() throws Exception {
        JavaFileObject testSource = JavaFileObjects.forResource(ParcelableTests.class.getResource("SomeSerializableParam.java"));

        JavaFileObject generatedStub = JavaFileObjects.forResource(ParcelableTests.class.getResource("SomeSerializableParam$$AidlServerImpl.java"));
        JavaFileObject generatedProxy = JavaFileObjects.forResource(ParcelableTests.class.getResource("SomeSerializableParam$$AidlClientImpl.java"));

        assertAbout(javaSource()).that(testSource)
                .withCompilerOptions("-A" + Config.OPT_LOGFILE + "=" + logFile.getFile())
                .processedWith(new AidlProcessor())
                .compilesWithoutWarnings()
                .and()
                .generatesSources(generatedStub, generatedProxy);
    }
}
