package test.Factory;

import Factory.Connection;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.assertEquals;

/**
* ConnectionFactory Tester.
*
* @author <Authors name>
* @since <pre>May 7, 2017</pre>
* @version 1.0
*/
public class ConnectionFactoryTest {

@Before
public void before() throws Exception {
}

@After
public void after() throws Exception {
}

/**
*
* Method: create()
*
*/
@Test
public void testCreate() throws Exception {
    Connection aConnection = new Connection();
//    assertEquals(aConnection.getClass(), Connection);
}


}
