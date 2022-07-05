public class TempConverter{


		public static void main(String[] args){
			double celsiusTemp = 20;
			double farenheitTemp = 75.55;


			celsiusTemp = (celsiusTemp*1.8) + 32;

			farenheitTemp = (farenheitTemp - 32)/1.8;

			System.out.println(" Celsius -> Farenheit :: "+celsiusTemp);
			System.out.println(" Farenheit -> Celsius :: "+farenheitTemp);


		}



}