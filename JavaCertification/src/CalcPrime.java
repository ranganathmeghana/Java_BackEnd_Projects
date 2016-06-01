import java.util.ArrayList;


public class CalcPrime {

	public static void main(String[] args) {

		String number=request.getParameter("number");
		int n=Integer.parseInt(number);
		int counter=0;
		//boolean isPrime=false;
		String message;

		ArrayList<Integer> ar= new ArrayList<Integer>();
		StringBuilder sb = new StringBuilder();

		n=n+1;

		do{
			for(int i=2;i<=n;i++){
				if(n%i==0){
					//isPrime=false;
				}
				else
				{

					ar.add(n);
					counter++;
				}

			}
			n++;
		}while(counter<5);

		for(int i:ar){
			sb.append(String.valueOf(i));
			}
		message= sb.toString();
		
		request.setAttribute("msg", message);
		request.getRequestDispatcher("/Welcome.jsp").forward(request, response);

	}

}
