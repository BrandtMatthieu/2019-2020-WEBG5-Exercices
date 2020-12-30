package webg5.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App 
{

	private static final Logger logger = LoggerFactory.getLogger(App.class.getName()); 

    public static void main( String[] args )
    {
		System.out.println( "Hello World!" );
		logger.info("Hello, ");
		logger.error("World!");
    }
}
