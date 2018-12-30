import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.springproject.courseapi.serviceImpl.ExpenseServiceImpl;

/**
 * 
 */

/**
 * @author vinayak
 *
 */
public class TestExpense {
	
	@Autowired
	ExpenseServiceImpl expenseServiceImpl = new ExpenseServiceImpl();
	
	@Test
	public void testExpense() {
		System.out.println(expenseServiceImpl);
		expenseServiceImpl.getexpensebyemaillist("3");
		//assertEquals("success", "success");
	}
	
	

}
