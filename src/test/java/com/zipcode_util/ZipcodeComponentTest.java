package com.zipcode_util;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class ZipcodeComponentTest extends TestCase
{

	private ZipcodeComponent zipcodeCriteria;

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public ZipcodeComponentTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( ZipcodeComponentTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testZipcodeComponent1()
    {
    	zipcodeCriteria = new ZipcodeComponent();
        // Sum of cities should be 21
        assert 21 == zipcodeCriteria.listCities().length;
    }

    /**
     * Rigourous Test :-)
     */
    public void testZipcodeComponent()
    {
    	zipcodeCriteria = new ZipcodeComponent();
        // Sum of cities should be 21
        assert 21 == zipcodeCriteria.listCities().length;

        // Test index of each city
        assert true == zipcodeCriteria.getCityName(0).equals("台北市");
        assert true == zipcodeCriteria.getCityName(1).equals("基隆市");
        assert true == zipcodeCriteria.getCityName(2).equals("新北市");
        assert true == zipcodeCriteria.getCityName(3).equals("宜蘭縣");
        assert true == zipcodeCriteria.getCityName(4).equals("桃園縣");
        assert true == zipcodeCriteria.getCityName(5).equals("新竹市");
        assert true == zipcodeCriteria.getCityName(6).equals("新竹縣");
        assert true == zipcodeCriteria.getCityName(7).equals("苗栗縣");
        assert true == zipcodeCriteria.getCityName(8).equals("台中市");
        assert true == zipcodeCriteria.getCityName(9).equals("彰化縣");
        assert true == zipcodeCriteria.getCityName(10).equals("南投縣");
        assert true == zipcodeCriteria.getCityName(11).equals("雲林縣");
        assert true == zipcodeCriteria.getCityName(12).equals("嘉義市");
        assert true == zipcodeCriteria.getCityName(13).equals("嘉義縣");
        assert true == zipcodeCriteria.getCityName(14).equals("台南市");
        assert true == zipcodeCriteria.getCityName(15).equals("高雄市");
        assert true == zipcodeCriteria.getCityName(16).equals("澎湖縣");
        assert true == zipcodeCriteria.getCityName(17).equals("屏東縣");
        assert true == zipcodeCriteria.getCityName(18).equals("台東縣");
        assert true == zipcodeCriteria.getCityName(19).equals("花蓮縣");
        assert true == zipcodeCriteria.getCityName(20).equals("金門連江");
    }

}
