import org.junit.jupiter.api.*;

import java.io.IOException;

public class Test2CSVPrinter {
    String name = 'first';
    int count = 0;
    second();
    @Test
    public void first() throws IOException{

        printDetails(name);
        second();
    }
    @BeforeAll
    public static void second() throws IOException{
        System.out.println("second");
        name = 'one';
        String count1 = getName(count,name);
        third();
    }
    @AfterAll
    public static void third() throws IOException{
        System.out.println("third");
        four();
    }
    @BeforeEach
    public void four() throws IOException{
        System.out.println("four");
        five();
    }
    @AfterEach
    public void five() throws IOException{
        System.out.println("fivve");
        six();
    }
    @Test
    public void six() throws IOException{
        System.out.println("six");
    }

    public void printDetails(string name){
        System.out.println(name+"です");
    }

    public int getName(int count,string name){

        //int countcheck = count %4;
        //boolean namecheck = False;
        //if (name == "one") {
        //    namecheck = True;
        //}
        if(count %4 == 0 && name== "one"){
            System.out.println("iine");
        }
        printDetalis(str(count))
        count +=1;
        return count;
    }
}
