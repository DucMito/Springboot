package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(10, 5, 3, 12, 6, 7, 5, 3);

		//1. Duyệt numbers
		System.out.println("1. Duyệt qua numbers: ");
		numbers.forEach(n -> System.out.print(n + " "));
		System.out.println();

		//2. Tìm giá trị chẵn trong list
		System.out.println("2. Các số chẵn trong list: ");
		numbers.stream().filter(n -> n % 2 == 0).forEach(n -> System.out.print(n +" "));
		System.out.println();

		//3. Tìm các giá trị > 5 trong list
		System.out.println("3. Tìm các giá trị > 5 trong list:");
		numbers.stream().filter(n -> n > 5).forEach(n -> System.out.print(n + " "));
		System.out.println();

		// 4. Tìm giá trị max trong list
		System.out.println("4. Tìm giá trị max trong list:");
		OptionalInt max = numbers.stream().mapToInt(n -> n).max();
		max.ifPresent(n -> System.out.println(n + " "));

		//5. Tìm giá trị nhỏ nhất
		System.out.println("5. Tìm giá trị nhỏ nhất");
		OptionalInt min = numbers.stream().mapToInt(n -> n).min();
		min.ifPresent(n -> System.out.println(n + " "));

		//6. Tính tổng


	}




}
