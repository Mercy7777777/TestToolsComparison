/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 10 02:16:37 GMT 2022
 */

package cn.byhieg.reflectiontutorial;

import org.junit.Test;
import static org.junit.Assert.*;
import cn.byhieg.reflectiontutorial.ExampleObject;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FatherObject_ESTest extends FatherObject_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ExampleObject exampleObject0 = new ExampleObject();
      exampleObject0.doSomething();
      assertEquals(30, exampleObject0.getAge());
  }
}