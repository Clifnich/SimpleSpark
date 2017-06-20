package com.puzhen.spark.Jun20Spark;

import static spark.Spark.get;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	get("/Hello", (req, res) -> "Hello World");
    }
}
