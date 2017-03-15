package com.bovespa;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) throws IOException {
		
		
		Stock[] stocks = new Stock[20];
		
		Stream<String> lines = Files.lines(Paths.get("Z:\\COTAHIST_A2016_TEST.txt"));
		
		lines.forEach(line -> {
			
			if (line.startsWith("01")){
			
			Stock stock = new Stock();
			stock.setCode(line.substring(12, 23).trim());
			
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
			stock.setDate(LocalDate.parse(line.substring(2, 10), formatter));
			
			
			System.out.println(line.substring(2, 10).trim());
			}
		});

	}

}
