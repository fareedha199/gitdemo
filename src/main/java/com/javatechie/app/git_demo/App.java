package com.javatechie.app.git_demo;

/**
 * Hello world!
 *
 */
public class App 
{
	public void addData(String data) {
		System.out.println("This data "+ data) ;
		if(data.equals(Constant.DATA_TYPE)) {
			System.out.println("Welcome") ;
			}
		else {
			System.out.println(CommonUtil.DATA_TYPE2) ;
		}
		}

	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
