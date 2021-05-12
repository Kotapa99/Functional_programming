object cost{
	def main(arg: Array[String]){
		println("Cost for the books : " + balance(60))
	}
	def balance(n:Int): Double ={
		var bookprice = 24.95*60/100;
		var shipping1=0.0;
		if(n>=50){
			shipping1 = (50*3 + (n-50)*0.75);
		}else{
			shipping1 = n*3;
		}
		return (shipping1 + bookprice*n)
	}
}