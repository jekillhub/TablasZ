package com.mycompany.tablasz;

public class Operador {

    public int[][] matriz;

    //operacion suma = 1, operacion multiplicacion = 2 
    public Operador(int tamano, int operacion) {

        this.matriz = new int[tamano][tamano];
        seleccion(operacion);

    }

    public void seleccion(int operacion) {

        if (operacion == 1) {

            suma();
        }

        if (operacion == 2) {

            multiplicacion();

        }

    }

    public void suma() {

        for (int i = 0; i < this.matriz.length; i++) {

            for (int j = 0; j < this.matriz.length; j++) {

                this.matriz[i][j] = (i + j) % (this.matriz.length);

            }

        }

    }

    public void multiplicacion() {

        for (int i = 0; i < this.matriz.length; i++) {

            for (int j = 0; j < this.matriz.length; j++) {

                this.matriz[i][j] = (i * j) % (this.matriz.length);

            }

        }

    }

}
