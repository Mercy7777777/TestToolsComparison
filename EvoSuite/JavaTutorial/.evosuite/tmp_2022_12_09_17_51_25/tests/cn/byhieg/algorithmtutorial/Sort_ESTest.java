/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 10 00:42:30 GMT 2022
 */

package cn.byhieg.algorithmtutorial;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import cn.byhieg.algorithmtutorial.Sort;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Sort_ESTest extends Sort_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Sort sort0 = new Sort();
      int[] intArray0 = new int[4];
      intArray0[1] = 868;
      sort0.quickSort(intArray0);
      assertArrayEquals(new int[] {0, 0, 0, 868}, intArray0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Sort sort0 = new Sort();
      int[] intArray0 = new int[2];
      int int0 = sort0.partition(intArray0, 0, (-755));
      assertArrayEquals(new int[] {0, 0}, intArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Sort sort0 = new Sort();
      int[] intArray0 = new int[6];
      intArray0[1] = (-1);
      intArray0[4] = (-2396);
      intArray0[5] = (-319);
      sort0.chooseSort(intArray0);
      sort0.mergeSort(intArray0);
      assertArrayEquals(new int[] {(-2396), (-319), (-1), 0, 0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Sort sort0 = new Sort();
      int[] intArray0 = new int[3];
      intArray0[2] = 1969;
      sort0.heapSort(intArray0);
      assertArrayEquals(new int[] {1969, 0, 0}, intArray0);
      
      sort0.mergeSort(intArray0);
      assertArrayEquals(new int[] {0, 0, 1969}, intArray0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Sort sort0 = new Sort();
      int[] intArray0 = new int[0];
      sort0.mergeSort(intArray0);
      assertEquals(0, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Sort sort0 = new Sort();
      int[] intArray0 = new int[0];
      sort0.bubbleSort2(intArray0);
      assertArrayEquals(new int[] {}, intArray0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Sort sort0 = new Sort();
      int[] intArray0 = new int[0];
      sort0.bubbleSort1(intArray0);
      assertArrayEquals(new int[] {}, intArray0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Sort sort0 = new Sort();
      int[] intArray0 = new int[10];
      intArray0[2] = 2927;
      intArray0[9] = 2927;
      sort0.heapSort(intArray0);
      sort0.insertBinarySort(intArray0);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0, 0, 2927, 2927}, intArray0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Sort sort0 = new Sort();
      int[] intArray0 = new int[0];
      sort0.insertBinarySort(intArray0);
      assertEquals(0, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Sort sort0 = new Sort();
      int[] intArray0 = new int[10];
      intArray0[2] = 2927;
      sort0.insertDirectlySort(intArray0);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 2927}, intArray0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Sort sort0 = new Sort();
      int[] intArray0 = new int[0];
      sort0.insertDirectlySort(intArray0);
      assertArrayEquals(new int[] {}, intArray0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Sort sort0 = new Sort();
      int[] intArray0 = new int[4];
      intArray0[1] = 868;
      intArray0[2] = (-864);
      sort0.quickSort(intArray0);
      assertArrayEquals(new int[] {(-864), 0, 0, 868}, intArray0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Sort sort0 = new Sort();
      // Undeclared exception!
      try { 
        sort0.sort((int[]) null, (-4433), (-1));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("cn.byhieg.algorithmtutorial.Sort", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Sort sort0 = new Sort();
      // Undeclared exception!
      try { 
        sort0.quickSort((int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("cn.byhieg.algorithmtutorial.Sort", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Sort sort0 = new Sort();
      // Undeclared exception!
      try { 
        sort0.partition((int[]) null, 0, (-4433));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("cn.byhieg.algorithmtutorial.Sort", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Sort sort0 = new Sort();
      int[] intArray0 = new int[2];
      // Undeclared exception!
      try { 
        sort0.partition(intArray0, 2630, (-1321));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2630
         //
         verifyException("cn.byhieg.algorithmtutorial.Sort", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Sort sort0 = new Sort();
      // Undeclared exception!
      try { 
        sort0.mergeSort((int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("cn.byhieg.algorithmtutorial.Sort", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Sort sort0 = new Sort();
      // Undeclared exception!
      try { 
        sort0.insertDirectlySort((int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("cn.byhieg.algorithmtutorial.Sort", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Sort sort0 = new Sort();
      // Undeclared exception!
      try { 
        sort0.insertBinarySort((int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("cn.byhieg.algorithmtutorial.Sort", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Sort sort0 = new Sort();
      // Undeclared exception!
      try { 
        sort0.heapSort((int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("cn.byhieg.algorithmtutorial.Sort", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Sort sort0 = new Sort();
      // Undeclared exception!
      try { 
        sort0.chooseSort((int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("cn.byhieg.algorithmtutorial.Sort", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Sort sort0 = new Sort();
      // Undeclared exception!
      try { 
        sort0.bubbleSort2((int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("cn.byhieg.algorithmtutorial.Sort", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Sort sort0 = new Sort();
      // Undeclared exception!
      try { 
        sort0.bubbleSort1((int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("cn.byhieg.algorithmtutorial.Sort", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Sort sort0 = new Sort();
      int[] intArray0 = new int[4];
      intArray0[2] = (-864);
      // Undeclared exception!
      try { 
        sort0.sink(intArray0, 0, 868);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5
         //
         verifyException("cn.byhieg.algorithmtutorial.Sort", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Sort sort0 = new Sort();
      // Undeclared exception!
      try { 
        sort0.sink((int[]) null, 0, 2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("cn.byhieg.algorithmtutorial.Sort", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Sort sort0 = new Sort();
      int[] intArray0 = new int[4];
      intArray0[1] = 868;
      sort0.sink(intArray0, 0, 868);
      assertEquals(4, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Sort sort0 = new Sort();
      int[] intArray0 = new int[3];
      sort0.sink(intArray0, 0, 1082);
      assertArrayEquals(new int[] {0, 0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Sort sort0 = new Sort();
      int[] intArray0 = new int[0];
      sort0.sink(intArray0, (-1), (-1));
      assertEquals(0, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Sort sort0 = new Sort();
      int[] intArray0 = new int[2];
      // Undeclared exception!
      try { 
        sort0.sort(intArray0, (-1), 1219);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("cn.byhieg.algorithmtutorial.Sort", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Sort sort0 = new Sort();
      int[] intArray0 = new int[3];
      sort0.sort(intArray0, 0, 0);
      assertEquals(3, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Sort sort0 = new Sort();
      int[] intArray0 = new int[15];
      intArray0[2] = 408;
      intArray0[3] = 408;
      sort0.heapSort(intArray0);
      int int0 = sort0.partition(intArray0, 0, 12);
      assertEquals(12, int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Sort sort0 = new Sort();
      int[] intArray0 = new int[5];
      int int0 = sort0.partition(intArray0, 0, 1);
      assertEquals(0, int0);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Sort sort0 = new Sort();
      int[] intArray0 = new int[15];
      intArray0[2] = 408;
      sort0.bubbleSort2(intArray0);
      assertEquals(15, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Sort sort0 = new Sort();
      int[] intArray0 = new int[15];
      intArray0[2] = 408;
      sort0.bubbleSort1(intArray0);
      assertEquals(15, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Sort sort0 = new Sort();
      int[] intArray0 = new int[15];
      intArray0[2] = 408;
      sort0.insertBinarySort(intArray0);
      assertEquals(15, intArray0.length);
  }
}
