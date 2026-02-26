package vistas;

class Intervalo {

    public Intervalo (double inicio, double fin)
    public Intervalo (double fin)
    public Intervalo ()
    public Intervalo (Intervalo intervalo)

    public double longitud()
    public void desplazar(double desplazamiento)
    public Intervalo desplazado(double desplazamiento)

    public boolean incluye(double punto)
    public boolean incluye(Intervalo intervalo)

    public boolean igual(Intervalo intervalo)
    public Intervalo interseccion(Intervalo intervalo)
    public boolean intersecta(Intervalo intervalo)   
    
    public void mostrar()
    public void editar()

    public Intervalo[] trozos(int numeroTrozos)
    public Intervalo union(Intervalo intervalo)
    public double puntoMedio();

}
