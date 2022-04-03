package world;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class testTriangolo {

	private Triangulo escaleno;
	private Triangulo t;
	private Triangulo isosceles;
	private Triangulo isosceles2;
	private Triangulo isosceles3;
	private Triangulo equilataro;
	private Triangulo notriangolo;
	private Triangulo notriangolo2;
	private Triangulo notriangolo3;
	private Triangulo notriangolo4;

	
	@Before
	public void setUp() {
		this.escaleno = new Triangulo(6,5,10);
		this.t = new Triangulo();
		this.isosceles = new Triangulo(4,4,5);
		//this.isosceles2 = new Triangulo(2,3,3);
		//this.isosceles3 = new Triangulo(2,3,2);
		this.equilataro = new Triangulo(3,3,3);
		this.notriangolo = new Triangulo (4,3,0);
		//this.notriangolo2 = new Triangulo (0,4,3);
		//this.notriangolo3 = new Triangulo (0,3,4);
		this.notriangolo4 = new Triangulo(7,2,3);
		
	}
	@Test
	public void testescaleno1() {
		int resultscaleno = this.checktriangle(escaleno);
		assertEquals(3,resultscaleno);
	}
	
	
	
	@Test
	public void testisosceles() {
		int resultisosceles =  this.checktriangle(isosceles);
		assertEquals(2, resultisosceles);
	}
	
	/*@Test
	public void testisosceles2() {
		int resultisosceles =  this.checktriangle(isosceles2);
		assertEquals(2, resultisosceles);
	}
	*/
	/*
	@Test
	public void testisosceles3() {
		int resultisosceles =  this.checktriangle(isosceles3);
		assertEquals(2, resultisosceles);
	}*/
	@Test
	public void testequilatero() {
		int resultequilatero =  this.checktriangle(equilataro);
		assertEquals(1, resultequilatero);
	}

     @Test
    public void testnotriangolo() {
	int resultnotriangolo =  this.checktriangle(notriangolo);
	assertEquals(0, resultnotriangolo);
}
     /*
     @Test
     public void testnotriangolo2() {
 	int resultnotriangolo =  this.checktriangle(notriangolo2);
 	assertEquals(0, resultnotriangolo);
 }
     
     @Test
     public void testnotriangolo3() {
 	int resultnotriangolo =  this.checktriangle(notriangolo3);
 	assertEquals(0, resultnotriangolo);
 }
 */
     @Test
 	public void testnotriangolo4() {
 		int resultscaleno = this.checktriangle(notriangolo4);
 		assertEquals(0,resultscaleno);
 	}
	
	public  int checktriangle(Triangulo t) 
	{
		if ((t.getLato3() < t.getLato1() + t.getLato2()) 
				&& (t.getLato2() < t.getLato1() + t.getLato3()) 
				&& (t.getLato1() < t.getLato2() + t.getLato3()))
		{
			if (t.getLato1() == t.getLato2() && t.getLato1() == t.getLato3())
			{
				System.out.println("Triangulo equilatero \n");
				return 1;
			}
			/*
			 * 2 3 2
			 */
			else if (t.getLato1() == t.getLato2() || t.getLato2() == t.getLato3())
					
					//|| t.getLato1()==t.getLato3())
			{System.out.println("Triangulo isosceles \n");
			return 2;
			}
			else
			{System.out.println("Triangulo escaleno \n");
			return 3;
			}
		}
		else
		{System.out.println("No es un triangulo \n");}
		return 0;
	}
	
	
	}
	

	
	
	
	


