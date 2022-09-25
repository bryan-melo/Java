package lab3;

public class Store {
	private float salesbyweek[][];

	public Store() {
		salesbyweek = new float[5][7];
	}

	// getter and setters
	public float[][] getSalesbyweek() {
		return salesbyweek;
	}

	public void setSalesbyweek(float[][] salesbyweek) {
		this.salesbyweek = salesbyweek;
	}

	public void setsaleforweekdayintersection(int week, int day, float sale) {
		salesbyweek[week][day] = sale;
	}
	
	public float[] getsalesforentireweek(int week) {
		return salesbyweek[week];
	}
	
	public float getsaleforweekdatintersection(int week, int day) {
		return salesbyweek[week][day];
	}

	public float totalSalesForWeek(int week) {
		
		float [] a = getsalesforentireweek(week);
		float total = 0;
		
		for (int i = 0; i < 7; i++) {			
			total += a[i];
		}
		return total;
	}
	
	public float avgSalesForWeek(int week) {
		return totalSalesForWeek(week) / 7;
	}
	
	public float totalSalesForAllWeeks() {
		float total = 0;
		for (int i = 0; i < 5; i++) {
				total += totalSalesForWeek(i);
		}
		return total;
	}
	
	public float averageWeeklySales() {
		return totalSalesForAllWeeks() / 7;
	}
	
	public int weekWithHighestSaleAmt() {
		float check = totalSalesForWeek(0);
		int highestWeek = 1;
		
		for(int i = 1; i < 5; i++) {
			if (check < totalSalesForWeek(i)) {
				check = totalSalesForWeek(i);
				highestWeek = i + 1;
			}
		}
		return highestWeek;
	}
	
	public int weekWithLowestSaleAmt() {
		float check = totalSalesForWeek(0);
		int lowestWeek = 1;
		
		for(int i = 1; i < 5; i++) {
			if (check > totalSalesForWeek(i)) {
				check = totalSalesForWeek(i);
				lowestWeek = i + 1;
			}
		}
		return lowestWeek;
	}

	public void printdata() {
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 7; j++)
			{
				System.out.print(salesbyweek[i][j] + " ");
			}
			System.out.println("");
		}
	}
	
	public void printValues(Franchise a2, int s, int x) {
		switch(x) {
		case 1:
			System.out.println("\n\nTotal Weekly sales\n");
			for (int i = 0; i < 5; i ++) {
				System.out.print("Week " + (i + 1) + ": $");
				System.out.printf("%.2f%n", a2.getStores(s).totalSalesForWeek(i));
			}
			break;
		case 2:
			System.out.println("\nAverage Daily Sales for Each Week:\n");
			for(int i = 0; i < 5; i++) {
				System.out.print("Week " + (i + 1) + ": $");
				System.out.printf("%.2f%n" , a2.getStores(s).avgSalesForWeek(i));
			}
			break;
		case 3:
			System.out.print("\nTotal Sales for all weeks: $");
			System.out.printf("%.2f%n" , a2.getStores(s).totalSalesForAllWeeks());	
			break;
		case 4:
			System.out.print("\nAverage Weekly Sales: $");
			System.out.printf("%.2f%n" , a2.getStores(s).averageWeeklySales());	
			break;
		case 5:
			System.out.print("\nWeek with the Highest Amount in Sales: ");
			System.out.println("Week " + a2.getStores(s).weekWithHighestSaleAmt());
			break;
		case 6:
			System.out.print("\nWeek with the Lowest Amount in Sales: ");
			System.out.println("Week " + a2.getStores(s).weekWithLowestSaleAmt());
			break;
		case 7:
			x = 1;
			while (x < 7) {
				a2.getStores(s).printValues(a2, s, x);
				x++;
			}
		}
	}
}

