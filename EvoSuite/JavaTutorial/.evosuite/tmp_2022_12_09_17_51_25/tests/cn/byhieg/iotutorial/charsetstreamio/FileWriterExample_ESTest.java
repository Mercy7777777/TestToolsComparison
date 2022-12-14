/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 10 01:28:13 GMT 2022
 */

package cn.byhieg.iotutorial.charsetstreamio;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import cn.byhieg.iotutorial.charsetstreamio.FileWriterExample;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FileWriterExample_ESTest extends FileWriterExample_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileWriterExample fileWriterExample0 = new FileWriterExample();
      try { 
        fileWriterExample0.writeToFile();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Simulated IOException
         //
         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("D:/write_file.txt");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileWriterExample fileWriterExample0 = new FileWriterExample();
      try { 
        fileWriterExample0.writeToFile();
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FileWriterExample fileWriterExample0 = new FileWriterExample();
      fileWriterExample0.writeToFile();
  }
}
