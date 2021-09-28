package com.test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.code.Group;

public class StaticRelatedTests {
    @Test
    public void testGroup() {
    	assertTrue(Group.getGroupCount()==0);
    }
}
