import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestStudent {
    private Student sFail,sC,sB,sA;

    @Before
    public void setUpClass(){
        sFail = new Student(1,"Karel", 20.0f);
        sC = new Student(2,"Petr", 40.0f);
        sB = new Student(3,"Pavel", 50.0f);
        sA = new Student(4,"Tomáš", 80.0f);
    }

    @Test
    public void testFailGrade(){
        Assert.assertEquals("fail", sFail.calculateGrade());
    }

    @Test
    public void testCGrade(){
        Assert.assertEquals("C", sC.calculateGrade());
    }

    @Test
    public void testBGrade(){
        Assert.assertEquals("B", sB.calculateGrade());
    }

    @Test
    public void testAGrade(){
        Assert.assertEquals("A", sA.calculateGrade());
    }
}