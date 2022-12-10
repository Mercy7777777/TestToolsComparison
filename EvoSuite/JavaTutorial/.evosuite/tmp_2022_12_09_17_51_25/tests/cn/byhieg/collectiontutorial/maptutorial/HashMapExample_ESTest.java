/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 10 01:47:57 GMT 2022
 */

package cn.byhieg.collectiontutorial.maptutorial;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import cn.byhieg.collectiontutorial.maptutorial.HashMapExample;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class HashMapExample_ESTest extends HashMapExample_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HashMapExample hashMapExample0 = new HashMapExample();
      Map<String, String> map0 = hashMapExample0.insertMap();
      hashMapExample0.getValue(map0, "");
      assertEquals(10, map0.size());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HashMapExample hashMapExample0 = new HashMapExample();
      // Undeclared exception!
      try { 
        hashMapExample0.getAllKeyAndValue((Map<? extends String, ? extends String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("cn.byhieg.collectiontutorial.maptutorial.HashMapExample", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HashMapExample hashMapExample0 = new HashMapExample();
      Map<String, String> map0 = hashMapExample0.insertMap();
      hashMapExample0.getAllKeyAndValue(map0);
      assertEquals(10, map0.size());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HashMapExample hashMapExample0 = new HashMapExample();
      // Undeclared exception!
      try { 
        hashMapExample0.getValue((Map<? extends String, ? extends String>) null, "cn.byhieg.collectiontutorial.maptutorial.HashMapExample");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("cn.byhieg.collectiontutorial.maptutorial.HashMapExample", e);
      }
  }
}