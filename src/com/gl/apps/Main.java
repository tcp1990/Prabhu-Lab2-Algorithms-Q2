package com.gl.apps;

import java.util.Scanner;
import com.gl.services.MergeSort;
import com.gl.services.TravellerTransactions;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How many currency denominations ");
		int  noOfDenominations = scan.nextInt();
		int denominations[] = new int[noOfDenominations];
		TravellerTransactions tpay = new TravellerTransactions();
		tpay.getDenominations(denominations);
		
		//sort the denominations using merge sort
		MergeSort mergeSort = new MergeSort();
		mergeSort.sortDsc(denominations, 0, denominations.length -1);
		
		System.out.println("Enter the amount you want to pay ");
		int amountToPay = scan.nextInt();
		
		tpay.denominationsToPay(denominations, amountToPay);
		scan.close();
	}

}
