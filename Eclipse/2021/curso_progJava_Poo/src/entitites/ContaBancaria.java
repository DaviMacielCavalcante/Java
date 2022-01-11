package entitites;

public class ContaBancaria {		
		
		public String name;
		private int accNumb;
		private double accSal;		

		public ContaBancaria(String name, int accNumb) {
			this.accNumb = accNumb;
			this.name = name;			
		}		
		
		public ContaBancaria(String name, int accNumb, double accSal) {
			this.accNumb = accNumb;
			this.name = name;
			depoSal(accSal);
		}		
		
		public void setAccNumb(int accNumb) {
			this.accNumb = accNumb;
		}
		public int getAccNumb() {
			return accNumb;
		}
		
		public void setAccSal(double accSal) {
			this.accSal = accSal;
		}
		
		public void depoSal (double accSal) {
			this.accSal += accSal;
		}
		
		public void saqSal (double accSal) {
			this.accSal -= (accSal + 5.00);
		}		
		
		public String toString() {
			return
					"Account "
					+ accNumb
					+ ", Holder: "
					+ name
					+ ", Balance: $ "
					+ String.format ("%.2f%n", accSal);
		}
}
