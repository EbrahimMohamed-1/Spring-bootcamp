
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main{
   public static void main(String [] args){

       // Will be handled later by inversion of control.
       //Shape rec1 = new Rectangle(4, 5);


      //Define the container
      ApplicationContext container = new ClassPathXmlApplicationContext("applicaitonContext.xml");
      Rectangle rectangle = container.getBean("rectangle", Rectangle.class);
      rectangle.getArea(4, 5);


   }
}
