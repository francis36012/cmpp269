package com.fagyapong.cmpp269.midtermpractices;

import java.util.Scanner;

public class GasSales {

	public static void main(String[] args) {

		double regGasPrice = 112.9;
		double dieselPrice = 107.9;
		double litresSold = 0;
		long saleTotal = 0;

		double stationGasLitres = 0;
		double stationDieselLitres = 0;
		long stationGasSaleTotal = 0;
		long stationDieselSaleTotal = 0;
		double stationLitresTotal = 0;
		long stationSaleTotal = 0;

		int typeOfSale;
		Scanner input = new Scanner(System.in);

		System.out
				.printf("Enter  type of sale (1=Regular, 2=Diesel, 0=exit): ");
		typeOfSale = input.nextInt();
		do {
			System.out.printf("How many litres? ");
			litresSold = input.nextDouble();

			switch (typeOfSale) {
			case 1:
				saleTotal = (long) Math.round(litresSold * regGasPrice);
				stationGasLitres += litresSold;
				stationGasSaleTotal += saleTotal;

				System.out.printf("Regular Gas\n");
				System.out.printf("Litres Sold = %.1f\n", litresSold);
				System.out.printf("Sale total $%.2f\n", saleTotal / 100.0);
				break;
			case 2:
				saleTotal = (long) Math.round(litresSold * dieselPrice);
				stationDieselLitres += litresSold;
				stationDieselSaleTotal += saleTotal;

				System.out.printf("Diesel\n");
				System.out.printf("Litres Sold = %.1f\n", litresSold);
				System.out.printf("Sale total $%.2f\n", saleTotal / 100.0);
				break;
			default:
				System.out.printf("Error: invalid fuel type\n");
				break;
			}

			System.out
					.printf("Enter  type of sale (1=Regular, 2=Diesel, 0=exit): ");
			typeOfSale = input.nextInt();

		} while (typeOfSale != 0);

		stationLitresTotal = stationGasLitres + stationDieselLitres;
		stationSaleTotal = stationGasSaleTotal + stationDieselSaleTotal;

		System.out.printf("\nStation Totals\n");
		System.out.printf("%10s%10s%10s\n", "Type", "Litres", "Total");
		System.out.printf("%10s%10.1f%10.2f\n", "Regular", stationGasLitres,
				stationGasSaleTotal / 100.0);
		System.out.printf("%10s%10.1f%10.2f\n", "Diesel", stationDieselLitres,
				stationDieselSaleTotal / 100.0);
		System.out.printf("%10s%10.1f%10.2f\n", "Total", stationLitresTotal,
				stationSaleTotal / 100.0);

		input.close();
	}
}