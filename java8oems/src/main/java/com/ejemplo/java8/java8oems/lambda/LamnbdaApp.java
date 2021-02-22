package com.ejemplo.java8.java8oems.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LamnbdaApp {

	public void ordenar() {
		List<String> lista = new ArrayList<>();
		lista.add("oems");
		lista.add("oems1");
		lista.add("oems2");
//
//		Collections.sort(lista, new Comparator<String>() {
//			@Override
//			public int compare(String o1, String o2) {
//				return o1.compareTo(o2);
//			}
//		});

		Collections.sort(lista, (String p1, String p2) -> p1.compareTo(p2));

		for (String elemento : lista) {
			System.out.println(elemento);
		}

	}

	public void calcular() {

//		Operacion operacion = new Operacion() {
//
//			@Override
//			public double calculaPromedio(double n1, double n2) {
//				//
//				return (n1 + n2) / 2;
//			}
//		};
//		System.out.println(operacion.calculaPromedio(2, 3));

		Operacion operacion = ( x,  y) -> (x + y) / 2;
		System.out.println(operacion.calculaPromedio(2, 3));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LamnbdaApp app = new LamnbdaApp();
//		app.ordenar();
		app.calcular();
	}

}
