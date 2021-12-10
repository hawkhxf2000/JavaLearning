import java.text.DecimalFormat;
import java.util.List;

import org.ejml.simple.SimpleMatrix;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat(".00");
		SimpleMatrix firstMatrix = new SimpleMatrix(
				  new double[][] {
				    new double[] {1, 5},
				    new double[] {2, 3},
				    new double[] {1,7}
				  }
				);
		
		SimpleMatrix secondMatrix = new SimpleMatrix(
				  new double[][] {
				    new double[] {2, 3, 5},
				    new double[] {1, 4, 6}
				  }
				);
		SimpleMatrix result = firstMatrix.mult(secondMatrix);
		System.out.println(result);
	}
	

}
