import org.junit.Assert;
// import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

  /** Alexis Frison-1210-003.
  * 10/25/19 */
public class CustomerTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** A test that always fails.
   @Test public void defaultTest() {
      Assert.assertEquals("Default test added by jGRASP. Delete "
            + "this test once you have added your own.", 0, 1);
   } **/
   
   /** Test for setLocation. */
   @Test public void setLocationTest1()
   {
      Customer cstmr = new Customer("Lane, Jane");
      cstmr.setLocation("Boston, MA");
      Assert.assertEquals("Boston, MA", cstmr.getLocation());
   }
   
   /** Test2 for setLocation. */
   @Test public void setLocationTest2()
   {
      Customer cstmr = new Customer("Lane, Jane");
      cstmr.setLocation("Atlanta, GA");
      Assert.assertEquals("Atlanta, GA", cstmr.getLocation());
   }
   
   /** Test for changeBalanceTest. */
   @Test public void changeBalanceTest()
   {
      Customer cstmr = new Customer("Lane, Jane");
      cstmr.changeBalance(100);
      Assert.assertEquals(100, cstmr.getBalance(), 0.000001);
   }
   
   /** Test for toString. */
   @Test public void toStringTest()
   {
      Customer cstmr = new Customer("Lane, Jane");
      cstmr.setLocation("Auburn, AL");
      cstmr.changeBalance(999);
      Assert.assertEquals("Lane, Jane\nAuburn, AL\n$999.0", cstmr.toString());
   }
   
   /** Test1 for compareTo. */
   @Test public void compareToTest1()
   {
      Customer cstmr1 = new Customer("Lane, Jane");
      cstmr1.changeBalance(500);
      
      Customer cstmr2 = new Customer("Lane, Louis");
      cstmr2.changeBalance(500);
      
      Assert.assertTrue(cstmr1.compareTo(cstmr2) == 0);
   }
   
   /** Test2 for compareTo. */
   @Test public void compareToTest2()
   {
      Customer cstmr1 = new Customer("Lane, Jane");
      cstmr1.changeBalance(100);
      
      Customer cstmr2 = new Customer("Lane, Louis");
      cstmr2.changeBalance(500);
      
      Assert.assertTrue(cstmr1.compareTo(cstmr2) < 0);
   }
   
   /** Test3 for compareTo. */
   @Test public void compareToTest3()
   {
      Customer cstmr1 = new Customer("Lane, Jane");
      cstmr1.changeBalance(1000);
      
      Customer cstmr2 = new Customer("Lane, Louis");
      cstmr2.changeBalance(500);
      
      Assert.assertTrue(cstmr1.compareTo(cstmr2) > 0);
   }
}
