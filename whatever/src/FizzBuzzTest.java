import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void เลขหนึ่งต้องได้ค่าเป็นหนึ่ง() {
            FizzBuzz fz = new FizzBuzz();
            String result = fz.sendAndReturn(1);
            assertEquals("1", result);
    }
    
    @Test
    public void เลขสองต้องได้ค่าเป็นสอง() {
            FizzBuzz fz = new FizzBuzz();
            String result = fz.sendAndReturn(2);
            assertEquals("2", result);
    }
    
    @Test
    public void เลขสามต้องได้ค่าเป็นFizz() {
            FizzBuzz fz = new FizzBuzz();
            String result = fz.sendAndReturn(3);
            assertEquals("Fizz", result);
    }
    
    @Test
    public void เลขสี่ต้องได้ค่าเป็นสี่() {
            FizzBuzz fz = new FizzBuzz();
            String result = fz.sendAndReturn(4);
            assertEquals("4", result);
    }
    @Test
    public void เลขห้าต้องได้ค่าเป็นห้า() {
            FizzBuzz fz = new FizzBuzz();
            String result = fz.sendAndReturn(5);
            assertEquals("Buzz", result);
    }
    @Test
    public void เลขหกต้องได้ค่าเป็นFizz() {
            FizzBuzz fz = new FizzBuzz();
            String result = fz.sendAndReturn(6);
            assertEquals("Fizz", result);
    }
    @Test
    public void เลขเจ็ดต้องได้ค่าเป็นเจ็ด() {
            FizzBuzz fz = new FizzBuzz();
            String result = fz.sendAndReturn(7);
            assertEquals("7", result);
    }
    
    @Test
    public void เลขแปดต้องได้ค่าเป็นแปด() {
            FizzBuzz fz = new FizzBuzz();
            String result = fz.sendAndReturn(8);
            assertEquals("8", result);
    }
    @Test
    public void เลขเก้าต้องได้ค่าเป็นFizz() {
            FizzBuzz fz = new FizzBuzz();
            String result = fz.sendAndReturn(9);
            assertEquals("Fizz", result);
    }
    @Test
    public void เลขสิบต้องได้ค่าเป็นBuzz() {
            FizzBuzz fz = new FizzBuzz();
            String result = fz.sendAndReturn(10);
            assertEquals("Buzz", result);
    }
    @Test
    public void เลขสิบเอ็ดต้องได้ค่าเป็นสิบเอ็ด() {
            FizzBuzz fz = new FizzBuzz();
            String result = fz.sendAndReturn(11);
            assertEquals("11", result);
    }
    @Test
    public void เลขสิบสองต้องได้ค่าเป็นFizz() {
            FizzBuzz fz = new FizzBuzz();
            String result = fz.sendAndReturn(12);
            assertEquals("Fizz", result);
    }
    @Test
    public void เลขสิบสามต้องได้ค่าเป็นสิบสาม() {
            FizzBuzz fz = new FizzBuzz();
            String result = fz.sendAndReturn(13);
            assertEquals("13", result);
    }
    @Test
    public void เลขสิบสี่ต้องได้ค่าเป็นสิบสี่() {
            FizzBuzz fz = new FizzBuzz();
            String result = fz.sendAndReturn(14);
            assertEquals("14", result);
    }
    @Test
    public void เลขสิบห้าต้องได้ค่าเป็นFizzBuzz() {
            FizzBuzz fz = new FizzBuzz();
            String result = fz.sendAndReturn(15);
            assertEquals("FizzBuzz", result);
    }
    @Test
    public void เลขสิบหกต้องได้ค่าเป็นสิบหก() {
            FizzBuzz fz = new FizzBuzz();
            String result = fz.sendAndReturn(16);
            assertEquals("16", result);
    }
}
