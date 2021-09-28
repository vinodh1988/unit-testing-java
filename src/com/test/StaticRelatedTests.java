package com.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.code.Group;
@TestMethodOrder(OrderAnnotation.class)
public class StaticRelatedTests {
    @Test
    @Order(1)
    public void testGroup() {
    	assertTrue(Group.getGroupCount()==0);
    }
    
    @Test
    @Order(2)
    public void  objectCount() {
    	
    	assertTrue(new Group().getGroupId()==1);
    	assertTrue(new Group().getGroupId()==2);
    	assertTrue(new Group().getGroupId()==3);
    	assertEquals(Group.getGroupCount(),3);
    }
}
