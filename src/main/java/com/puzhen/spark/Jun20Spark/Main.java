package com.puzhen.spark.Jun20Spark;

import static spark.Spark.*;

public class Main {

	public static void main(String[] args) {
		get("/Hello", (req, res) -> "Hello World");
	}
}
