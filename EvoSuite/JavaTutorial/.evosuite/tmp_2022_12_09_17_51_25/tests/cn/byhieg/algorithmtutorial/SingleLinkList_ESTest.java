/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 10 01:08:27 GMT 2022
 */

package cn.byhieg.algorithmtutorial;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import cn.byhieg.algorithmtutorial.SingleLinkList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SingleLinkList_ESTest extends SingleLinkList_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SingleLinkList singleLinkList0 = new SingleLinkList();
      SingleLinkList.Node singleLinkList_Node0 = new SingleLinkList.Node((-1));
      SingleLinkList.Node singleLinkList_Node1 = singleLinkList0.reverseLinkList(singleLinkList_Node0);
      singleLinkList0.reverseLinkList();
      SingleLinkList singleLinkList1 = new SingleLinkList();
      singleLinkList0.printLinkList((SingleLinkList.Node) null);
      singleLinkList_Node0.next = null;
      singleLinkList1.getHead();
      singleLinkList0.reverseLinkList((SingleLinkList.Node) null);
      singleLinkList0.getHead();
      singleLinkList0.printLinkList(singleLinkList_Node1);
      singleLinkList1.reverseLinkList((SingleLinkList.Node) null);
      singleLinkList1.getHead();
      singleLinkList0.insertFromTail((-1));
      singleLinkList1.insertFromHead((-544));
      singleLinkList0.getHead();
      singleLinkList0.insertFromTail((-1135));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SingleLinkList singleLinkList0 = new SingleLinkList();
      SingleLinkList.Node singleLinkList_Node0 = singleLinkList0.reverseLinkList();
      assertNull(singleLinkList_Node0);
      
      singleLinkList0.insertFromHead((-937));
      singleLinkList0.insertFromHead(1165);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SingleLinkList singleLinkList0 = new SingleLinkList();
      singleLinkList0.insertFromHead((-2266));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SingleLinkList singleLinkList0 = new SingleLinkList();
      singleLinkList0.insertFromTail(1);
      SingleLinkList.Node singleLinkList_Node0 = singleLinkList0.insertFromTail(0);
      assertNotNull(singleLinkList_Node0);
      assertEquals(1, singleLinkList_Node0.data);
      
      singleLinkList0.reverseLinkList();
      singleLinkList0.insertFromHead(0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SingleLinkList singleLinkList0 = new SingleLinkList();
      SingleLinkList.Node singleLinkList_Node0 = new SingleLinkList.Node(1142);
      singleLinkList_Node0.data = 1142;
      singleLinkList0.printLinkList(singleLinkList_Node0);
      SingleLinkList.Node singleLinkList_Node1 = singleLinkList0.insertFromHead(1142);
      singleLinkList0.printLinkList(singleLinkList_Node1);
      singleLinkList0.printLinkList(singleLinkList_Node1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SingleLinkList singleLinkList0 = new SingleLinkList();
      int int0 = 271;
      SingleLinkList.Node singleLinkList_Node0 = singleLinkList0.insertFromTail(271);
      singleLinkList_Node0.next = singleLinkList0.head;
      singleLinkList0.head = singleLinkList_Node0;
      SingleLinkList.Node singleLinkList_Node1 = singleLinkList0.reverseLinkList();
      singleLinkList_Node1.next = singleLinkList_Node0;
      // Undeclared exception!
      singleLinkList0.printLinkList(singleLinkList_Node1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SingleLinkList singleLinkList0 = new SingleLinkList();
      SingleLinkList.Node singleLinkList_Node0 = singleLinkList0.insertFromTail(0);
      SingleLinkList.Node singleLinkList_Node1 = singleLinkList0.insertFromHead(1);
      singleLinkList_Node1.data = 0;
      singleLinkList_Node1.data = 71;
      SingleLinkList.Node singleLinkList_Node2 = singleLinkList0.reverseLinkList(singleLinkList_Node1);
      singleLinkList_Node1.next = singleLinkList_Node0;
      singleLinkList_Node2.next = singleLinkList_Node0;
      singleLinkList_Node1.next = singleLinkList_Node2;
      // Undeclared exception!
      singleLinkList0.insertFromTail((-3188));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SingleLinkList singleLinkList0 = new SingleLinkList();
      singleLinkList0.insertFromHead(254);
      SingleLinkList.Node singleLinkList_Node0 = singleLinkList0.reverseLinkList();
      assertEquals(254, singleLinkList_Node0.data);
      assertNotNull(singleLinkList_Node0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SingleLinkList singleLinkList0 = new SingleLinkList();
      SingleLinkList.Node singleLinkList_Node0 = singleLinkList0.insertFromTail(2007);
      assertNotNull(singleLinkList_Node0);
      
      singleLinkList0.printLinkList(singleLinkList_Node0);
      assertEquals(2007, singleLinkList_Node0.data);
      
      SingleLinkList.Node singleLinkList_Node1 = singleLinkList0.insertFromHead(0);
      assertEquals(0, singleLinkList_Node1.data);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SingleLinkList singleLinkList0 = new SingleLinkList();
      singleLinkList0.getHead();
      singleLinkList0.printLinkList((SingleLinkList.Node) null);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SingleLinkList singleLinkList0 = new SingleLinkList();
      SingleLinkList.Node singleLinkList_Node0 = singleLinkList0.insertFromTail(770);
      assertEquals(770, singleLinkList_Node0.data);
      assertNotNull(singleLinkList_Node0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SingleLinkList singleLinkList0 = new SingleLinkList();
      SingleLinkList singleLinkList1 = new SingleLinkList();
      SingleLinkList.Node singleLinkList_Node0 = singleLinkList1.insertFromHead(0);
      SingleLinkList.Node singleLinkList_Node1 = singleLinkList1.insertFromHead(0);
      singleLinkList0.printLinkList(singleLinkList_Node1);
      SingleLinkList.Node singleLinkList_Node2 = new SingleLinkList.Node(0);
      singleLinkList0.insertFromHead(0);
      singleLinkList0.getHead();
      SingleLinkList.Node singleLinkList_Node3 = singleLinkList1.reverseLinkList();
      assertEquals(0, singleLinkList_Node3.data);
      assertNotNull(singleLinkList_Node3);
      assertSame(singleLinkList_Node3, singleLinkList_Node0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SingleLinkList.Node singleLinkList_Node0 = new SingleLinkList.Node(1);
      SingleLinkList singleLinkList0 = new SingleLinkList();
      SingleLinkList.Node singleLinkList_Node1 = singleLinkList0.insertFromHead(1294);
      singleLinkList_Node0.next = singleLinkList_Node1;
      SingleLinkList singleLinkList1 = new SingleLinkList();
      singleLinkList1.reverseLinkList(singleLinkList_Node0);
      singleLinkList_Node1.next = singleLinkList0.head;
      singleLinkList1.insertFromHead(1294);
      // Undeclared exception!
      singleLinkList0.insertFromTail(1294);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SingleLinkList singleLinkList0 = new SingleLinkList();
      SingleLinkList.Node singleLinkList_Node0 = new SingleLinkList.Node((-1));
      SingleLinkList.Node singleLinkList_Node1 = singleLinkList0.reverseLinkList(singleLinkList_Node0);
      assertNotNull(singleLinkList_Node1);
      
      singleLinkList0.reverseLinkList();
      SingleLinkList singleLinkList1 = new SingleLinkList();
      singleLinkList0.printLinkList((SingleLinkList.Node) null);
      singleLinkList_Node0.next = null;
      singleLinkList1.getHead();
      singleLinkList0.reverseLinkList((SingleLinkList.Node) null);
      singleLinkList0.getHead();
      singleLinkList0.printLinkList(singleLinkList_Node1);
      singleLinkList1.reverseLinkList((SingleLinkList.Node) null);
      singleLinkList1.getHead();
      singleLinkList0.insertFromTail((-1));
      singleLinkList1.insertFromHead((-544));
      SingleLinkList.Node singleLinkList_Node2 = singleLinkList0.insertFromHead((-1));
      assertEquals((-1), singleLinkList_Node2.data);
      
      SingleLinkList.Node singleLinkList_Node3 = singleLinkList0.insertFromTail((-1135));
      assertEquals((-1), singleLinkList_Node3.data);
      assertNotSame(singleLinkList_Node3, singleLinkList_Node2);
  }
}
